import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
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
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkb<R> implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Sections";
   private final djw d;
   private final Long2ObjectMap<Optional<R>> e = new Long2ObjectOpenHashMap();
   private final LongLinkedOpenHashSet f = new LongLinkedOpenHashSet();
   private final Function<Runnable, Codec<R>> g;
   private final Function<Runnable, R> h;
   private final DataFixer i;
   private final aun j;
   private final ip k;
   protected final cru c;

   public dkb(Path $$0, Function<Runnable, Codec<R>> $$1, Function<Runnable, R> $$2, DataFixer $$3, aun $$4, boolean $$5, ip $$6, cru $$7) {
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$6;
      this.c = $$7;
      this.d = new djw($$0, $$5, $$0.getFileName().toString());
   }

   protected void a(BooleanSupplier $$0) {
      while (this.a() && $$0.getAsBoolean()) {
         cqz $$1 = iu.a(this.f.firstLong()).r();
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
            this.b(iu.a($$0).r());
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
      int $$1 = iu.c(iu.c($$0));
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

   private void b(cqz $$0) {
      Optional<rz> $$1 = this.c($$0).join();
      age<sw> $$2 = age.a(sn.a, this.k);
      this.a($$0, $$2, $$1.orElse(null));
   }

   private CompletableFuture<Optional<rz>> c(cqz $$0) {
      return this.d.a($$0).exceptionally($$1 -> {
         if ($$1 instanceof IOException $$2) {
            a.error("Error reading chunk {} data from disk", $$0, $$2);
            return Optional.empty();
         } else {
            throw new CompletionException($$1);
         }
      });
   }

   private <T> void a(cqz $$0, DynamicOps<T> $$1, @Nullable T $$2) {
      if ($$2 == null) {
         for (int $$3 = this.c.al(); $$3 < this.c.am(); $$3++) {
            this.e.put(a($$0, $$3), Optional.empty());
         }
      } else {
         Dynamic<T> $$4 = new Dynamic($$1, $$2);
         int $$5 = a($$4);
         int $$6 = aa.b().d().c();
         boolean $$7 = $$5 != $$6;
         Dynamic<T> $$8 = this.j.a(this.i, $$4, $$5, $$6);
         OptionalDynamic<T> $$9 = $$8.get("Sections");

         for (int $$10 = this.c.al(); $$10 < this.c.am(); $$10++) {
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

   private void d(cqz $$0) {
      age<sw> $$1 = age.a(sn.a, this.k);
      Dynamic<sw> $$2 = this.a($$0, $$1);
      sw $$3 = (sw)$$2.getValue();
      if ($$3 instanceof rz) {
         this.d.a($$0, (rz)$$3);
      } else {
         a.error("Expected compound tag, got {}", $$3);
      }
   }

   private <T> Dynamic<T> a(cqz $$0, DynamicOps<T> $$1) {
      Map<T, T> $$2 = Maps.newHashMap();

      for (int $$3 = this.c.al(); $$3 < this.c.am(); $$3++) {
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

   private static long a(cqz $$0, int $$1) {
      return iu.b($$0.e, $$1, $$0.f);
   }

   protected void b(long $$0) {
   }

   protected void a(long $$0) {
      Optional<R> $$1 = (Optional<R>)this.e.get($$0);
      if ($$1 != null && !$$1.isEmpty()) {
         this.f.add($$0);
      } else {
         a.warn("No data for position: {}", iu.a($$0));
      }
   }

   private static int a(Dynamic<?> $$0) {
      return $$0.get("DataVersion").asInt(1945);
   }

   public void a(cqz $$0) {
      if (this.a()) {
         for (int $$1 = this.c.al(); $$1 < this.c.am(); $$1++) {
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
