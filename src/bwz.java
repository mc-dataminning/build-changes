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

public class bwz<E extends bvx> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bwz<E>>> b;
   private static final int c = 20;
   private final Map<cfb<?>, Optional<? extends cfa<?>>> d = Maps.newHashMap();
   private final Map<cgi<? extends cgh<? super E>>, cgh<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<crf, Set<bxr<? super E>>>> f = Maps.newTreeMap();
   private crh g = crh.c;
   private final Map<crf, Set<Pair<cfb<?>, cfc>>> h = Maps.newHashMap();
   private final Map<crf, Set<cfb<?>>> i = Maps.newHashMap();
   private Set<crf> j = Sets.newHashSet();
   private final Set<crf> k = Sets.newHashSet();
   private crf l = crf.b;
   private long m = -9999L;

   public static <E extends bvx> bwz.b<E> a(Collection<? extends cfb<?>> $$0, Collection<? extends cgi<? extends cgh<? super E>>> $$1) {
      return new bwz.b<>($$0, $$1);
   }

   public static <E extends bvx> Codec<bwz<E>> b(final Collection<? extends cfb<?>> $$0, final Collection<? extends cgi<? extends cgh<? super E>>> $$1) {
      final MutableObject<Codec<bwz<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bwz<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> ma.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bwz<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bwz.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cfb<?>> $$3x = ma.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bwz.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bwz.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bwz.a::error)
                     .<ImmutableList<bwz.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bwz<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bwz.a<U>> a(cfb<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bwz.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bwz<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bwz<E>>)$$2.getValue();
   }

   public bwz(
      Collection<? extends cfb<?>> $$0, Collection<? extends cgi<? extends cgh<? super E>>> $$1, ImmutableList<bwz.a<?>> $$2, Supplier<Codec<bwz<E>>> $$3
   ) {
      this.b = $$3;

      for (cfb<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cgi<? extends cgh<? super E>> $$5 : $$1) {
         this.e.put($$5, (cgh<? super E>)$$5.a());
      }

      for (cgh<? super E> $$6 : this.e.values()) {
         for (cfb<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bwz.a<?> $$8 = (bwz.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bwz.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bwz.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cfb<?> $$0) {
      return this.a($$0, cfc.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cfb<?>)$$0, Optional.empty()));
   }

   public <U> void b(cfb<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cfb<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cfb<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cfa.a($$1, $$2)));
   }

   public <U> void a(cfb<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cfa::a));
   }

   <U> void b(cfb<U> $$0, Optional<? extends cfa<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cfb<U> $$0) {
      Optional<? extends cfa<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cfa::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cfb<U> $$0) {
      Optional<? extends cfa<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cfa::c);
   }

   public <U> long e(cfb<U> $$0) {
      Optional<? extends cfa<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cfa::b).orElse(0L);
   }

   @Deprecated
   @bbb
   public Map<cfb<?>, Optional<? extends cfa<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cfb<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cfb<?> $$0, cfc $$1) {
      Optional<? extends cfa<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cfc.c || $$1 == cfc.a && $$2.isPresent() || $$1 == cfc.b && $$2.isEmpty();
   }

   public crh c() {
      return this.g;
   }

   public void a(crh $$0) {
      this.g = $$0;
   }

   public void a(Set<crf> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bbb
   public Set<crf> d() {
      return this.k;
   }

   @Deprecated
   @bbb
   public List<bxr<? super E>> e() {
      List<bxr<? super E>> $$0 = new ObjectArrayList();

      for (Map<crf, Set<bxr<? super E>>> $$1 : this.f.values()) {
         for (Set<bxr<? super E>> $$2 : $$1.values()) {
            for (bxr<? super E> $$3 : $$2) {
               if ($$3.a() == bxq.a.b) {
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

   public Optional<crf> g() {
      for (crf $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(crf $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(crf $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(crf $$0) {
      for (crf $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cfb<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cfb<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         crf $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<crf> $$0) {
      for (crf $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(crf $$0) {
      this.l = $$0;
   }

   public void a(crf $$0, int $$1, ImmutableList<? extends bxr<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(crf $$0, int $$1, ImmutableList<? extends bxr<? super E>> $$2, cfb<?> $$3) {
      Set<Pair<cfb<?>, cfc>> $$4 = ImmutableSet.of(Pair.of($$3, cfc.a));
      Set<cfb<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(crf $$0, ImmutableList<? extends Pair<Integer, ? extends bxr<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(crf $$0, ImmutableList<? extends Pair<Integer, ? extends bxr<? super E>>> $$1, Set<Pair<cfb<?>, cfc>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(crf $$0, ImmutableList<? extends Pair<Integer, ? extends bxr<? super E>>> $$1, Set<Pair<cfb<?>, cfc>> $$2, Set<cfb<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bxr<? super E>> $$4 = (Pair<Integer, ? extends bxr<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bxr<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(crf $$0) {
      return this.k.contains($$0);
   }

   public bwz<E> i() {
      bwz<E> $$0 = new bwz<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cfb<?>, Optional<? extends cfa<?>>> $$1 : this.d.entrySet()) {
         cfb<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(arx $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(arx $$0, E $$1) {
      for (cgh<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cfb<?>, Optional<? extends cfa<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cfa<?> $$1 = (cfa<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arx $$0, E $$1) {
      long $$2 = $$1.dW().ad();

      for (bxr<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arx $$0, E $$1) {
      long $$2 = $$0.ad();

      for (Map<crf, Set<bxr<? super E>>> $$3 : this.f.values()) {
         for (Entry<crf, Set<bxr<? super E>>> $$4 : $$3.entrySet()) {
            crf $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bxr<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bxq.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arx $$0, E $$1) {
      long $$2 = $$0.ad();

      for (bxr<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(crf $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cfb<?>, cfc> $$1 : this.h.get($$0)) {
            cfb<?> $$2 = (cfb<?>)$$1.getFirst();
            cfc $$3 = (cfc)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bxr<? super E>>> a(int $$0, ImmutableList<? extends bxr<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bxr<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bxr<? super E> $$4 = (bxr<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cfb<U> a;
      private final Optional<? extends cfa<U>> b;

      static <U> bwz.a<U> a(cfb<U> $$0, Optional<? extends cfa<?>> $$1) {
         return new bwz.a<>($$0, (Optional<? extends cfa<U>>)$$1);
      }

      a(cfb<U> $$0, Optional<? extends cfa<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bwz<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(ma.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bvx> {
      private final Collection<? extends cfb<?>> a;
      private final Collection<? extends cgi<? extends cgh<? super E>>> b;
      private final Codec<bwz<E>> c;

      b(Collection<? extends cfb<?>> $$0, Collection<? extends cgi<? extends cgh<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bwz.b($$0, $$1);
      }

      public bwz<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bwz.a::error).orElseGet(() -> new bwz<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
