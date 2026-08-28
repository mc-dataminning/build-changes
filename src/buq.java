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

public class buq<E extends btn> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<buq<E>>> b;
   private static final int c = 20;
   private final Map<ccs<?>, Optional<? extends ccr<?>>> d = Maps.newHashMap();
   private final Map<cdz<? extends cdy<? super E>>, cdy<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<com, Set<bvi<? super E>>>> f = Maps.newTreeMap();
   private cop g = cop.c;
   private final Map<com, Set<Pair<ccs<?>, cct>>> h = Maps.newHashMap();
   private final Map<com, Set<ccs<?>>> i = Maps.newHashMap();
   private Set<com> j = Sets.newHashSet();
   private final Set<com> k = Sets.newHashSet();
   private com l = com.b;
   private long m = -9999L;

   public static <E extends btn> buq.b<E> a(Collection<? extends ccs<?>> $$0, Collection<? extends cdz<? extends cdy<? super E>>> $$1) {
      return new buq.b<>($$0, $$1);
   }

   public static <E extends btn> Codec<buq<E>> b(final Collection<? extends ccs<?>> $$0, final Collection<? extends cdz<? extends cdy<? super E>>> $$1) {
      final MutableObject<Codec<buq<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<buq<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> lt.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<buq<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<buq.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<ccs<?>> $$3x = lt.z.r().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends buq.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<buq.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(buq.a::error)
                     .<ImmutableList<buq.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new buq<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<buq.a<U>> a(ccs<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new buq.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(buq<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<buq<E>>)$$2.getValue();
   }

   public buq(
      Collection<? extends ccs<?>> $$0, Collection<? extends cdz<? extends cdy<? super E>>> $$1, ImmutableList<buq.a<?>> $$2, Supplier<Codec<buq<E>>> $$3
   ) {
      this.b = $$3;

      for (ccs<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cdz<? extends cdy<? super E>> $$5 : $$1) {
         this.e.put($$5, (cdy<? super E>)$$5.a());
      }

      for (cdy<? super E> $$6 : this.e.values()) {
         for (ccs<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         buq.a<?> $$8 = (buq.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<buq.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> buq.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(ccs<?> $$0) {
      return this.a($$0, cct.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((ccs<?>)$$0, Optional.empty()));
   }

   public <U> void b(ccs<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(ccs<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(ccs<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(ccr.a($$1, $$2)));
   }

   public <U> void a(ccs<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(ccr::a));
   }

   <U> void b(ccs<U> $$0, Optional<? extends ccr<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(ccs<U> $$0) {
      Optional<? extends ccr<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(ccr::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(ccs<U> $$0) {
      Optional<? extends ccr<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(ccr::c);
   }

   public <U> long e(ccs<U> $$0) {
      Optional<? extends ccr<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(ccr::b).orElse(0L);
   }

   @Deprecated
   @azt
   public Map<ccs<?>, Optional<? extends ccr<?>>> b() {
      return this.d;
   }

   public <U> boolean b(ccs<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(ccs<?> $$0, cct $$1) {
      Optional<? extends ccr<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cct.c || $$1 == cct.a && $$2.isPresent() || $$1 == cct.b && $$2.isEmpty();
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
   @azt
   public Set<com> d() {
      return this.k;
   }

   @Deprecated
   @azt
   public List<bvi<? super E>> e() {
      List<bvi<? super E>> $$0 = new ObjectArrayList();

      for (Map<com, Set<bvi<? super E>>> $$1 : this.f.values()) {
         for (Set<bvi<? super E>> $$2 : $$1.values()) {
            for (bvi<? super E> $$3 : $$2) {
               if ($$3.a() == bvh.a.b) {
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
            Set<ccs<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (ccs<?> $$3 : $$2) {
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

   public void a(com $$0, int $$1, ImmutableList<? extends bvi<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(com $$0, int $$1, ImmutableList<? extends bvi<? super E>> $$2, ccs<?> $$3) {
      Set<Pair<ccs<?>, cct>> $$4 = ImmutableSet.of(Pair.of($$3, cct.a));
      Set<ccs<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(com $$0, ImmutableList<? extends Pair<Integer, ? extends bvi<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(com $$0, ImmutableList<? extends Pair<Integer, ? extends bvi<? super E>>> $$1, Set<Pair<ccs<?>, cct>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(com $$0, ImmutableList<? extends Pair<Integer, ? extends bvi<? super E>>> $$1, Set<Pair<ccs<?>, cct>> $$2, Set<ccs<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bvi<? super E>> $$4 = (Pair<Integer, ? extends bvi<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bvi<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(com $$0) {
      return this.k.contains($$0);
   }

   public buq<E> i() {
      buq<E> $$0 = new buq<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<ccs<?>, Optional<? extends ccr<?>>> $$1 : this.d.entrySet()) {
         ccs<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(aqu $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(aqu $$0, E $$1) {
      for (cdy<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<ccs<?>, Optional<? extends ccr<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            ccr<?> $$1 = (ccr<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aqu $$0, E $$1) {
      long $$2 = $$1.dP().Z();

      for (bvi<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aqu $$0, E $$1) {
      long $$2 = $$0.Z();

      for (Map<com, Set<bvi<? super E>>> $$3 : this.f.values()) {
         for (Entry<com, Set<bvi<? super E>>> $$4 : $$3.entrySet()) {
            com $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bvi<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bvh.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aqu $$0, E $$1) {
      long $$2 = $$0.Z();

      for (bvi<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(com $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<ccs<?>, cct> $$1 : this.h.get($$0)) {
            ccs<?> $$2 = (ccs<?>)$$1.getFirst();
            cct $$3 = (cct)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bvi<? super E>>> a(int $$0, ImmutableList<? extends bvi<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bvi<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bvi<? super E> $$4 = (bvi<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final ccs<U> a;
      private final Optional<? extends ccr<U>> b;

      static <U> buq.a<U> a(ccs<U> $$0, Optional<? extends ccr<?>> $$1) {
         return new buq.a<>($$0, (Optional<? extends ccr<U>>)$$1);
      }

      a(ccs<U> $$0, Optional<? extends ccr<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(buq<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(lt.z.r().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends btn> {
      private final Collection<? extends ccs<?>> a;
      private final Collection<? extends cdz<? extends cdy<? super E>>> b;
      private final Codec<buq<E>> c;

      b(Collection<? extends ccs<?>> $$0, Collection<? extends cdz<? extends cdy<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = buq.b($$0, $$1);
      }

      public buq<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(buq.a::error).orElseGet(() -> new buq<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
