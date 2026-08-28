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

public class byc<E extends bxc> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<byc<E>>> b;
   private static final int c = 20;
   private final Map<cge<?>, Optional<? extends cgd<?>>> d = Maps.newHashMap();
   private final Map<chl<? extends chk<? super E>>, chk<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<csr, Set<byu<? super E>>>> f = Maps.newTreeMap();
   private cst g = cst.c;
   private final Map<csr, Set<Pair<cge<?>, cgf>>> h = Maps.newHashMap();
   private final Map<csr, Set<cge<?>>> i = Maps.newHashMap();
   private Set<csr> j = Sets.newHashSet();
   private final Set<csr> k = Sets.newHashSet();
   private csr l = csr.b;
   private long m = -9999L;

   public static <E extends bxc> byc.b<E> a(Collection<? extends cge<?>> $$0, Collection<? extends chl<? extends chk<? super E>>> $$1) {
      return new byc.b<>($$0, $$1);
   }

   public static <E extends bxc> Codec<byc<E>> b(final Collection<? extends cge<?>> $$0, final Collection<? extends chl<? extends chk<? super E>>> $$1) {
      final MutableObject<Codec<byc<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<byc<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> mf.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<byc<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<byc.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cge<?>> $$3x = mf.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends byc.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<byc.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(byc.a::error)
                     .<ImmutableList<byc.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new byc<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<byc.a<U>> a(cge<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new byc.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(byc<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<byc<E>>)$$2.getValue();
   }

   public byc(
      Collection<? extends cge<?>> $$0, Collection<? extends chl<? extends chk<? super E>>> $$1, ImmutableList<byc.a<?>> $$2, Supplier<Codec<byc<E>>> $$3
   ) {
      this.b = $$3;

      for (cge<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (chl<? extends chk<? super E>> $$5 : $$1) {
         this.e.put($$5, (chk<? super E>)$$5.a());
      }

      for (chk<? super E> $$6 : this.e.values()) {
         for (cge<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         byc.a<?> $$8 = (byc.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<byc.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> byc.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cge<?> $$0) {
      return this.a($$0, cgf.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cge<?>)$$0, Optional.empty()));
   }

   public <U> void b(cge<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cge<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cge<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cgd.a($$1, $$2)));
   }

   public <U> void a(cge<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cgd::a));
   }

   <U> void b(cge<U> $$0, Optional<? extends cgd<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cge<U> $$0) {
      Optional<? extends cgd<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cgd::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cge<U> $$0) {
      Optional<? extends cgd<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cgd::c);
   }

   public <U> long e(cge<U> $$0) {
      Optional<? extends cgd<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cgd::b).orElse(0L);
   }

   @Deprecated
   @bav
   public Map<cge<?>, Optional<? extends cgd<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cge<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cge<?> $$0, cgf $$1) {
      Optional<? extends cgd<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cgf.c || $$1 == cgf.a && $$2.isPresent() || $$1 == cgf.b && $$2.isEmpty();
   }

   public cst c() {
      return this.g;
   }

   public void a(cst $$0) {
      this.g = $$0;
   }

   public void a(Set<csr> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bav
   public Set<csr> d() {
      return this.k;
   }

   @Deprecated
   @bav
   public List<byu<? super E>> e() {
      List<byu<? super E>> $$0 = new ObjectArrayList();

      for (Map<csr, Set<byu<? super E>>> $$1 : this.f.values()) {
         for (Set<byu<? super E>> $$2 : $$1.values()) {
            for (byu<? super E> $$3 : $$2) {
               if ($$3.a() == byt.a.b) {
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

   public Optional<csr> g() {
      for (csr $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(csr $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(csr $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(csr $$0) {
      for (csr $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cge<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cge<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         csr $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<csr> $$0) {
      for (csr $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(csr $$0) {
      this.l = $$0;
   }

   public void a(csr $$0, int $$1, ImmutableList<? extends byu<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(csr $$0, int $$1, ImmutableList<? extends byu<? super E>> $$2, cge<?> $$3) {
      Set<Pair<cge<?>, cgf>> $$4 = ImmutableSet.of(Pair.of($$3, cgf.a));
      Set<cge<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(csr $$0, ImmutableList<? extends Pair<Integer, ? extends byu<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(csr $$0, int $$1, ImmutableList<? extends byu<? super E>> $$2, Set<Pair<cge<?>, cgf>> $$3) {
      this.a($$0, this.a($$1, $$2), $$3);
   }

   public void a(csr $$0, ImmutableList<? extends Pair<Integer, ? extends byu<? super E>>> $$1, Set<Pair<cge<?>, cgf>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(csr $$0, ImmutableList<? extends Pair<Integer, ? extends byu<? super E>>> $$1, Set<Pair<cge<?>, cgf>> $$2, Set<cge<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends byu<? super E>> $$4 = (Pair<Integer, ? extends byu<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((byu<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(csr $$0) {
      return this.k.contains($$0);
   }

   public byc<E> i() {
      byc<E> $$0 = new byc<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cge<?>, Optional<? extends cgd<?>>> $$1 : this.d.entrySet()) {
         cge<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(arq $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(arq $$0, E $$1) {
      for (chk<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cge<?>, Optional<? extends cgd<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cgd<?> $$1 = (cgd<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arq $$0, E $$1) {
      long $$2 = $$1.dV().ae();

      for (byu<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arq $$0, E $$1) {
      long $$2 = $$0.ae();

      for (Map<csr, Set<byu<? super E>>> $$3 : this.f.values()) {
         for (Entry<csr, Set<byu<? super E>>> $$4 : $$3.entrySet()) {
            csr $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (byu<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == byt.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arq $$0, E $$1) {
      long $$2 = $$0.ae();

      for (byu<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(csr $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cge<?>, cgf> $$1 : this.h.get($$0)) {
            cge<?> $$2 = (cge<?>)$$1.getFirst();
            cgf $$3 = (cgf)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends byu<? super E>>> a(int $$0, ImmutableList<? extends byu<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends byu<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         byu<? super E> $$4 = (byu<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cge<U> a;
      private final Optional<? extends cgd<U>> b;

      static <U> byc.a<U> a(cge<U> $$0, Optional<? extends cgd<?>> $$1) {
         return new byc.a<>($$0, (Optional<? extends cgd<U>>)$$1);
      }

      a(cge<U> $$0, Optional<? extends cgd<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(byc<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mf.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bxc> {
      private final Collection<? extends cge<?>> a;
      private final Collection<? extends chl<? extends chk<? super E>>> b;
      private final Codec<byc<E>> c;

      b(Collection<? extends cge<?>> $$0, Collection<? extends chl<? extends chk<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = byc.b($$0, $$1);
      }

      public byc<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(byc.a::error).orElseGet(() -> new byc<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
