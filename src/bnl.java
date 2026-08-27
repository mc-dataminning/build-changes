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

public class bnl<E extends bml> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bnl<E>>> b;
   private static final int c = 20;
   private final Map<bvn<?>, Optional<? extends bvm<?>>> d = Maps.newHashMap();
   private final Map<bwt<? extends bws<? super E>>, bws<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cgu, Set<bod<? super E>>>> f = Maps.newTreeMap();
   private cgw g = cgw.c;
   private final Map<cgu, Set<Pair<bvn<?>, bvo>>> h = Maps.newHashMap();
   private final Map<cgu, Set<bvn<?>>> i = Maps.newHashMap();
   private Set<cgu> j = Sets.newHashSet();
   private final Set<cgu> k = Sets.newHashSet();
   private cgu l = cgu.b;
   private long m = -9999L;

   public static <E extends bml> bnl.b<E> a(Collection<? extends bvn<?>> $$0, Collection<? extends bwt<? extends bws<? super E>>> $$1) {
      return new bnl.b<>($$0, $$1);
   }

   public static <E extends bml> Codec<bnl<E>> b(final Collection<? extends bvn<?>> $$0, final Collection<? extends bwt<? extends bws<? super E>>> $$1) {
      final MutableObject<Codec<bnl<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bnl<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> kd.B.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bnl<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bnl.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<bvn<?>> $$3x = kd.B.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bnl.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bnl.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bnl.a::error)
                     .<ImmutableList<bnl.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bnl<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bnl.a<U>> a(bvn<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bnl.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bnl<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bnl<E>>)$$2.getValue();
   }

   public bnl(
      Collection<? extends bvn<?>> $$0, Collection<? extends bwt<? extends bws<? super E>>> $$1, ImmutableList<bnl.a<?>> $$2, Supplier<Codec<bnl<E>>> $$3
   ) {
      this.b = $$3;

      for (bvn<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (bwt<? extends bws<? super E>> $$5 : $$1) {
         this.e.put($$5, (bws<? super E>)$$5.a());
      }

      for (bws<? super E> $$6 : this.e.values()) {
         for (bvn<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bnl.a<?> $$8 = (bnl.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bnl.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bnl.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(bvn<?> $$0) {
      return this.a($$0, bvo.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((bvn<?>)$$0, Optional.empty()));
   }

   public <U> void b(bvn<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(bvn<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(bvn<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(bvm.a($$1, $$2)));
   }

   public <U> void a(bvn<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(bvm::a));
   }

   <U> void b(bvn<U> $$0, Optional<? extends bvm<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(bvn<U> $$0) {
      Optional<? extends bvm<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(bvm::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(bvn<U> $$0) {
      Optional<? extends bvm<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(bvm::c);
   }

   public <U> long e(bvn<U> $$0) {
      Optional<? extends bvm<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(bvm::b).orElse(0L);
   }

   @Deprecated
   @avt
   public Map<bvn<?>, Optional<? extends bvm<?>>> b() {
      return this.d;
   }

   public <U> boolean b(bvn<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(bvn<?> $$0, bvo $$1) {
      Optional<? extends bvm<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == bvo.c || $$1 == bvo.a && $$2.isPresent() || $$1 == bvo.b && $$2.isEmpty();
   }

   public cgw c() {
      return this.g;
   }

   public void a(cgw $$0) {
      this.g = $$0;
   }

   public void a(Set<cgu> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @avt
   public Set<cgu> d() {
      return this.k;
   }

   @Deprecated
   @avt
   public List<bod<? super E>> e() {
      List<bod<? super E>> $$0 = new ObjectArrayList();

      for (Map<cgu, Set<bod<? super E>>> $$1 : this.f.values()) {
         for (Set<bod<? super E>> $$2 : $$1.values()) {
            for (bod<? super E> $$3 : $$2) {
               if ($$3.a() == boc.a.b) {
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

   public Optional<cgu> g() {
      for (cgu $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cgu $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cgu $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cgu $$0) {
      for (cgu $$1 : this.k) {
         if ($$1 != $$0) {
            Set<bvn<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (bvn<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cgu $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cgu> $$0) {
      for (cgu $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cgu $$0) {
      this.l = $$0;
   }

   public void a(cgu $$0, int $$1, ImmutableList<? extends bod<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cgu $$0, int $$1, ImmutableList<? extends bod<? super E>> $$2, bvn<?> $$3) {
      Set<Pair<bvn<?>, bvo>> $$4 = ImmutableSet.of(Pair.of($$3, bvo.a));
      Set<bvn<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cgu $$0, ImmutableList<? extends Pair<Integer, ? extends bod<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cgu $$0, ImmutableList<? extends Pair<Integer, ? extends bod<? super E>>> $$1, Set<Pair<bvn<?>, bvo>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cgu $$0, ImmutableList<? extends Pair<Integer, ? extends bod<? super E>>> $$1, Set<Pair<bvn<?>, bvo>> $$2, Set<bvn<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bod<? super E>> $$4 = (Pair<Integer, ? extends bod<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bod<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cgu $$0) {
      return this.k.contains($$0);
   }

   public bnl<E> i() {
      bnl<E> $$0 = new bnl<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<bvn<?>, Optional<? extends bvm<?>>> $$1 : this.d.entrySet()) {
         bvn<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(and $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(and $$0, E $$1) {
      for (bws<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<bvn<?>, Optional<? extends bvm<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            bvm<?> $$1 = (bvm<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(and $$0, E $$1) {
      long $$2 = $$1.dM().X();

      for (bod<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(and $$0, E $$1) {
      long $$2 = $$0.X();

      for (Map<cgu, Set<bod<? super E>>> $$3 : this.f.values()) {
         for (Entry<cgu, Set<bod<? super E>>> $$4 : $$3.entrySet()) {
            cgu $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bod<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == boc.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(and $$0, E $$1) {
      long $$2 = $$0.X();

      for (bod<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cgu $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<bvn<?>, bvo> $$1 : this.h.get($$0)) {
            bvn<?> $$2 = (bvn<?>)$$1.getFirst();
            bvo $$3 = (bvo)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bod<? super E>>> a(int $$0, ImmutableList<? extends bod<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bod<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bod<? super E> $$4 = (bod<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final bvn<U> a;
      private final Optional<? extends bvm<U>> b;

      static <U> bnl.a<U> a(bvn<U> $$0, Optional<? extends bvm<?>> $$1) {
         return new bnl.a<>($$0, (Optional<? extends bvm<U>>)$$1);
      }

      a(bvn<U> $$0, Optional<? extends bvm<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bnl<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(kd.B.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bml> {
      private final Collection<? extends bvn<?>> a;
      private final Collection<? extends bwt<? extends bws<? super E>>> b;
      private final Codec<bnl<E>> c;

      b(Collection<? extends bvn<?>> $$0, Collection<? extends bwt<? extends bws<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bnl.b($$0, $$1);
      }

      public bnl<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bnl.a::error).orElseGet(() -> new bnl<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
