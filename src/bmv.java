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

public class bmv<E extends blv> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bmv<E>>> b;
   private static final int c = 20;
   private final Map<bux<?>, Optional<? extends buw<?>>> d = Maps.newHashMap();
   private final Map<bwd<? extends bwc<? super E>>, bwc<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cgd, Set<bnn<? super E>>>> f = Maps.newTreeMap();
   private cgf g = cgf.c;
   private final Map<cgd, Set<Pair<bux<?>, buy>>> h = Maps.newHashMap();
   private final Map<cgd, Set<bux<?>>> i = Maps.newHashMap();
   private Set<cgd> j = Sets.newHashSet();
   private final Set<cgd> k = Sets.newHashSet();
   private cgd l = cgd.b;
   private long m = -9999L;

   public static <E extends blv> bmv.b<E> a(Collection<? extends bux<?>> $$0, Collection<? extends bwd<? extends bwc<? super E>>> $$1) {
      return new bmv.b<>($$0, $$1);
   }

   public static <E extends blv> Codec<bmv<E>> b(final Collection<? extends bux<?>> $$0, final Collection<? extends bwd<? extends bwc<? super E>>> $$1) {
      final MutableObject<Codec<bmv<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bmv<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> kb.B.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bmv<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bmv.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<bux<?>> $$3x = kb.B.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bmv.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bmv.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bmv.a::error)
                     .<ImmutableList<bmv.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bmv<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bmv.a<U>> a(bux<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bmv.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bmv<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bmv<E>>)$$2.getValue();
   }

   public bmv(
      Collection<? extends bux<?>> $$0, Collection<? extends bwd<? extends bwc<? super E>>> $$1, ImmutableList<bmv.a<?>> $$2, Supplier<Codec<bmv<E>>> $$3
   ) {
      this.b = $$3;

      for (bux<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (bwd<? extends bwc<? super E>> $$5 : $$1) {
         this.e.put($$5, (bwc<? super E>)$$5.a());
      }

      for (bwc<? super E> $$6 : this.e.values()) {
         for (bux<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bmv.a<?> $$8 = (bmv.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bmv.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bmv.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(bux<?> $$0) {
      return this.a($$0, buy.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((bux<?>)$$0, Optional.empty()));
   }

   public <U> void b(bux<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(bux<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(bux<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(buw.a($$1, $$2)));
   }

   public <U> void a(bux<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(buw::a));
   }

   <U> void b(bux<U> $$0, Optional<? extends buw<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(bux<U> $$0) {
      Optional<? extends buw<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(buw::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(bux<U> $$0) {
      Optional<? extends buw<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(buw::c);
   }

   public <U> long e(bux<U> $$0) {
      Optional<? extends buw<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(buw::b).orElse(0L);
   }

   @Deprecated
   @avd
   public Map<bux<?>, Optional<? extends buw<?>>> b() {
      return this.d;
   }

   public <U> boolean b(bux<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(bux<?> $$0, buy $$1) {
      Optional<? extends buw<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == buy.c || $$1 == buy.a && $$2.isPresent() || $$1 == buy.b && $$2.isEmpty();
   }

   public cgf c() {
      return this.g;
   }

   public void a(cgf $$0) {
      this.g = $$0;
   }

   public void a(Set<cgd> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @avd
   public Set<cgd> d() {
      return this.k;
   }

   @Deprecated
   @avd
   public List<bnn<? super E>> e() {
      List<bnn<? super E>> $$0 = new ObjectArrayList();

      for (Map<cgd, Set<bnn<? super E>>> $$1 : this.f.values()) {
         for (Set<bnn<? super E>> $$2 : $$1.values()) {
            for (bnn<? super E> $$3 : $$2) {
               if ($$3.a() == bnm.a.b) {
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

   public Optional<cgd> g() {
      for (cgd $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cgd $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cgd $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cgd $$0) {
      for (cgd $$1 : this.k) {
         if ($$1 != $$0) {
            Set<bux<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (bux<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cgd $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cgd> $$0) {
      for (cgd $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cgd $$0) {
      this.l = $$0;
   }

   public void a(cgd $$0, int $$1, ImmutableList<? extends bnn<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cgd $$0, int $$1, ImmutableList<? extends bnn<? super E>> $$2, bux<?> $$3) {
      Set<Pair<bux<?>, buy>> $$4 = ImmutableSet.of(Pair.of($$3, buy.a));
      Set<bux<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cgd $$0, ImmutableList<? extends Pair<Integer, ? extends bnn<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cgd $$0, ImmutableList<? extends Pair<Integer, ? extends bnn<? super E>>> $$1, Set<Pair<bux<?>, buy>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cgd $$0, ImmutableList<? extends Pair<Integer, ? extends bnn<? super E>>> $$1, Set<Pair<bux<?>, buy>> $$2, Set<bux<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bnn<? super E>> $$4 = (Pair<Integer, ? extends bnn<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bnn<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cgd $$0) {
      return this.k.contains($$0);
   }

   public bmv<E> i() {
      bmv<E> $$0 = new bmv<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<bux<?>, Optional<? extends buw<?>>> $$1 : this.d.entrySet()) {
         bux<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(amp $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(amp $$0, E $$1) {
      for (bwc<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<bux<?>, Optional<? extends buw<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            buw<?> $$1 = (buw<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(amp $$0, E $$1) {
      long $$2 = $$1.dM().W();

      for (bnn<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(amp $$0, E $$1) {
      long $$2 = $$0.W();

      for (Map<cgd, Set<bnn<? super E>>> $$3 : this.f.values()) {
         for (Entry<cgd, Set<bnn<? super E>>> $$4 : $$3.entrySet()) {
            cgd $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bnn<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bnm.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(amp $$0, E $$1) {
      long $$2 = $$0.W();

      for (bnn<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cgd $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<bux<?>, buy> $$1 : this.h.get($$0)) {
            bux<?> $$2 = (bux<?>)$$1.getFirst();
            buy $$3 = (buy)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bnn<? super E>>> a(int $$0, ImmutableList<? extends bnn<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bnn<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bnn<? super E> $$4 = (bnn<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final bux<U> a;
      private final Optional<? extends buw<U>> b;

      static <U> bmv.a<U> a(bux<U> $$0, Optional<? extends buw<?>> $$1) {
         return new bmv.a<>($$0, (Optional<? extends buw<U>>)$$1);
      }

      a(bux<U> $$0, Optional<? extends buw<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bmv<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(kb.B.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends blv> {
      private final Collection<? extends bux<?>> a;
      private final Collection<? extends bwd<? extends bwc<? super E>>> b;
      private final Codec<bmv<E>> c;

      b(Collection<? extends bux<?>> $$0, Collection<? extends bwd<? extends bwc<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bmv.b($$0, $$1);
      }

      public bmv<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bmv.a::error).orElseGet(() -> new bmv<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
