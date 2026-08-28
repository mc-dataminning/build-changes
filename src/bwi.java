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

public class bwi<E extends bvg> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bwi<E>>> b;
   private static final int c = 20;
   private final Map<cek<?>, Optional<? extends cej<?>>> d = Maps.newHashMap();
   private final Map<cfr<? extends cfq<? super E>>, cfq<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cqo, Set<bxa<? super E>>>> f = Maps.newTreeMap();
   private cqq g = cqq.c;
   private final Map<cqo, Set<Pair<cek<?>, cel>>> h = Maps.newHashMap();
   private final Map<cqo, Set<cek<?>>> i = Maps.newHashMap();
   private Set<cqo> j = Sets.newHashSet();
   private final Set<cqo> k = Sets.newHashSet();
   private cqo l = cqo.b;
   private long m = -9999L;

   public static <E extends bvg> bwi.b<E> a(Collection<? extends cek<?>> $$0, Collection<? extends cfr<? extends cfq<? super E>>> $$1) {
      return new bwi.b<>($$0, $$1);
   }

   public static <E extends bvg> Codec<bwi<E>> b(final Collection<? extends cek<?>> $$0, final Collection<? extends cfr<? extends cfq<? super E>>> $$1) {
      final MutableObject<Codec<bwi<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bwi<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> mb.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bwi<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bwi.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cek<?>> $$3x = mb.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bwi.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bwi.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bwi.a::error)
                     .<ImmutableList<bwi.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bwi<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bwi.a<U>> a(cek<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bwi.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bwi<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bwi<E>>)$$2.getValue();
   }

   public bwi(
      Collection<? extends cek<?>> $$0, Collection<? extends cfr<? extends cfq<? super E>>> $$1, ImmutableList<bwi.a<?>> $$2, Supplier<Codec<bwi<E>>> $$3
   ) {
      this.b = $$3;

      for (cek<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cfr<? extends cfq<? super E>> $$5 : $$1) {
         this.e.put($$5, (cfq<? super E>)$$5.a());
      }

      for (cfq<? super E> $$6 : this.e.values()) {
         for (cek<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bwi.a<?> $$8 = (bwi.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bwi.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bwi.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cek<?> $$0) {
      return this.a($$0, cel.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cek<?>)$$0, Optional.empty()));
   }

   public <U> void b(cek<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cek<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cek<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cej.a($$1, $$2)));
   }

   public <U> void a(cek<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cej::a));
   }

   <U> void b(cek<U> $$0, Optional<? extends cej<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cek<U> $$0) {
      Optional<? extends cej<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cej::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cek<U> $$0) {
      Optional<? extends cej<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cej::c);
   }

   public <U> long e(cek<U> $$0) {
      Optional<? extends cej<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cej::b).orElse(0L);
   }

   @Deprecated
   @bag
   public Map<cek<?>, Optional<? extends cej<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cek<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cek<?> $$0, cel $$1) {
      Optional<? extends cej<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cel.c || $$1 == cel.a && $$2.isPresent() || $$1 == cel.b && $$2.isEmpty();
   }

   public cqq c() {
      return this.g;
   }

   public void a(cqq $$0) {
      this.g = $$0;
   }

   public void a(Set<cqo> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bag
   public Set<cqo> d() {
      return this.k;
   }

   @Deprecated
   @bag
   public List<bxa<? super E>> e() {
      List<bxa<? super E>> $$0 = new ObjectArrayList();

      for (Map<cqo, Set<bxa<? super E>>> $$1 : this.f.values()) {
         for (Set<bxa<? super E>> $$2 : $$1.values()) {
            for (bxa<? super E> $$3 : $$2) {
               if ($$3.a() == bwz.a.b) {
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

   public Optional<cqo> g() {
      for (cqo $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cqo $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cqo $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cqo $$0) {
      for (cqo $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cek<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cek<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cqo $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cqo> $$0) {
      for (cqo $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cqo $$0) {
      this.l = $$0;
   }

   public void a(cqo $$0, int $$1, ImmutableList<? extends bxa<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cqo $$0, int $$1, ImmutableList<? extends bxa<? super E>> $$2, cek<?> $$3) {
      Set<Pair<cek<?>, cel>> $$4 = ImmutableSet.of(Pair.of($$3, cel.a));
      Set<cek<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cqo $$0, ImmutableList<? extends Pair<Integer, ? extends bxa<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cqo $$0, ImmutableList<? extends Pair<Integer, ? extends bxa<? super E>>> $$1, Set<Pair<cek<?>, cel>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cqo $$0, ImmutableList<? extends Pair<Integer, ? extends bxa<? super E>>> $$1, Set<Pair<cek<?>, cel>> $$2, Set<cek<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bxa<? super E>> $$4 = (Pair<Integer, ? extends bxa<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bxa<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cqo $$0) {
      return this.k.contains($$0);
   }

   public bwi<E> i() {
      bwi<E> $$0 = new bwi<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cek<?>, Optional<? extends cej<?>>> $$1 : this.d.entrySet()) {
         cek<?> $$2 = $$1.getKey();
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
      for (cfq<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cek<?>, Optional<? extends cej<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cej<?> $$1 = (cej<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arc $$0, E $$1) {
      long $$2 = $$1.dW().ad();

      for (bxa<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arc $$0, E $$1) {
      long $$2 = $$0.ad();

      for (Map<cqo, Set<bxa<? super E>>> $$3 : this.f.values()) {
         for (Entry<cqo, Set<bxa<? super E>>> $$4 : $$3.entrySet()) {
            cqo $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bxa<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bwz.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arc $$0, E $$1) {
      long $$2 = $$0.ad();

      for (bxa<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cqo $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cek<?>, cel> $$1 : this.h.get($$0)) {
            cek<?> $$2 = (cek<?>)$$1.getFirst();
            cel $$3 = (cel)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bxa<? super E>>> a(int $$0, ImmutableList<? extends bxa<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bxa<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bxa<? super E> $$4 = (bxa<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cek<U> a;
      private final Optional<? extends cej<U>> b;

      static <U> bwi.a<U> a(cek<U> $$0, Optional<? extends cej<?>> $$1) {
         return new bwi.a<>($$0, (Optional<? extends cej<U>>)$$1);
      }

      a(cek<U> $$0, Optional<? extends cej<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bwi<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mb.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bvg> {
      private final Collection<? extends cek<?>> a;
      private final Collection<? extends cfr<? extends cfq<? super E>>> b;
      private final Codec<bwi<E>> c;

      b(Collection<? extends cek<?>> $$0, Collection<? extends cfr<? extends cfq<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bwi.b($$0, $$1);
      }

      public bwi<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bwi.a::error).orElseGet(() -> new bwi<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
