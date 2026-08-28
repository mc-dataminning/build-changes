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

public class bur<E extends btp> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bur<E>>> b;
   private static final int c = 20;
   private final Map<cct<?>, Optional<? extends ccs<?>>> d = Maps.newHashMap();
   private final Map<cea<? extends cdz<? super E>>, cdz<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<com, Set<bvj<? super E>>>> f = Maps.newTreeMap();
   private cop g = cop.c;
   private final Map<com, Set<Pair<cct<?>, ccu>>> h = Maps.newHashMap();
   private final Map<com, Set<cct<?>>> i = Maps.newHashMap();
   private Set<com> j = Sets.newHashSet();
   private final Set<com> k = Sets.newHashSet();
   private com l = com.b;
   private long m = -9999L;

   public static <E extends btp> bur.b<E> a(Collection<? extends cct<?>> $$0, Collection<? extends cea<? extends cdz<? super E>>> $$1) {
      return new bur.b<>($$0, $$1);
   }

   public static <E extends btp> Codec<bur<E>> b(final Collection<? extends cct<?>> $$0, final Collection<? extends cea<? extends cdz<? super E>>> $$1) {
      final MutableObject<Codec<bur<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bur<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> lp.B.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bur<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bur.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cct<?>> $$3x = lp.B.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bur.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bur.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bur.a::error)
                     .<ImmutableList<bur.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bur<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bur.a<U>> a(cct<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bur.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bur<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bur<E>>)$$2.getValue();
   }

   public bur(
      Collection<? extends cct<?>> $$0, Collection<? extends cea<? extends cdz<? super E>>> $$1, ImmutableList<bur.a<?>> $$2, Supplier<Codec<bur<E>>> $$3
   ) {
      this.b = $$3;

      for (cct<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cea<? extends cdz<? super E>> $$5 : $$1) {
         this.e.put($$5, (cdz<? super E>)$$5.a());
      }

      for (cdz<? super E> $$6 : this.e.values()) {
         for (cct<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bur.a<?> $$8 = (bur.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bur.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bur.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cct<?> $$0) {
      return this.a($$0, ccu.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cct<?>)$$0, Optional.empty()));
   }

   public <U> void b(cct<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cct<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cct<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(ccs.a($$1, $$2)));
   }

   public <U> void a(cct<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(ccs::a));
   }

   <U> void b(cct<U> $$0, Optional<? extends ccs<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cct<U> $$0) {
      Optional<? extends ccs<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(ccs::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cct<U> $$0) {
      Optional<? extends ccs<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(ccs::c);
   }

   public <U> long e(cct<U> $$0) {
      Optional<? extends ccs<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(ccs::b).orElse(0L);
   }

   @Deprecated
   @bad
   public Map<cct<?>, Optional<? extends ccs<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cct<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cct<?> $$0, ccu $$1) {
      Optional<? extends ccs<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == ccu.c || $$1 == ccu.a && $$2.isPresent() || $$1 == ccu.b && $$2.isEmpty();
   }

   public cop c() {
      return this.g;
   }

   public void a(cop $$0) {
      this.g = $$0;
   }

   public void a(Set<com> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bad
   public Set<com> d() {
      return this.k;
   }

   @Deprecated
   @bad
   public List<bvj<? super E>> e() {
      List<bvj<? super E>> $$0 = new ObjectArrayList();

      for (Map<com, Set<bvj<? super E>>> $$1 : this.f.values()) {
         for (Set<bvj<? super E>> $$2 : $$1.values()) {
            for (bvj<? super E> $$3 : $$2) {
               if ($$3.a() == bvi.a.b) {
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

   public Optional<com> g() {
      for (com $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(com $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(com $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(com $$0) {
      for (com $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cct<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cct<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         com $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<com> $$0) {
      for (com $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(com $$0) {
      this.l = $$0;
   }

   public void a(com $$0, int $$1, ImmutableList<? extends bvj<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(com $$0, int $$1, ImmutableList<? extends bvj<? super E>> $$2, cct<?> $$3) {
      Set<Pair<cct<?>, ccu>> $$4 = ImmutableSet.of(Pair.of($$3, ccu.a));
      Set<cct<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(com $$0, ImmutableList<? extends Pair<Integer, ? extends bvj<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(com $$0, ImmutableList<? extends Pair<Integer, ? extends bvj<? super E>>> $$1, Set<Pair<cct<?>, ccu>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(com $$0, ImmutableList<? extends Pair<Integer, ? extends bvj<? super E>>> $$1, Set<Pair<cct<?>, ccu>> $$2, Set<cct<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bvj<? super E>> $$4 = (Pair<Integer, ? extends bvj<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bvj<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(com $$0) {
      return this.k.contains($$0);
   }

   public bur<E> i() {
      bur<E> $$0 = new bur<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cct<?>, Optional<? extends ccs<?>>> $$1 : this.d.entrySet()) {
         cct<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(arf $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(arf $$0, E $$1) {
      for (cdz<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cct<?>, Optional<? extends ccs<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            ccs<?> $$1 = (ccs<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arf $$0, E $$1) {
      long $$2 = $$1.dP().Z();

      for (bvj<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arf $$0, E $$1) {
      long $$2 = $$0.Z();

      for (Map<com, Set<bvj<? super E>>> $$3 : this.f.values()) {
         for (Entry<com, Set<bvj<? super E>>> $$4 : $$3.entrySet()) {
            com $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bvj<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bvi.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arf $$0, E $$1) {
      long $$2 = $$0.Z();

      for (bvj<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(com $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cct<?>, ccu> $$1 : this.h.get($$0)) {
            cct<?> $$2 = (cct<?>)$$1.getFirst();
            ccu $$3 = (ccu)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bvj<? super E>>> a(int $$0, ImmutableList<? extends bvj<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bvj<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bvj<? super E> $$4 = (bvj<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cct<U> a;
      private final Optional<? extends ccs<U>> b;

      static <U> bur.a<U> a(cct<U> $$0, Optional<? extends ccs<?>> $$1) {
         return new bur.a<>($$0, (Optional<? extends ccs<U>>)$$1);
      }

      a(cct<U> $$0, Optional<? extends ccs<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bur<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(lp.B.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends btp> {
      private final Collection<? extends cct<?>> a;
      private final Collection<? extends cea<? extends cdz<? super E>>> b;
      private final Codec<bur<E>> c;

      b(Collection<? extends cct<?>> $$0, Collection<? extends cea<? extends cdz<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bur.b($$0, $$1);
      }

      public bur<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bur.a::error).orElseGet(() -> new bur<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
