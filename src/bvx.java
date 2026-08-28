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

public class bvx<E extends buv> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bvx<E>>> b;
   private static final int c = 20;
   private final Map<cdz<?>, Optional<? extends cdy<?>>> d = Maps.newHashMap();
   private final Map<cfg<? extends cff<? super E>>, cff<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cpz, Set<bwp<? super E>>>> f = Maps.newTreeMap();
   private cqb g = cqb.c;
   private final Map<cpz, Set<Pair<cdz<?>, cea>>> h = Maps.newHashMap();
   private final Map<cpz, Set<cdz<?>>> i = Maps.newHashMap();
   private Set<cpz> j = Sets.newHashSet();
   private final Set<cpz> k = Sets.newHashSet();
   private cpz l = cpz.b;
   private long m = -9999L;

   public static <E extends buv> bvx.b<E> a(Collection<? extends cdz<?>> $$0, Collection<? extends cfg<? extends cff<? super E>>> $$1) {
      return new bvx.b<>($$0, $$1);
   }

   public static <E extends buv> Codec<bvx<E>> b(final Collection<? extends cdz<?>> $$0, final Collection<? extends cfg<? extends cff<? super E>>> $$1) {
      final MutableObject<Codec<bvx<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bvx<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> lx.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bvx<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bvx.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cdz<?>> $$3x = lx.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bvx.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bvx.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bvx.a::error)
                     .<ImmutableList<bvx.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bvx<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bvx.a<U>> a(cdz<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bvx.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bvx<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bvx<E>>)$$2.getValue();
   }

   public bvx(
      Collection<? extends cdz<?>> $$0, Collection<? extends cfg<? extends cff<? super E>>> $$1, ImmutableList<bvx.a<?>> $$2, Supplier<Codec<bvx<E>>> $$3
   ) {
      this.b = $$3;

      for (cdz<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cfg<? extends cff<? super E>> $$5 : $$1) {
         this.e.put($$5, (cff<? super E>)$$5.a());
      }

      for (cff<? super E> $$6 : this.e.values()) {
         for (cdz<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bvx.a<?> $$8 = (bvx.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bvx.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bvx.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cdz<?> $$0) {
      return this.a($$0, cea.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cdz<?>)$$0, Optional.empty()));
   }

   public <U> void b(cdz<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cdz<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cdz<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cdy.a($$1, $$2)));
   }

   public <U> void a(cdz<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cdy::a));
   }

   <U> void b(cdz<U> $$0, Optional<? extends cdy<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cdz<U> $$0) {
      Optional<? extends cdy<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cdy::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cdz<U> $$0) {
      Optional<? extends cdy<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cdy::c);
   }

   public <U> long e(cdz<U> $$0) {
      Optional<? extends cdy<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cdy::b).orElse(0L);
   }

   @Deprecated
   @bap
   public Map<cdz<?>, Optional<? extends cdy<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cdz<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cdz<?> $$0, cea $$1) {
      Optional<? extends cdy<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cea.c || $$1 == cea.a && $$2.isPresent() || $$1 == cea.b && $$2.isEmpty();
   }

   public cqb c() {
      return this.g;
   }

   public void a(cqb $$0) {
      this.g = $$0;
   }

   public void a(Set<cpz> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bap
   public Set<cpz> d() {
      return this.k;
   }

   @Deprecated
   @bap
   public List<bwp<? super E>> e() {
      List<bwp<? super E>> $$0 = new ObjectArrayList();

      for (Map<cpz, Set<bwp<? super E>>> $$1 : this.f.values()) {
         for (Set<bwp<? super E>> $$2 : $$1.values()) {
            for (bwp<? super E> $$3 : $$2) {
               if ($$3.a() == bwo.a.b) {
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

   public Optional<cpz> g() {
      for (cpz $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cpz $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cpz $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cpz $$0) {
      for (cpz $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cdz<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cdz<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cpz $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cpz> $$0) {
      for (cpz $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cpz $$0) {
      this.l = $$0;
   }

   public void a(cpz $$0, int $$1, ImmutableList<? extends bwp<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cpz $$0, int $$1, ImmutableList<? extends bwp<? super E>> $$2, cdz<?> $$3) {
      Set<Pair<cdz<?>, cea>> $$4 = ImmutableSet.of(Pair.of($$3, cea.a));
      Set<cdz<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cpz $$0, ImmutableList<? extends Pair<Integer, ? extends bwp<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cpz $$0, ImmutableList<? extends Pair<Integer, ? extends bwp<? super E>>> $$1, Set<Pair<cdz<?>, cea>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cpz $$0, ImmutableList<? extends Pair<Integer, ? extends bwp<? super E>>> $$1, Set<Pair<cdz<?>, cea>> $$2, Set<cdz<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bwp<? super E>> $$4 = (Pair<Integer, ? extends bwp<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bwp<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cpz $$0) {
      return this.k.contains($$0);
   }

   public bvx<E> i() {
      bvx<E> $$0 = new bvx<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cdz<?>, Optional<? extends cdy<?>>> $$1 : this.d.entrySet()) {
         cdz<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(arm $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(arm $$0, E $$1) {
      for (cff<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cdz<?>, Optional<? extends cdy<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cdy<?> $$1 = (cdy<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arm $$0, E $$1) {
      long $$2 = $$1.dX().aa();

      for (bwp<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arm $$0, E $$1) {
      long $$2 = $$0.aa();

      for (Map<cpz, Set<bwp<? super E>>> $$3 : this.f.values()) {
         for (Entry<cpz, Set<bwp<? super E>>> $$4 : $$3.entrySet()) {
            cpz $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bwp<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bwo.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arm $$0, E $$1) {
      long $$2 = $$0.aa();

      for (bwp<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cpz $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cdz<?>, cea> $$1 : this.h.get($$0)) {
            cdz<?> $$2 = (cdz<?>)$$1.getFirst();
            cea $$3 = (cea)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bwp<? super E>>> a(int $$0, ImmutableList<? extends bwp<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bwp<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bwp<? super E> $$4 = (bwp<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cdz<U> a;
      private final Optional<? extends cdy<U>> b;

      static <U> bvx.a<U> a(cdz<U> $$0, Optional<? extends cdy<?>> $$1) {
         return new bvx.a<>($$0, (Optional<? extends cdy<U>>)$$1);
      }

      a(cdz<U> $$0, Optional<? extends cdy<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bvx<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(lx.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends buv> {
      private final Collection<? extends cdz<?>> a;
      private final Collection<? extends cfg<? extends cff<? super E>>> b;
      private final Codec<bvx<E>> c;

      b(Collection<? extends cdz<?>> $$0, Collection<? extends cfg<? extends cff<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bvx.b($$0, $$1);
      }

      public bvx<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bvx.a::error).orElseGet(() -> new bvx<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
