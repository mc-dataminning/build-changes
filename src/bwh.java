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

public class bwh<E extends bvf> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bwh<E>>> b;
   private static final int c = 20;
   private final Map<cej<?>, Optional<? extends cei<?>>> d = Maps.newHashMap();
   private final Map<cfq<? extends cfp<? super E>>, cfp<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cqm, Set<bwz<? super E>>>> f = Maps.newTreeMap();
   private cqo g = cqo.c;
   private final Map<cqm, Set<Pair<cej<?>, cek>>> h = Maps.newHashMap();
   private final Map<cqm, Set<cej<?>>> i = Maps.newHashMap();
   private Set<cqm> j = Sets.newHashSet();
   private final Set<cqm> k = Sets.newHashSet();
   private cqm l = cqm.b;
   private long m = -9999L;

   public static <E extends bvf> bwh.b<E> a(Collection<? extends cej<?>> $$0, Collection<? extends cfq<? extends cfp<? super E>>> $$1) {
      return new bwh.b<>($$0, $$1);
   }

   public static <E extends bvf> Codec<bwh<E>> b(final Collection<? extends cej<?>> $$0, final Collection<? extends cfq<? extends cfp<? super E>>> $$1) {
      final MutableObject<Codec<bwh<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bwh<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> mb.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bwh<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bwh.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cej<?>> $$3x = mb.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bwh.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bwh.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bwh.a::error)
                     .<ImmutableList<bwh.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bwh<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bwh.a<U>> a(cej<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bwh.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bwh<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bwh<E>>)$$2.getValue();
   }

   public bwh(
      Collection<? extends cej<?>> $$0, Collection<? extends cfq<? extends cfp<? super E>>> $$1, ImmutableList<bwh.a<?>> $$2, Supplier<Codec<bwh<E>>> $$3
   ) {
      this.b = $$3;

      for (cej<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cfq<? extends cfp<? super E>> $$5 : $$1) {
         this.e.put($$5, (cfp<? super E>)$$5.a());
      }

      for (cfp<? super E> $$6 : this.e.values()) {
         for (cej<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bwh.a<?> $$8 = (bwh.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bwh.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bwh.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cej<?> $$0) {
      return this.a($$0, cek.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cej<?>)$$0, Optional.empty()));
   }

   public <U> void b(cej<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cej<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cej<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cei.a($$1, $$2)));
   }

   public <U> void a(cej<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cei::a));
   }

   <U> void b(cej<U> $$0, Optional<? extends cei<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cej<U> $$0) {
      Optional<? extends cei<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cei::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cej<U> $$0) {
      Optional<? extends cei<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cei::c);
   }

   public <U> long e(cej<U> $$0) {
      Optional<? extends cei<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cei::b).orElse(0L);
   }

   @Deprecated
   @baf
   public Map<cej<?>, Optional<? extends cei<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cej<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cej<?> $$0, cek $$1) {
      Optional<? extends cei<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cek.c || $$1 == cek.a && $$2.isPresent() || $$1 == cek.b && $$2.isEmpty();
   }

   public cqo c() {
      return this.g;
   }

   public void a(cqo $$0) {
      this.g = $$0;
   }

   public void a(Set<cqm> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @baf
   public Set<cqm> d() {
      return this.k;
   }

   @Deprecated
   @baf
   public List<bwz<? super E>> e() {
      List<bwz<? super E>> $$0 = new ObjectArrayList();

      for (Map<cqm, Set<bwz<? super E>>> $$1 : this.f.values()) {
         for (Set<bwz<? super E>> $$2 : $$1.values()) {
            for (bwz<? super E> $$3 : $$2) {
               if ($$3.a() == bwy.a.b) {
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

   public Optional<cqm> g() {
      for (cqm $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cqm $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cqm $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cqm $$0) {
      for (cqm $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cej<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cej<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cqm $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cqm> $$0) {
      for (cqm $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cqm $$0) {
      this.l = $$0;
   }

   public void a(cqm $$0, int $$1, ImmutableList<? extends bwz<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cqm $$0, int $$1, ImmutableList<? extends bwz<? super E>> $$2, cej<?> $$3) {
      Set<Pair<cej<?>, cek>> $$4 = ImmutableSet.of(Pair.of($$3, cek.a));
      Set<cej<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cqm $$0, ImmutableList<? extends Pair<Integer, ? extends bwz<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cqm $$0, ImmutableList<? extends Pair<Integer, ? extends bwz<? super E>>> $$1, Set<Pair<cej<?>, cek>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cqm $$0, ImmutableList<? extends Pair<Integer, ? extends bwz<? super E>>> $$1, Set<Pair<cej<?>, cek>> $$2, Set<cej<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bwz<? super E>> $$4 = (Pair<Integer, ? extends bwz<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bwz<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cqm $$0) {
      return this.k.contains($$0);
   }

   public bwh<E> i() {
      bwh<E> $$0 = new bwh<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cej<?>, Optional<? extends cei<?>>> $$1 : this.d.entrySet()) {
         cej<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(arc $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(arc $$0, E $$1) {
      for (cfp<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cej<?>, Optional<? extends cei<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cei<?> $$1 = (cei<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arc $$0, E $$1) {
      long $$2 = $$1.dW().ad();

      for (bwz<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arc $$0, E $$1) {
      long $$2 = $$0.ad();

      for (Map<cqm, Set<bwz<? super E>>> $$3 : this.f.values()) {
         for (Entry<cqm, Set<bwz<? super E>>> $$4 : $$3.entrySet()) {
            cqm $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bwz<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bwy.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arc $$0, E $$1) {
      long $$2 = $$0.ad();

      for (bwz<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cqm $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cej<?>, cek> $$1 : this.h.get($$0)) {
            cej<?> $$2 = (cej<?>)$$1.getFirst();
            cek $$3 = (cek)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bwz<? super E>>> a(int $$0, ImmutableList<? extends bwz<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bwz<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bwz<? super E> $$4 = (bwz<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cej<U> a;
      private final Optional<? extends cei<U>> b;

      static <U> bwh.a<U> a(cej<U> $$0, Optional<? extends cei<?>> $$1) {
         return new bwh.a<>($$0, (Optional<? extends cei<U>>)$$1);
      }

      a(cej<U> $$0, Optional<? extends cei<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bwh<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mb.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bvf> {
      private final Collection<? extends cej<?>> a;
      private final Collection<? extends cfq<? extends cfp<? super E>>> b;
      private final Codec<bwh<E>> c;

      b(Collection<? extends cej<?>> $$0, Collection<? extends cfq<? extends cfp<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bwh.b($$0, $$1);
      }

      public bwh<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bwh.a::error).orElseGet(() -> new bwh<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
