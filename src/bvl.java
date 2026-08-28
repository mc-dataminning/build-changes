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

public class bvl<E extends buk> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bvl<E>>> b;
   private static final int c = 20;
   private final Map<cdn<?>, Optional<? extends cdm<?>>> d = Maps.newHashMap();
   private final Map<ceu<? extends cet<? super E>>, cet<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cpm, Set<bwd<? super E>>>> f = Maps.newTreeMap();
   private cpo g = cpo.c;
   private final Map<cpm, Set<Pair<cdn<?>, cdo>>> h = Maps.newHashMap();
   private final Map<cpm, Set<cdn<?>>> i = Maps.newHashMap();
   private Set<cpm> j = Sets.newHashSet();
   private final Set<cpm> k = Sets.newHashSet();
   private cpm l = cpm.b;
   private long m = -9999L;

   public static <E extends buk> bvl.b<E> a(Collection<? extends cdn<?>> $$0, Collection<? extends ceu<? extends cet<? super E>>> $$1) {
      return new bvl.b<>($$0, $$1);
   }

   public static <E extends buk> Codec<bvl<E>> b(final Collection<? extends cdn<?>> $$0, final Collection<? extends ceu<? extends cet<? super E>>> $$1) {
      final MutableObject<Codec<bvl<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bvl<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> lu.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bvl<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bvl.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cdn<?>> $$3x = lu.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bvl.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bvl.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bvl.a::error)
                     .<ImmutableList<bvl.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bvl<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bvl.a<U>> a(cdn<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bvl.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bvl<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bvl<E>>)$$2.getValue();
   }

   public bvl(
      Collection<? extends cdn<?>> $$0, Collection<? extends ceu<? extends cet<? super E>>> $$1, ImmutableList<bvl.a<?>> $$2, Supplier<Codec<bvl<E>>> $$3
   ) {
      this.b = $$3;

      for (cdn<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (ceu<? extends cet<? super E>> $$5 : $$1) {
         this.e.put($$5, (cet<? super E>)$$5.a());
      }

      for (cet<? super E> $$6 : this.e.values()) {
         for (cdn<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bvl.a<?> $$8 = (bvl.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bvl.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bvl.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cdn<?> $$0) {
      return this.a($$0, cdo.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cdn<?>)$$0, Optional.empty()));
   }

   public <U> void b(cdn<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cdn<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cdn<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cdm.a($$1, $$2)));
   }

   public <U> void a(cdn<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cdm::a));
   }

   <U> void b(cdn<U> $$0, Optional<? extends cdm<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cdn<U> $$0) {
      Optional<? extends cdm<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cdm::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cdn<U> $$0) {
      Optional<? extends cdm<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cdm::c);
   }

   public <U> long e(cdn<U> $$0) {
      Optional<? extends cdm<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cdm::b).orElse(0L);
   }

   @Deprecated
   @baj
   public Map<cdn<?>, Optional<? extends cdm<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cdn<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cdn<?> $$0, cdo $$1) {
      Optional<? extends cdm<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cdo.c || $$1 == cdo.a && $$2.isPresent() || $$1 == cdo.b && $$2.isEmpty();
   }

   public cpo c() {
      return this.g;
   }

   public void a(cpo $$0) {
      this.g = $$0;
   }

   public void a(Set<cpm> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @baj
   public Set<cpm> d() {
      return this.k;
   }

   @Deprecated
   @baj
   public List<bwd<? super E>> e() {
      List<bwd<? super E>> $$0 = new ObjectArrayList();

      for (Map<cpm, Set<bwd<? super E>>> $$1 : this.f.values()) {
         for (Set<bwd<? super E>> $$2 : $$1.values()) {
            for (bwd<? super E> $$3 : $$2) {
               if ($$3.a() == bwc.a.b) {
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

   public Optional<cpm> g() {
      for (cpm $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cpm $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cpm $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cpm $$0) {
      for (cpm $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cdn<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cdn<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cpm $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cpm> $$0) {
      for (cpm $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cpm $$0) {
      this.l = $$0;
   }

   public void a(cpm $$0, int $$1, ImmutableList<? extends bwd<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cpm $$0, int $$1, ImmutableList<? extends bwd<? super E>> $$2, cdn<?> $$3) {
      Set<Pair<cdn<?>, cdo>> $$4 = ImmutableSet.of(Pair.of($$3, cdo.a));
      Set<cdn<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cpm $$0, ImmutableList<? extends Pair<Integer, ? extends bwd<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cpm $$0, ImmutableList<? extends Pair<Integer, ? extends bwd<? super E>>> $$1, Set<Pair<cdn<?>, cdo>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cpm $$0, ImmutableList<? extends Pair<Integer, ? extends bwd<? super E>>> $$1, Set<Pair<cdn<?>, cdo>> $$2, Set<cdn<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bwd<? super E>> $$4 = (Pair<Integer, ? extends bwd<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bwd<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cpm $$0) {
      return this.k.contains($$0);
   }

   public bvl<E> i() {
      bvl<E> $$0 = new bvl<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cdn<?>, Optional<? extends cdm<?>>> $$1 : this.d.entrySet()) {
         cdn<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(arh $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(arh $$0, E $$1) {
      for (cet<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cdn<?>, Optional<? extends cdm<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cdm<?> $$1 = (cdm<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arh $$0, E $$1) {
      long $$2 = $$1.dS().aa();

      for (bwd<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arh $$0, E $$1) {
      long $$2 = $$0.aa();

      for (Map<cpm, Set<bwd<? super E>>> $$3 : this.f.values()) {
         for (Entry<cpm, Set<bwd<? super E>>> $$4 : $$3.entrySet()) {
            cpm $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bwd<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bwc.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arh $$0, E $$1) {
      long $$2 = $$0.aa();

      for (bwd<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cpm $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cdn<?>, cdo> $$1 : this.h.get($$0)) {
            cdn<?> $$2 = (cdn<?>)$$1.getFirst();
            cdo $$3 = (cdo)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bwd<? super E>>> a(int $$0, ImmutableList<? extends bwd<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bwd<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bwd<? super E> $$4 = (bwd<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cdn<U> a;
      private final Optional<? extends cdm<U>> b;

      static <U> bvl.a<U> a(cdn<U> $$0, Optional<? extends cdm<?>> $$1) {
         return new bvl.a<>($$0, (Optional<? extends cdm<U>>)$$1);
      }

      a(cdn<U> $$0, Optional<? extends cdm<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bvl<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(lu.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends buk> {
      private final Collection<? extends cdn<?>> a;
      private final Collection<? extends ceu<? extends cet<? super E>>> b;
      private final Codec<bvl<E>> c;

      b(Collection<? extends cdn<?>> $$0, Collection<? extends ceu<? extends cet<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bvl.b($$0, $$1);
      }

      public bvl<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bvl.a::error).orElseGet(() -> new bvl<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
