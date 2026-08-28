import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class edq<R, P> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "Sections";
   private final eds d;
   private final Long2ObjectMap<Optional<R>> e = new Long2ObjectOpenHashMap();
   private final LongLinkedOpenHashSet f = new LongLinkedOpenHashSet();
   private final Codec<P> g;
   private final Function<R, P> h;
   private final BiFunction<P, Runnable, R> i;
   private final Function<Runnable, R> j;
   private final js k;
   private final ede l;
   protected final dix c;
   private final LongSet m = new LongOpenHashSet();
   private final Long2ObjectMap<CompletableFuture<Optional<edq.a<P>>>> n = new Long2ObjectOpenHashMap();
   private final Object o = new Object();

   public edq(eds $$0, Codec<P> $$1, Function<R, P> $$2, BiFunction<P, Runnable, R> $$3, Function<Runnable, R> $$4, js $$5, ede $$6, dix $$7) {
      this.d = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.c = $$7;
   }

   protected void a(BooleanSupplier $$0) {
      LongIterator $$1 = this.f.iterator();

      while ($$1.hasNext() && $$0.getAsBoolean()) {
         dic $$2 = new dic($$1.nextLong());
         $$1.remove();
         this.e($$2);
      }

      this.c();
   }

   private void c() {
      synchronized (this.o) {
         Iterator<Entry<CompletableFuture<Optional<edq.a<P>>>>> $$0 = Long2ObjectMaps.fastIterator(this.n);

         while ($$0.hasNext()) {
            Entry<CompletableFuture<Optional<edq.a<P>>>> $$1 = $$0.next();
            Optional<edq.a<P>> $$2 = (Optional<edq.a<P>>)((CompletableFuture)$$1.getValue()).getNow(null);
            if ($$2 != null) {
               long $$3 = $$1.getLongKey();
               this.a(new dic($$3), $$2.orElse(null));
               $$0.remove();
               this.m.add($$3);
            }
         }
      }
   }

   public void a() {
      if (!this.f.isEmpty()) {
         this.f.forEach($$0 -> this.e(new dic($$0)));
         this.f.clear();
      }
   }

   public boolean b() {
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
            this.c(jx.a($$0).r());
            $$1 = this.c($$0);
            if ($$1 == null) {
               throw (IllegalStateException)af.b(new IllegalStateException());
            } else {
               return $$1;
            }
         }
      }
   }

   protected boolean e(long $$0) {
      int $$1 = jx.c(jx.c($$0));
      return this.c.e($$1);
   }

   protected R f(long $$0) {
      if (this.e($$0)) {
         throw (IllegalArgumentException)af.b(new IllegalArgumentException("sectionPos out of bounds"));
      } else {
         Optional<R> $$1 = this.d($$0);
         if ($$1.isPresent()) {
            return $$1.get();
         } else {
            R $$2 = this.j.apply(() -> this.a($$0));
            this.e.put($$0, Optional.of($$2));
            return $$2;
         }
      }
   }

   public CompletableFuture<?> a(dic $$0) {
      synchronized (this.o) {
         long $$1 = $$0.a();
         return this.m.contains($$1) ? CompletableFuture.completedFuture(null) : (CompletableFuture)this.n.computeIfAbsent($$1, $$1x -> this.d($$0));
      }
   }

   private void c(dic $$0) {
      long $$1 = $$0.a();
      CompletableFuture<Optional<edq.a<P>>> $$2;
      synchronized (this.o) {
         if (!this.m.add($$1)) {
            return;
         }

         $$2 = (CompletableFuture<Optional<edq.a<P>>>)this.n.computeIfAbsent($$1, $$1x -> this.d($$0));
      }

      this.a($$0, $$2.join().orElse(null));
      synchronized (this.o) {
         this.n.remove($$1);
      }
   }

   private CompletableFuture<Optional<edq.a<P>>> d(dic $$0) {
      ale<uw> $$1 = this.k.a(un.a);
      return this.d
         .a($$0)
         .thenApplyAsync($$1x -> $$1x.map($$1xx -> edq.a.a(this.g, $$1, $$1xx, this.d, this.c)), af.h().a("parseSection"))
         .exceptionally($$1x -> {
            if ($$1x instanceof CompletionException) {
               $$1x = $$1x.getCause();
            }

            if ($$1x instanceof IOException $$2) {
               a.error("Error reading chunk {} data from disk", $$0, $$2);
               this.l.a($$2, this.d.a(), $$0);
               return Optional.empty();
            } else {
               throw new CompletionException($$1x);
            }
         });
   }

   private void a(dic $$0, @Nullable edq.a<P> $$1) {
      if ($$1 == null) {
         for (int $$2 = this.c.aq(); $$2 <= this.c.ar(); $$2++) {
            this.e.put(a($$0, $$2), Optional.empty());
         }
      } else {
         boolean $$3 = $$1.b();

         for (int $$4 = this.c.aq(); $$4 <= this.c.ar(); $$4++) {
            long $$5 = a($$0, $$4);
            Optional<R> $$6 = Optional.ofNullable($$1.a.get($$4)).map($$1x -> this.i.apply((P)$$1x, () -> this.a($$5)));
            this.e.put($$5, $$6);
            $$6.ifPresent($$2 -> {
               this.b($$5);
               if ($$3) {
                  this.a($$5);
               }
            });
         }
      }
   }

   private void e(dic $$0) {
      ale<uw> $$1 = this.k.a(un.a);
      Dynamic<uw> $$2 = this.a($$0, $$1);
      uw $$3 = (uw)$$2.getValue();
      if ($$3 instanceof tz) {
         this.d.a($$0, (tz)$$3).exceptionally($$1x -> {
            this.l.b($$1x, this.d.a(), $$0);
            return null;
         });
      } else {
         a.error("Expected compound tag, got {}", $$3);
      }
   }

   private <T> Dynamic<T> a(dic $$0, DynamicOps<T> $$1) {
      Map<T, T> $$2 = Maps.newHashMap();

      for (int $$3 = this.c.aq(); $$3 <= this.c.ar(); $$3++) {
         long $$4 = a($$0, $$3);
         Optional<R> $$5 = (Optional<R>)this.e.get($$4);
         if ($$5 != null && !$$5.isEmpty()) {
            DataResult<T> $$6 = this.g.encodeStart($$1, this.h.apply($$5.get()));
            String $$7 = Integer.toString($$3);
            $$6.resultOrPartial(a::error).ifPresent($$3x -> $$2.put((T)$$1.createString($$7), (T)$$3x));
         }
      }

      return new Dynamic(
         $$1, $$1.createMap(ImmutableMap.of($$1.createString("Sections"), $$1.createMap($$2), $$1.createString("DataVersion"), $$1.createInt(ab.b().d().c())))
      );
   }

   private static long a(dic $$0, int $$1) {
      return jx.b($$0.h, $$1, $$0.i);
   }

   protected void b(long $$0) {
   }

   protected void a(long $$0) {
      Optional<R> $$1 = (Optional<R>)this.e.get($$0);
      if ($$1 != null && !$$1.isEmpty()) {
         this.f.add(dic.c(jx.b($$0), jx.d($$0)));
      } else {
         a.warn("No data for position: {}", jx.a($$0));
      }
   }

   static int a(Dynamic<?> $$0) {
      return $$0.get("DataVersion").asInt(1945);
   }

   public void b(dic $$0) {
      if (this.f.remove($$0.a())) {
         this.e($$0);
      }
   }

   @Override
   public void close() throws IOException {
      this.d.close();
   }

   static record a<T>(Int2ObjectMap<T> a, boolean b) {

      public static <T> edq.a<T> a(Codec<T> $$0, DynamicOps<uw> $$1, uw $$2, eds $$3, dix $$4) {
         Dynamic<uw> $$5 = new Dynamic($$1, $$2);
         int $$6 = edq.a($$5);
         int $$7 = ab.b().d().c();
         boolean $$8 = $$6 != $$7;
         Dynamic<uw> $$9 = $$3.a($$5, $$6);
         OptionalDynamic<uw> $$10 = $$9.get("Sections");
         Int2ObjectMap<T> $$11 = new Int2ObjectOpenHashMap();

         for (int $$12 = $$4.aq(); $$12 <= $$4.ar(); $$12++) {
            Optional<T> $$13 = $$10.get(Integer.toString($$12)).result().flatMap($$1x -> $$0.parse($$1x).resultOrPartial(edq.a::error));
            if ($$13.isPresent()) {
               $$11.put($$12, $$13.get());
            }
         }

         return new edq.a<>($$11, $$8);
      }
   }
}
