import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwa<R> implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Sections";
   private final dwb d;
   private final Long2ObjectMap<Optional<R>> e = new Long2ObjectOpenHashMap();
   private final LongLinkedOpenHashSet f = new LongLinkedOpenHashSet();
   private final Function<Runnable, Codec<R>> g;
   private final Function<Runnable, R> h;
   private final jx i;
   protected final dch c;

   public dwa(dwb $$0, Function<Runnable, Codec<R>> $$1, Function<Runnable, R> $$2, jx $$3, dch $$4) {
      this.d = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.c = $$4;
   }

   protected void a(BooleanSupplier $$0) {
      while (this.a() && $$0.getAsBoolean()) {
         dbm $$1 = kc.a(this.f.firstLong()).r();
         this.d($$1);
      }
   }

   public boolean a() {
      return !this.f.isEmpty();
   }

   @Nullable
   protected Optional<R> c(long $$0) {
      return (Optional<R>)this.e.get($$0);
   }

   protected Optional<R> d(long $$0) {
      if (this.e($$0)) {
         return Optional.empty();
      } else {
         Optional<R> $$1 = this.c($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            this.b(kc.a($$0).r());
            $$1 = this.c($$0);
            if ($$1 == null) {
               throw (IllegalStateException)ac.b(new IllegalStateException());
            } else {
               return $$1;
            }
         }
      }
   }

   protected boolean e(long $$0) {
      int $$1 = kc.c(kc.c($$0));
      return this.c.d($$1);
   }

   protected R f(long $$0) {
      if (this.e($$0)) {
         throw (IllegalArgumentException)ac.b(new IllegalArgumentException("sectionPos out of bounds"));
      } else {
         Optional<R> $$1 = this.d($$0);
         if ($$1.isPresent()) {
            return $$1.get();
         } else {
            R $$2 = this.h.apply(() -> this.a($$0));
            this.e.put($$0, Optional.of($$2));
            return $$2;
         }
      }
   }

   private void b(dbm $$0) {
      Optional<tx> $$1 = this.c($$0).join();
      aki<uu> $$2 = this.i.a(ul.a);
      this.a($$0, $$2, $$1.orElse(null));
   }

   private CompletableFuture<Optional<tx>> c(dbm $$0) {
      return this.d.a($$0).exceptionally($$1 -> {
         if ($$1 instanceof IOException $$2) {
            a.error("Error reading chunk {} data from disk", $$0, $$2);
            return Optional.empty();
         } else {
            throw new CompletionException($$1);
         }
      });
   }

   private void a(dbm $$0, aki<uu> $$1, @Nullable tx $$2) {
      if ($$2 == null) {
         for (int $$3 = this.c.ao(); $$3 < this.c.ap(); $$3++) {
            this.e.put(a($$0, $$3), Optional.empty());
         }
      } else {
         Dynamic<uu> $$4 = new Dynamic($$1, $$2);
         int $$5 = a($$4);
         int $$6 = aa.b().d().c();
         boolean $$7 = $$5 != $$6;
         Dynamic<uu> $$8 = this.d.a($$4, $$5);
         OptionalDynamic<uu> $$9 = $$8.get("Sections");

         for (int $$10 = this.c.ao(); $$10 < this.c.ap(); $$10++) {
            long $$11 = a($$0, $$10);
            Optional<R> $$12 = $$9.get(Integer.toString($$10)).result().flatMap($$1x -> this.g.apply(() -> this.a($$11)).parse($$1x).resultOrPartial(a::error));
            this.e.put($$11, $$12);
            $$12.ifPresent($$2x -> {
               this.b($$11);
               if ($$7) {
                  this.a($$11);
               }
            });
         }
      }
   }

   private void d(dbm $$0) {
      aki<uu> $$1 = this.i.a(ul.a);
      Dynamic<uu> $$2 = this.a($$0, $$1);
      uu $$3 = (uu)$$2.getValue();
      if ($$3 instanceof tx) {
         this.d.a($$0, (tx)$$3);
      } else {
         a.error("Expected compound tag, got {}", $$3);
      }
   }

   private <T> Dynamic<T> a(dbm $$0, DynamicOps<T> $$1) {
      Map<T, T> $$2 = Maps.newHashMap();

      for (int $$3 = this.c.ao(); $$3 < this.c.ap(); $$3++) {
         long $$4 = a($$0, $$3);
         this.f.remove($$4);
         Optional<R> $$5 = (Optional<R>)this.e.get($$4);
         if ($$5 != null && !$$5.isEmpty()) {
            DataResult<T> $$6 = this.g.apply(() -> this.a($$4)).encodeStart($$1, $$5.get());
            String $$7 = Integer.toString($$3);
            $$6.resultOrPartial(a::error).ifPresent($$3x -> $$2.put((T)$$1.createString($$7), (T)$$3x));
         }
      }

      return new Dynamic(
         $$1, $$1.createMap(ImmutableMap.of($$1.createString("Sections"), $$1.createMap($$2), $$1.createString("DataVersion"), $$1.createInt(aa.b().d().c())))
      );
   }

   private static long a(dbm $$0, int $$1) {
      return kc.b($$0.e, $$1, $$0.f);
   }

   protected void b(long $$0) {
   }

   protected void a(long $$0) {
      Optional<R> $$1 = (Optional<R>)this.e.get($$0);
      if ($$1 != null && !$$1.isEmpty()) {
         this.f.add($$0);
      } else {
         a.warn("No data for position: {}", kc.a($$0));
      }
   }

   private static int a(Dynamic<?> $$0) {
      return $$0.get("DataVersion").asInt(1945);
   }

   public void a(dbm $$0) {
      if (this.a()) {
         for (int $$1 = this.c.ao(); $$1 < this.c.ap(); $$1++) {
            long $$2 = a($$0, $$1);
            if (this.f.contains($$2)) {
               this.d($$0);
               return;
            }
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.d.close();
   }
}
