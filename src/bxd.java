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

public class bxd<E extends bwb> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bxd<E>>> b;
   private static final int c = 20;
   private final Map<cff<?>, Optional<? extends cfe<?>>> d = Maps.newHashMap();
   private final Map<cgm<? extends cgl<? super E>>, cgl<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<crj, Set<bxv<? super E>>>> f = Maps.newTreeMap();
   private crl g = crl.c;
   private final Map<crj, Set<Pair<cff<?>, cfg>>> h = Maps.newHashMap();
   private final Map<crj, Set<cff<?>>> i = Maps.newHashMap();
   private Set<crj> j = Sets.newHashSet();
   private final Set<crj> k = Sets.newHashSet();
   private crj l = crj.b;
   private long m = -9999L;

   public static <E extends bwb> bxd.b<E> a(Collection<? extends cff<?>> $$0, Collection<? extends cgm<? extends cgl<? super E>>> $$1) {
      return new bxd.b<>($$0, $$1);
   }

   public static <E extends bwb> Codec<bxd<E>> b(final Collection<? extends cff<?>> $$0, final Collection<? extends cgm<? extends cgl<? super E>>> $$1) {
      final MutableObject<Codec<bxd<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bxd<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> ma.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bxd<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bxd.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cff<?>> $$3x = ma.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bxd.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bxd.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bxd.a::error)
                     .<ImmutableList<bxd.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bxd<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bxd.a<U>> a(cff<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bxd.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bxd<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bxd<E>>)$$2.getValue();
   }

   public bxd(
      Collection<? extends cff<?>> $$0, Collection<? extends cgm<? extends cgl<? super E>>> $$1, ImmutableList<bxd.a<?>> $$2, Supplier<Codec<bxd<E>>> $$3
   ) {
      this.b = $$3;

      for (cff<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cgm<? extends cgl<? super E>> $$5 : $$1) {
         this.e.put($$5, (cgl<? super E>)$$5.a());
      }

      for (cgl<? super E> $$6 : this.e.values()) {
         for (cff<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bxd.a<?> $$8 = (bxd.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bxd.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bxd.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cff<?> $$0) {
      return this.a($$0, cfg.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cff<?>)$$0, Optional.empty()));
   }

   public <U> void b(cff<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cff<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cff<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cfe.a($$1, $$2)));
   }

   public <U> void a(cff<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cfe::a));
   }

   <U> void b(cff<U> $$0, Optional<? extends cfe<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cff<U> $$0) {
      Optional<? extends cfe<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cfe::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cff<U> $$0) {
      Optional<? extends cfe<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cfe::c);
   }

   public <U> long e(cff<U> $$0) {
      Optional<? extends cfe<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cfe::b).orElse(0L);
   }

   @Deprecated
   @bbl
   public Map<cff<?>, Optional<? extends cfe<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cff<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cff<?> $$0, cfg $$1) {
      Optional<? extends cfe<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cfg.c || $$1 == cfg.a && $$2.isPresent() || $$1 == cfg.b && $$2.isEmpty();
   }

   public crl c() {
      return this.g;
   }

   public void a(crl $$0) {
      this.g = $$0;
   }

   public void a(Set<crj> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bbl
   public Set<crj> d() {
      return this.k;
   }

   @Deprecated
   @bbl
   public List<bxv<? super E>> e() {
      List<bxv<? super E>> $$0 = new ObjectArrayList();

      for (Map<crj, Set<bxv<? super E>>> $$1 : this.f.values()) {
         for (Set<bxv<? super E>> $$2 : $$1.values()) {
            for (bxv<? super E> $$3 : $$2) {
               if ($$3.a() == bxu.a.b) {
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

   public Optional<crj> g() {
      for (crj $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(crj $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(crj $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(crj $$0) {
      for (crj $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cff<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cff<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         crj $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<crj> $$0) {
      for (crj $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(crj $$0) {
      this.l = $$0;
   }

   public void a(crj $$0, int $$1, ImmutableList<? extends bxv<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(crj $$0, int $$1, ImmutableList<? extends bxv<? super E>> $$2, cff<?> $$3) {
      Set<Pair<cff<?>, cfg>> $$4 = ImmutableSet.of(Pair.of($$3, cfg.a));
      Set<cff<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(crj $$0, ImmutableList<? extends Pair<Integer, ? extends bxv<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(crj $$0, ImmutableList<? extends Pair<Integer, ? extends bxv<? super E>>> $$1, Set<Pair<cff<?>, cfg>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(crj $$0, ImmutableList<? extends Pair<Integer, ? extends bxv<? super E>>> $$1, Set<Pair<cff<?>, cfg>> $$2, Set<cff<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bxv<? super E>> $$4 = (Pair<Integer, ? extends bxv<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bxv<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(crj $$0) {
      return this.k.contains($$0);
   }

   public bxd<E> i() {
      bxd<E> $$0 = new bxd<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cff<?>, Optional<? extends cfe<?>>> $$1 : this.d.entrySet()) {
         cff<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(ash $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(ash $$0, E $$1) {
      for (cgl<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cff<?>, Optional<? extends cfe<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cfe<?> $$1 = (cfe<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(ash $$0, E $$1) {
      long $$2 = $$1.dV().ac();

      for (bxv<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(ash $$0, E $$1) {
      long $$2 = $$0.ac();

      for (Map<crj, Set<bxv<? super E>>> $$3 : this.f.values()) {
         for (Entry<crj, Set<bxv<? super E>>> $$4 : $$3.entrySet()) {
            crj $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bxv<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bxu.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(ash $$0, E $$1) {
      long $$2 = $$0.ac();

      for (bxv<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(crj $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cff<?>, cfg> $$1 : this.h.get($$0)) {
            cff<?> $$2 = (cff<?>)$$1.getFirst();
            cfg $$3 = (cfg)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bxv<? super E>>> a(int $$0, ImmutableList<? extends bxv<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bxv<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bxv<? super E> $$4 = (bxv<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cff<U> a;
      private final Optional<? extends cfe<U>> b;

      static <U> bxd.a<U> a(cff<U> $$0, Optional<? extends cfe<?>> $$1) {
         return new bxd.a<>($$0, (Optional<? extends cfe<U>>)$$1);
      }

      a(cff<U> $$0, Optional<? extends cfe<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bxd<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(ma.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bwb> {
      private final Collection<? extends cff<?>> a;
      private final Collection<? extends cgm<? extends cgl<? super E>>> b;
      private final Codec<bxd<E>> c;

      b(Collection<? extends cff<?>> $$0, Collection<? extends cgm<? extends cgl<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bxd.b($$0, $$1);
      }

      public bxd<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bxd.a::error).orElseGet(() -> new bxd<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
