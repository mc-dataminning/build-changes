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

public class bwc<E extends bva> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bwc<E>>> b;
   private static final int c = 20;
   private final Map<cee<?>, Optional<? extends ced<?>>> d = Maps.newHashMap();
   private final Map<cfl<? extends cfk<? super E>>, cfk<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cqe, Set<bwu<? super E>>>> f = Maps.newTreeMap();
   private cqg g = cqg.c;
   private final Map<cqe, Set<Pair<cee<?>, cef>>> h = Maps.newHashMap();
   private final Map<cqe, Set<cee<?>>> i = Maps.newHashMap();
   private Set<cqe> j = Sets.newHashSet();
   private final Set<cqe> k = Sets.newHashSet();
   private cqe l = cqe.b;
   private long m = -9999L;

   public static <E extends bva> bwc.b<E> a(Collection<? extends cee<?>> $$0, Collection<? extends cfl<? extends cfk<? super E>>> $$1) {
      return new bwc.b<>($$0, $$1);
   }

   public static <E extends bva> Codec<bwc<E>> b(final Collection<? extends cee<?>> $$0, final Collection<? extends cfl<? extends cfk<? super E>>> $$1) {
      final MutableObject<Codec<bwc<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bwc<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> ly.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bwc<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bwc.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cee<?>> $$3x = ly.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bwc.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bwc.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bwc.a::error)
                     .<ImmutableList<bwc.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bwc<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bwc.a<U>> a(cee<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bwc.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bwc<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bwc<E>>)$$2.getValue();
   }

   public bwc(
      Collection<? extends cee<?>> $$0, Collection<? extends cfl<? extends cfk<? super E>>> $$1, ImmutableList<bwc.a<?>> $$2, Supplier<Codec<bwc<E>>> $$3
   ) {
      this.b = $$3;

      for (cee<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cfl<? extends cfk<? super E>> $$5 : $$1) {
         this.e.put($$5, (cfk<? super E>)$$5.a());
      }

      for (cfk<? super E> $$6 : this.e.values()) {
         for (cee<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bwc.a<?> $$8 = (bwc.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bwc.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bwc.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cee<?> $$0) {
      return this.a($$0, cef.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cee<?>)$$0, Optional.empty()));
   }

   public <U> void b(cee<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cee<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cee<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(ced.a($$1, $$2)));
   }

   public <U> void a(cee<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(ced::a));
   }

   <U> void b(cee<U> $$0, Optional<? extends ced<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cee<U> $$0) {
      Optional<? extends ced<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(ced::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cee<U> $$0) {
      Optional<? extends ced<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(ced::c);
   }

   public <U> long e(cee<U> $$0) {
      Optional<? extends ced<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(ced::b).orElse(0L);
   }

   @Deprecated
   @baq
   public Map<cee<?>, Optional<? extends ced<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cee<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cee<?> $$0, cef $$1) {
      Optional<? extends ced<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cef.c || $$1 == cef.a && $$2.isPresent() || $$1 == cef.b && $$2.isEmpty();
   }

   public cqg c() {
      return this.g;
   }

   public void a(cqg $$0) {
      this.g = $$0;
   }

   public void a(Set<cqe> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @baq
   public Set<cqe> d() {
      return this.k;
   }

   @Deprecated
   @baq
   public List<bwu<? super E>> e() {
      List<bwu<? super E>> $$0 = new ObjectArrayList();

      for (Map<cqe, Set<bwu<? super E>>> $$1 : this.f.values()) {
         for (Set<bwu<? super E>> $$2 : $$1.values()) {
            for (bwu<? super E> $$3 : $$2) {
               if ($$3.a() == bwt.a.b) {
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

   public Optional<cqe> g() {
      for (cqe $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cqe $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cqe $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cqe $$0) {
      for (cqe $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cee<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cee<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cqe $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cqe> $$0) {
      for (cqe $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cqe $$0) {
      this.l = $$0;
   }

   public void a(cqe $$0, int $$1, ImmutableList<? extends bwu<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cqe $$0, int $$1, ImmutableList<? extends bwu<? super E>> $$2, cee<?> $$3) {
      Set<Pair<cee<?>, cef>> $$4 = ImmutableSet.of(Pair.of($$3, cef.a));
      Set<cee<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cqe $$0, ImmutableList<? extends Pair<Integer, ? extends bwu<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cqe $$0, ImmutableList<? extends Pair<Integer, ? extends bwu<? super E>>> $$1, Set<Pair<cee<?>, cef>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cqe $$0, ImmutableList<? extends Pair<Integer, ? extends bwu<? super E>>> $$1, Set<Pair<cee<?>, cef>> $$2, Set<cee<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bwu<? super E>> $$4 = (Pair<Integer, ? extends bwu<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bwu<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cqe $$0) {
      return this.k.contains($$0);
   }

   public bwc<E> i() {
      bwc<E> $$0 = new bwc<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cee<?>, Optional<? extends ced<?>>> $$1 : this.d.entrySet()) {
         cee<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(arn $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(arn $$0, E $$1) {
      for (cfk<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cee<?>, Optional<? extends ced<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            ced<?> $$1 = (ced<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arn $$0, E $$1) {
      long $$2 = $$1.dX().aa();

      for (bwu<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arn $$0, E $$1) {
      long $$2 = $$0.aa();

      for (Map<cqe, Set<bwu<? super E>>> $$3 : this.f.values()) {
         for (Entry<cqe, Set<bwu<? super E>>> $$4 : $$3.entrySet()) {
            cqe $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bwu<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bwt.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arn $$0, E $$1) {
      long $$2 = $$0.aa();

      for (bwu<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cqe $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cee<?>, cef> $$1 : this.h.get($$0)) {
            cee<?> $$2 = (cee<?>)$$1.getFirst();
            cef $$3 = (cef)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bwu<? super E>>> a(int $$0, ImmutableList<? extends bwu<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bwu<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bwu<? super E> $$4 = (bwu<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cee<U> a;
      private final Optional<? extends ced<U>> b;

      static <U> bwc.a<U> a(cee<U> $$0, Optional<? extends ced<?>> $$1) {
         return new bwc.a<>($$0, (Optional<? extends ced<U>>)$$1);
      }

      a(cee<U> $$0, Optional<? extends ced<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bwc<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(ly.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bva> {
      private final Collection<? extends cee<?>> a;
      private final Collection<? extends cfl<? extends cfk<? super E>>> b;
      private final Codec<bwc<E>> c;

      b(Collection<? extends cee<?>> $$0, Collection<? extends cfl<? extends cfk<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bwc.b($$0, $$1);
      }

      public bwc<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bwc.a::error).orElseGet(() -> new bwc<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
