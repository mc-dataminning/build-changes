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

public class byu<E extends bxu> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<byu<E>>> b;
   private static final int c = 20;
   private final Map<cgw<?>, Optional<? extends cgv<?>>> d = Maps.newHashMap();
   private final Map<cid<? extends cic<? super E>>, cic<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<ctr, Set<bzm<? super E>>>> f = Maps.newTreeMap();
   private ctt g = ctt.c;
   private final Map<ctr, Set<Pair<cgw<?>, cgx>>> h = Maps.newHashMap();
   private final Map<ctr, Set<cgw<?>>> i = Maps.newHashMap();
   private Set<ctr> j = Sets.newHashSet();
   private final Set<ctr> k = Sets.newHashSet();
   private ctr l = ctr.b;
   private long m = -9999L;

   public static <E extends bxu> byu.b<E> a(Collection<? extends cgw<?>> $$0, Collection<? extends cid<? extends cic<? super E>>> $$1) {
      return new byu.b<>($$0, $$1);
   }

   public static <E extends bxu> Codec<byu<E>> b(final Collection<? extends cgw<?>> $$0, final Collection<? extends cid<? extends cic<? super E>>> $$1) {
      final MutableObject<Codec<byu<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<byu<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> mg.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<byu<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<byu.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cgw<?>> $$3x = mg.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends byu.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<byu.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(byu.a::error)
                     .<ImmutableList<byu.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new byu<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<byu.a<U>> a(cgw<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new byu.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(byu<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<byu<E>>)$$2.getValue();
   }

   public byu(
      Collection<? extends cgw<?>> $$0, Collection<? extends cid<? extends cic<? super E>>> $$1, ImmutableList<byu.a<?>> $$2, Supplier<Codec<byu<E>>> $$3
   ) {
      this.b = $$3;

      for (cgw<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cid<? extends cic<? super E>> $$5 : $$1) {
         this.e.put($$5, (cic<? super E>)$$5.a());
      }

      for (cic<? super E> $$6 : this.e.values()) {
         for (cgw<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         byu.a<?> $$8 = (byu.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<byu.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> byu.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cgw<?> $$0) {
      return this.a($$0, cgx.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cgw<?>)$$0, Optional.empty()));
   }

   public <U> void b(cgw<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cgw<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cgw<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cgv.a($$1, $$2)));
   }

   public <U> void a(cgw<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cgv::a));
   }

   <U> void b(cgw<U> $$0, Optional<? extends cgv<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cgw<U> $$0) {
      Optional<? extends cgv<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cgv::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cgw<U> $$0) {
      Optional<? extends cgv<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cgv::c);
   }

   public <U> long e(cgw<U> $$0) {
      Optional<? extends cgv<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cgv::b).orElse(0L);
   }

   @Deprecated
   @bax
   public Map<cgw<?>, Optional<? extends cgv<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cgw<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cgw<?> $$0, cgx $$1) {
      Optional<? extends cgv<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cgx.c || $$1 == cgx.a && $$2.isPresent() || $$1 == cgx.b && $$2.isEmpty();
   }

   public ctt c() {
      return this.g;
   }

   public void a(ctt $$0) {
      this.g = $$0;
   }

   public void a(Set<ctr> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bax
   public Set<ctr> d() {
      return this.k;
   }

   @Deprecated
   @bax
   public List<bzm<? super E>> e() {
      List<bzm<? super E>> $$0 = new ObjectArrayList();

      for (Map<ctr, Set<bzm<? super E>>> $$1 : this.f.values()) {
         for (Set<bzm<? super E>> $$2 : $$1.values()) {
            for (bzm<? super E> $$3 : $$2) {
               if ($$3.a() == bzl.a.b) {
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

   public Optional<ctr> g() {
      for (ctr $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(ctr $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(ctr $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(ctr $$0) {
      for (ctr $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cgw<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cgw<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         ctr $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<ctr> $$0) {
      for (ctr $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(ctr $$0) {
      this.l = $$0;
   }

   public void a(ctr $$0, int $$1, ImmutableList<? extends bzm<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(ctr $$0, int $$1, ImmutableList<? extends bzm<? super E>> $$2, cgw<?> $$3) {
      Set<Pair<cgw<?>, cgx>> $$4 = ImmutableSet.of(Pair.of($$3, cgx.a));
      Set<cgw<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(ctr $$0, ImmutableList<? extends Pair<Integer, ? extends bzm<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(ctr $$0, int $$1, ImmutableList<? extends bzm<? super E>> $$2, Set<Pair<cgw<?>, cgx>> $$3) {
      this.a($$0, this.a($$1, $$2), $$3);
   }

   public void a(ctr $$0, ImmutableList<? extends Pair<Integer, ? extends bzm<? super E>>> $$1, Set<Pair<cgw<?>, cgx>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(ctr $$0, ImmutableList<? extends Pair<Integer, ? extends bzm<? super E>>> $$1, Set<Pair<cgw<?>, cgx>> $$2, Set<cgw<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bzm<? super E>> $$4 = (Pair<Integer, ? extends bzm<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bzm<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(ctr $$0) {
      return this.k.contains($$0);
   }

   public byu<E> i() {
      byu<E> $$0 = new byu<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cgw<?>, Optional<? extends cgv<?>>> $$1 : this.d.entrySet()) {
         cgw<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(ars $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(ars $$0, E $$1) {
      for (cic<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cgw<?>, Optional<? extends cgv<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cgv<?> $$1 = (cgv<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(ars $$0, E $$1) {
      long $$2 = $$1.dV().ae();

      for (bzm<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(ars $$0, E $$1) {
      long $$2 = $$0.ae();

      for (Map<ctr, Set<bzm<? super E>>> $$3 : this.f.values()) {
         for (Entry<ctr, Set<bzm<? super E>>> $$4 : $$3.entrySet()) {
            ctr $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bzm<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bzl.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(ars $$0, E $$1) {
      long $$2 = $$0.ae();

      for (bzm<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(ctr $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cgw<?>, cgx> $$1 : this.h.get($$0)) {
            cgw<?> $$2 = (cgw<?>)$$1.getFirst();
            cgx $$3 = (cgx)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bzm<? super E>>> a(int $$0, ImmutableList<? extends bzm<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bzm<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bzm<? super E> $$4 = (bzm<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cgw<U> a;
      private final Optional<? extends cgv<U>> b;

      static <U> byu.a<U> a(cgw<U> $$0, Optional<? extends cgv<?>> $$1) {
         return new byu.a<>($$0, (Optional<? extends cgv<U>>)$$1);
      }

      a(cgw<U> $$0, Optional<? extends cgv<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(byu<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mg.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bxu> {
      private final Collection<? extends cgw<?>> a;
      private final Collection<? extends cid<? extends cic<? super E>>> b;
      private final Codec<byu<E>> c;

      b(Collection<? extends cgw<?>> $$0, Collection<? extends cid<? extends cic<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = byu.b($$0, $$1);
      }

      public byu<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(byu.a::error).orElseGet(() -> new byu<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
