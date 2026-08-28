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

public class bvg<E extends buf> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bvg<E>>> b;
   private static final int c = 20;
   private final Map<cdi<?>, Optional<? extends cdh<?>>> d = Maps.newHashMap();
   private final Map<cep<? extends ceo<? super E>>, ceo<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cpg, Set<bvy<? super E>>>> f = Maps.newTreeMap();
   private cpi g = cpi.c;
   private final Map<cpg, Set<Pair<cdi<?>, cdj>>> h = Maps.newHashMap();
   private final Map<cpg, Set<cdi<?>>> i = Maps.newHashMap();
   private Set<cpg> j = Sets.newHashSet();
   private final Set<cpg> k = Sets.newHashSet();
   private cpg l = cpg.b;
   private long m = -9999L;

   public static <E extends buf> bvg.b<E> a(Collection<? extends cdi<?>> $$0, Collection<? extends cep<? extends ceo<? super E>>> $$1) {
      return new bvg.b<>($$0, $$1);
   }

   public static <E extends buf> Codec<bvg<E>> b(final Collection<? extends cdi<?>> $$0, final Collection<? extends cep<? extends ceo<? super E>>> $$1) {
      final MutableObject<Codec<bvg<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bvg<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> lu.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bvg<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bvg.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cdi<?>> $$3x = lu.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bvg.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bvg.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bvg.a::error)
                     .<ImmutableList<bvg.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bvg<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bvg.a<U>> a(cdi<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bvg.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bvg<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bvg<E>>)$$2.getValue();
   }

   public bvg(
      Collection<? extends cdi<?>> $$0, Collection<? extends cep<? extends ceo<? super E>>> $$1, ImmutableList<bvg.a<?>> $$2, Supplier<Codec<bvg<E>>> $$3
   ) {
      this.b = $$3;

      for (cdi<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cep<? extends ceo<? super E>> $$5 : $$1) {
         this.e.put($$5, (ceo<? super E>)$$5.a());
      }

      for (ceo<? super E> $$6 : this.e.values()) {
         for (cdi<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bvg.a<?> $$8 = (bvg.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bvg.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bvg.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cdi<?> $$0) {
      return this.a($$0, cdj.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cdi<?>)$$0, Optional.empty()));
   }

   public <U> void b(cdi<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cdi<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cdi<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cdh.a($$1, $$2)));
   }

   public <U> void a(cdi<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cdh::a));
   }

   <U> void b(cdi<U> $$0, Optional<? extends cdh<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cdi<U> $$0) {
      Optional<? extends cdh<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cdh::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cdi<U> $$0) {
      Optional<? extends cdh<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cdh::c);
   }

   public <U> long e(cdi<U> $$0) {
      Optional<? extends cdh<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cdh::b).orElse(0L);
   }

   @Deprecated
   @bai
   public Map<cdi<?>, Optional<? extends cdh<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cdi<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cdi<?> $$0, cdj $$1) {
      Optional<? extends cdh<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cdj.c || $$1 == cdj.a && $$2.isPresent() || $$1 == cdj.b && $$2.isEmpty();
   }

   public cpi c() {
      return this.g;
   }

   public void a(cpi $$0) {
      this.g = $$0;
   }

   public void a(Set<cpg> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bai
   public Set<cpg> d() {
      return this.k;
   }

   @Deprecated
   @bai
   public List<bvy<? super E>> e() {
      List<bvy<? super E>> $$0 = new ObjectArrayList();

      for (Map<cpg, Set<bvy<? super E>>> $$1 : this.f.values()) {
         for (Set<bvy<? super E>> $$2 : $$1.values()) {
            for (bvy<? super E> $$3 : $$2) {
               if ($$3.a() == bvx.a.b) {
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

   public Optional<cpg> g() {
      for (cpg $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cpg $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cpg $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cpg $$0) {
      for (cpg $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cdi<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cdi<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cpg $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cpg> $$0) {
      for (cpg $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cpg $$0) {
      this.l = $$0;
   }

   public void a(cpg $$0, int $$1, ImmutableList<? extends bvy<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cpg $$0, int $$1, ImmutableList<? extends bvy<? super E>> $$2, cdi<?> $$3) {
      Set<Pair<cdi<?>, cdj>> $$4 = ImmutableSet.of(Pair.of($$3, cdj.a));
      Set<cdi<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cpg $$0, ImmutableList<? extends Pair<Integer, ? extends bvy<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cpg $$0, ImmutableList<? extends Pair<Integer, ? extends bvy<? super E>>> $$1, Set<Pair<cdi<?>, cdj>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cpg $$0, ImmutableList<? extends Pair<Integer, ? extends bvy<? super E>>> $$1, Set<Pair<cdi<?>, cdj>> $$2, Set<cdi<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bvy<? super E>> $$4 = (Pair<Integer, ? extends bvy<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bvy<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cpg $$0) {
      return this.k.contains($$0);
   }

   public bvg<E> i() {
      bvg<E> $$0 = new bvg<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cdi<?>, Optional<? extends cdh<?>>> $$1 : this.d.entrySet()) {
         cdi<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(arg $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(arg $$0, E $$1) {
      for (ceo<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cdi<?>, Optional<? extends cdh<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cdh<?> $$1 = (cdh<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arg $$0, E $$1) {
      long $$2 = $$1.dS().aa();

      for (bvy<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arg $$0, E $$1) {
      long $$2 = $$0.aa();

      for (Map<cpg, Set<bvy<? super E>>> $$3 : this.f.values()) {
         for (Entry<cpg, Set<bvy<? super E>>> $$4 : $$3.entrySet()) {
            cpg $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bvy<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bvx.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arg $$0, E $$1) {
      long $$2 = $$0.aa();

      for (bvy<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cpg $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cdi<?>, cdj> $$1 : this.h.get($$0)) {
            cdi<?> $$2 = (cdi<?>)$$1.getFirst();
            cdj $$3 = (cdj)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bvy<? super E>>> a(int $$0, ImmutableList<? extends bvy<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bvy<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bvy<? super E> $$4 = (bvy<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cdi<U> a;
      private final Optional<? extends cdh<U>> b;

      static <U> bvg.a<U> a(cdi<U> $$0, Optional<? extends cdh<?>> $$1) {
         return new bvg.a<>($$0, (Optional<? extends cdh<U>>)$$1);
      }

      a(cdi<U> $$0, Optional<? extends cdh<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bvg<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(lu.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends buf> {
      private final Collection<? extends cdi<?>> a;
      private final Collection<? extends cep<? extends ceo<? super E>>> b;
      private final Codec<bvg<E>> c;

      b(Collection<? extends cdi<?>> $$0, Collection<? extends cep<? extends ceo<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bvg.b($$0, $$1);
      }

      public bvg<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bvg.a::error).orElseGet(() -> new bvg<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
