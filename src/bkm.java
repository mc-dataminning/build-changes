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

public class bkm<E extends bjm> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bkm<E>>> b;
   private static final int c = 20;
   private final Map<bsn<?>, Optional<? extends bsm<?>>> d = Maps.newHashMap();
   private final Map<bts<? extends btr<? super E>>, btr<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cdl, Set<ble<? super E>>>> f = Maps.newTreeMap();
   private cdn g = cdn.c;
   private final Map<cdl, Set<Pair<bsn<?>, bso>>> h = Maps.newHashMap();
   private final Map<cdl, Set<bsn<?>>> i = Maps.newHashMap();
   private Set<cdl> j = Sets.newHashSet();
   private final Set<cdl> k = Sets.newHashSet();
   private cdl l = cdl.b;
   private long m = -9999L;

   public static <E extends bjm> bkm.b<E> a(Collection<? extends bsn<?>> $$0, Collection<? extends bts<? extends btr<? super E>>> $$1) {
      return new bkm.b<>($$0, $$1);
   }

   public static <E extends bjm> Codec<bkm<E>> b(final Collection<? extends bsn<?>> $$0, final Collection<? extends bts<? extends btr<? super E>>> $$1) {
      final MutableObject<Codec<bkm<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bkm<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> jb.C.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bkm<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bkm.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<bsn<?>> $$3x = jb.C.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bkm.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bkm.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bkm.a::error)
                     .<ImmutableList<bkm.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bkm<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bkm.a<U>> a(bsn<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bkm.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bkm<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bkm<E>>)$$2.getValue();
   }

   public bkm(
      Collection<? extends bsn<?>> $$0, Collection<? extends bts<? extends btr<? super E>>> $$1, ImmutableList<bkm.a<?>> $$2, Supplier<Codec<bkm<E>>> $$3
   ) {
      this.b = $$3;

      for (bsn<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (bts<? extends btr<? super E>> $$5 : $$1) {
         this.e.put($$5, (btr<? super E>)$$5.a());
      }

      for (btr<? super E> $$6 : this.e.values()) {
         for (bsn<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bkm.a<?> $$8 = (bkm.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bkm.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bkm.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(bsn<?> $$0) {
      return this.a($$0, bso.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((bsn<?>)$$0, Optional.empty()));
   }

   public <U> void b(bsn<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(bsn<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(bsn<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(bsm.a($$1, $$2)));
   }

   public <U> void a(bsn<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(bsm::a));
   }

   <U> void b(bsn<U> $$0, Optional<? extends bsm<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(bsn<U> $$0) {
      Optional<? extends bsm<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(bsm::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(bsn<U> $$0) {
      Optional<? extends bsm<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(bsm::c);
   }

   public <U> long e(bsn<U> $$0) {
      Optional<? extends bsm<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(bsm::b).orElse(0L);
   }

   @Deprecated
   @atd
   public Map<bsn<?>, Optional<? extends bsm<?>>> b() {
      return this.d;
   }

   public <U> boolean b(bsn<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(bsn<?> $$0, bso $$1) {
      Optional<? extends bsm<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == bso.c || $$1 == bso.a && $$2.isPresent() || $$1 == bso.b && $$2.isEmpty();
   }

   public cdn c() {
      return this.g;
   }

   public void a(cdn $$0) {
      this.g = $$0;
   }

   public void a(Set<cdl> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @atd
   public Set<cdl> d() {
      return this.k;
   }

   @Deprecated
   @atd
   public List<ble<? super E>> e() {
      List<ble<? super E>> $$0 = new ObjectArrayList();

      for (Map<cdl, Set<ble<? super E>>> $$1 : this.f.values()) {
         for (Set<ble<? super E>> $$2 : $$1.values()) {
            for (ble<? super E> $$3 : $$2) {
               if ($$3.a() == bld.a.b) {
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

   public Optional<cdl> g() {
      for (cdl $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cdl $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cdl $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cdl $$0) {
      for (cdl $$1 : this.k) {
         if ($$1 != $$0) {
            Set<bsn<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (bsn<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cdl $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cdl> $$0) {
      for (cdl $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cdl $$0) {
      this.l = $$0;
   }

   public void a(cdl $$0, int $$1, ImmutableList<? extends ble<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cdl $$0, int $$1, ImmutableList<? extends ble<? super E>> $$2, bsn<?> $$3) {
      Set<Pair<bsn<?>, bso>> $$4 = ImmutableSet.of(Pair.of($$3, bso.a));
      Set<bsn<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cdl $$0, ImmutableList<? extends Pair<Integer, ? extends ble<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cdl $$0, ImmutableList<? extends Pair<Integer, ? extends ble<? super E>>> $$1, Set<Pair<bsn<?>, bso>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cdl $$0, ImmutableList<? extends Pair<Integer, ? extends ble<? super E>>> $$1, Set<Pair<bsn<?>, bso>> $$2, Set<bsn<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends ble<? super E>> $$4 = (Pair<Integer, ? extends ble<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((ble<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cdl $$0) {
      return this.k.contains($$0);
   }

   public bkm<E> i() {
      bkm<E> $$0 = new bkm<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<bsn<?>, Optional<? extends bsm<?>>> $$1 : this.d.entrySet()) {
         bsn<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(akt $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(akt $$0, E $$1) {
      for (btr<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<bsn<?>, Optional<? extends bsm<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            bsm<?> $$1 = (bsm<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(akt $$0, E $$1) {
      long $$2 = $$1.dL().V();

      for (ble<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(akt $$0, E $$1) {
      long $$2 = $$0.V();

      for (Map<cdl, Set<ble<? super E>>> $$3 : this.f.values()) {
         for (Entry<cdl, Set<ble<? super E>>> $$4 : $$3.entrySet()) {
            cdl $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (ble<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bld.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(akt $$0, E $$1) {
      long $$2 = $$0.V();

      for (ble<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cdl $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<bsn<?>, bso> $$1 : this.h.get($$0)) {
            bsn<?> $$2 = (bsn<?>)$$1.getFirst();
            bso $$3 = (bso)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends ble<? super E>>> a(int $$0, ImmutableList<? extends ble<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends ble<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         ble<? super E> $$4 = (ble<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final bsn<U> a;
      private final Optional<? extends bsm<U>> b;

      static <U> bkm.a<U> a(bsn<U> $$0, Optional<? extends bsm<?>> $$1) {
         return new bkm.a<>($$0, (Optional<? extends bsm<U>>)$$1);
      }

      a(bsn<U> $$0, Optional<? extends bsm<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bkm<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(jb.C.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bjm> {
      private final Collection<? extends bsn<?>> a;
      private final Collection<? extends bts<? extends btr<? super E>>> b;
      private final Codec<bkm<E>> c;

      b(Collection<? extends bsn<?>> $$0, Collection<? extends bts<? extends btr<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bkm.b($$0, $$1);
      }

      public bkm<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bkm.a::error).orElseGet(() -> new bkm<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
