import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class bly<E extends bky> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bly<E>>> b;
   private static final int c = 20;
   private final Map<btz<?>, Optional<? extends bty<?>>> d = Maps.newHashMap();
   private final Map<bve<? extends bvd<? super E>>, bvd<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cex, Set<bmq<? super E>>>> f = Maps.newTreeMap();
   private cez g = cez.c;
   private final Map<cex, Set<Pair<btz<?>, bua>>> h = Maps.newHashMap();
   private final Map<cex, Set<btz<?>>> i = Maps.newHashMap();
   private Set<cex> j = Sets.newHashSet();
   private final Set<cex> k = Sets.newHashSet();
   private cex l = cex.b;
   private long m = -9999L;

   public static <E extends bky> bly.b<E> a(Collection<? extends btz<?>> $$0, Collection<? extends bve<? extends bvd<? super E>>> $$1) {
      return new bly.b<>($$0, $$1);
   }

   public static <E extends bky> Codec<bly<E>> b(final Collection<? extends btz<?>> $$0, final Collection<? extends bve<? extends bvd<? super E>>> $$1) {
      final MutableObject<Codec<bly<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bly<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> jy.C.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bly<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bly.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<btz<?>> $$3x = jy.C.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bly.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bly.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bly.a::error)
                     .<ImmutableList<bly.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bly<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bly.a<U>> a(btz<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bly.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bly<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bly<E>>)$$2.getValue();
   }

   public bly(
      Collection<? extends btz<?>> $$0, Collection<? extends bve<? extends bvd<? super E>>> $$1, ImmutableList<bly.a<?>> $$2, Supplier<Codec<bly<E>>> $$3
   ) {
      this.b = $$3;

      for (btz<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (bve<? extends bvd<? super E>> $$5 : $$1) {
         this.e.put($$5, (bvd<? super E>)$$5.a());
      }

      for (bvd<? super E> $$6 : this.e.values()) {
         for (btz<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bly.a<?> $$8 = (bly.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bly.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bly.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(btz<?> $$0) {
      return this.a($$0, bua.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((btz<?>)$$0, Optional.empty()));
   }

   public <U> void b(btz<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(btz<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(btz<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(bty.a($$1, $$2)));
   }

   public <U> void a(btz<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(bty::a));
   }

   <U> void b(btz<U> $$0, Optional<? extends bty<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(btz<U> $$0) {
      Optional<? extends bty<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(bty::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(btz<U> $$0) {
      Optional<? extends bty<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(bty::c);
   }

   public <U> long e(btz<U> $$0) {
      Optional<? extends bty<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(bty::b).orElse(0L);
   }

   @Deprecated
   @auk
   public Map<btz<?>, Optional<? extends bty<?>>> b() {
      return this.d;
   }

   public <U> boolean b(btz<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(btz<?> $$0, bua $$1) {
      Optional<? extends bty<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == bua.c || $$1 == bua.a && $$2.isPresent() || $$1 == bua.b && $$2.isEmpty();
   }

   public cez c() {
      return this.g;
   }

   public void a(cez $$0) {
      this.g = $$0;
   }

   public void a(Set<cex> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @auk
   public Set<cex> d() {
      return this.k;
   }

   @Deprecated
   @auk
   public List<bmq<? super E>> e() {
      List<bmq<? super E>> $$0 = new ObjectArrayList();

      for (Map<cex, Set<bmq<? super E>>> $$1 : this.f.values()) {
         for (Set<bmq<? super E>> $$2 : $$1.values()) {
            for (bmq<? super E> $$3 : $$2) {
               if ($$3.a() == bmp.a.b) {
                  $$0.add($$3);
               }
            }
         }
      }

      return $$0;
   }

   public void f() {
      this.d(this.l);
   }

   public Optional<cex> g() {
      for (cex $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cex $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cex $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cex $$0) {
      for (cex $$1 : this.k) {
         if ($$1 != $$0) {
            Set<btz<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (btz<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cex $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cex> $$0) {
      for (cex $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cex $$0) {
      this.l = $$0;
   }

   public void a(cex $$0, int $$1, ImmutableList<? extends bmq<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cex $$0, int $$1, ImmutableList<? extends bmq<? super E>> $$2, btz<?> $$3) {
      Set<Pair<btz<?>, bua>> $$4 = ImmutableSet.of(Pair.of($$3, bua.a));
      Set<btz<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cex $$0, ImmutableList<? extends Pair<Integer, ? extends bmq<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cex $$0, ImmutableList<? extends Pair<Integer, ? extends bmq<? super E>>> $$1, Set<Pair<btz<?>, bua>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cex $$0, ImmutableList<? extends Pair<Integer, ? extends bmq<? super E>>> $$1, Set<Pair<btz<?>, bua>> $$2, Set<btz<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bmq<? super E>> $$4 = (Pair<Integer, ? extends bmq<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bmq<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cex $$0) {
      return this.k.contains($$0);
   }

   public bly<E> i() {
      bly<E> $$0 = new bly<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<btz<?>, Optional<? extends bty<?>>> $$1 : this.d.entrySet()) {
         btz<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(ama $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(ama $$0, E $$1) {
      for (bvd<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<btz<?>, Optional<? extends bty<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            bty<?> $$1 = (bty<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(ama $$0, E $$1) {
      long $$2 = $$1.dL().V();

      for (bmq<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(ama $$0, E $$1) {
      long $$2 = $$0.V();

      for (Map<cex, Set<bmq<? super E>>> $$3 : this.f.values()) {
         for (Entry<cex, Set<bmq<? super E>>> $$4 : $$3.entrySet()) {
            cex $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bmq<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bmp.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(ama $$0, E $$1) {
      long $$2 = $$0.V();

      for (bmq<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cex $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<btz<?>, bua> $$1 : this.h.get($$0)) {
            btz<?> $$2 = (btz<?>)$$1.getFirst();
            bua $$3 = (bua)$$1.getSecond();
            if (!this.a($$2, $$3)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(Object $$0) {
      return $$0 instanceof Collection && ((Collection)$$0).isEmpty();
   }

   ImmutableList<? extends Pair<Integer, ? extends bmq<? super E>>> a(int $$0, ImmutableList<? extends bmq<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bmq<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bmq<? super E> $$4 = (bmq<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final btz<U> a;
      private final Optional<? extends bty<U>> b;

      static <U> bly.a<U> a(btz<U> $$0, Optional<? extends bty<?>> $$1) {
         return new bly.a<>($$0, (Optional<? extends bty<U>>)$$1);
      }

      a(btz<U> $$0, Optional<? extends bty<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bly<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(jy.C.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bky> {
      private final Collection<? extends btz<?>> a;
      private final Collection<? extends bve<? extends bvd<? super E>>> b;
      private final Codec<bly<E>> c;

      b(Collection<? extends btz<?>> $$0, Collection<? extends bve<? extends bvd<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bly.b($$0, $$1);
      }

      public bly<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bly.a::error).orElseGet(() -> new bly<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
