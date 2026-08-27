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

public class btp<E extends bso> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<btp<E>>> b;
   private static final int c = 20;
   private final Map<cbr<?>, Optional<? extends cbq<?>>> d = Maps.newHashMap();
   private final Map<ccy<? extends ccx<? super E>>, ccx<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cnq, Set<buh<? super E>>>> f = Maps.newTreeMap();
   private cns g = cns.c;
   private final Map<cnq, Set<Pair<cbr<?>, cbs>>> h = Maps.newHashMap();
   private final Map<cnq, Set<cbr<?>>> i = Maps.newHashMap();
   private Set<cnq> j = Sets.newHashSet();
   private final Set<cnq> k = Sets.newHashSet();
   private cnq l = cnq.b;
   private long m = -9999L;

   public static <E extends bso> btp.b<E> a(Collection<? extends cbr<?>> $$0, Collection<? extends ccy<? extends ccx<? super E>>> $$1) {
      return new btp.b<>($$0, $$1);
   }

   public static <E extends bso> Codec<btp<E>> b(final Collection<? extends cbr<?>> $$0, final Collection<? extends ccy<? extends ccx<? super E>>> $$1) {
      final MutableObject<Codec<btp<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<btp<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> lh.B.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<btp<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<btp.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cbr<?>> $$3x = lh.B.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends btp.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<btp.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(btp.a::error)
                     .<ImmutableList<btp.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new btp<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<btp.a<U>> a(cbr<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new btp.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(btp<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<btp<E>>)$$2.getValue();
   }

   public btp(
      Collection<? extends cbr<?>> $$0, Collection<? extends ccy<? extends ccx<? super E>>> $$1, ImmutableList<btp.a<?>> $$2, Supplier<Codec<btp<E>>> $$3
   ) {
      this.b = $$3;

      for (cbr<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (ccy<? extends ccx<? super E>> $$5 : $$1) {
         this.e.put($$5, (ccx<? super E>)$$5.a());
      }

      for (ccx<? super E> $$6 : this.e.values()) {
         for (cbr<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         btp.a<?> $$8 = (btp.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<btp.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> btp.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cbr<?> $$0) {
      return this.a($$0, cbs.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cbr<?>)$$0, Optional.empty()));
   }

   public <U> void b(cbr<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cbr<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cbr<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cbq.a($$1, $$2)));
   }

   public <U> void a(cbr<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cbq::a));
   }

   <U> void b(cbr<U> $$0, Optional<? extends cbq<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cbr<U> $$0) {
      Optional<? extends cbq<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cbq::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cbr<U> $$0) {
      Optional<? extends cbq<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cbq::c);
   }

   public <U> long e(cbr<U> $$0) {
      Optional<? extends cbq<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cbq::b).orElse(0L);
   }

   @Deprecated
   @azp
   public Map<cbr<?>, Optional<? extends cbq<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cbr<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cbr<?> $$0, cbs $$1) {
      Optional<? extends cbq<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cbs.c || $$1 == cbs.a && $$2.isPresent() || $$1 == cbs.b && $$2.isEmpty();
   }

   public cns c() {
      return this.g;
   }

   public void a(cns $$0) {
      this.g = $$0;
   }

   public void a(Set<cnq> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @azp
   public Set<cnq> d() {
      return this.k;
   }

   @Deprecated
   @azp
   public List<buh<? super E>> e() {
      List<buh<? super E>> $$0 = new ObjectArrayList();

      for (Map<cnq, Set<buh<? super E>>> $$1 : this.f.values()) {
         for (Set<buh<? super E>> $$2 : $$1.values()) {
            for (buh<? super E> $$3 : $$2) {
               if ($$3.a() == bug.a.b) {
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

   public Optional<cnq> g() {
      for (cnq $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cnq $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cnq $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cnq $$0) {
      for (cnq $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cbr<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cbr<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cnq $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cnq> $$0) {
      for (cnq $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cnq $$0) {
      this.l = $$0;
   }

   public void a(cnq $$0, int $$1, ImmutableList<? extends buh<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cnq $$0, int $$1, ImmutableList<? extends buh<? super E>> $$2, cbr<?> $$3) {
      Set<Pair<cbr<?>, cbs>> $$4 = ImmutableSet.of(Pair.of($$3, cbs.a));
      Set<cbr<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cnq $$0, ImmutableList<? extends Pair<Integer, ? extends buh<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cnq $$0, ImmutableList<? extends Pair<Integer, ? extends buh<? super E>>> $$1, Set<Pair<cbr<?>, cbs>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cnq $$0, ImmutableList<? extends Pair<Integer, ? extends buh<? super E>>> $$1, Set<Pair<cbr<?>, cbs>> $$2, Set<cbr<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends buh<? super E>> $$4 = (Pair<Integer, ? extends buh<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((buh<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cnq $$0) {
      return this.k.contains($$0);
   }

   public btp<E> i() {
      btp<E> $$0 = new btp<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cbr<?>, Optional<? extends cbq<?>>> $$1 : this.d.entrySet()) {
         cbr<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(aqt $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(aqt $$0, E $$1) {
      for (ccx<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cbr<?>, Optional<? extends cbq<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cbq<?> $$1 = (cbq<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aqt $$0, E $$1) {
      long $$2 = $$1.dU().Z();

      for (buh<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aqt $$0, E $$1) {
      long $$2 = $$0.Z();

      for (Map<cnq, Set<buh<? super E>>> $$3 : this.f.values()) {
         for (Entry<cnq, Set<buh<? super E>>> $$4 : $$3.entrySet()) {
            cnq $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (buh<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bug.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aqt $$0, E $$1) {
      long $$2 = $$0.Z();

      for (buh<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cnq $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cbr<?>, cbs> $$1 : this.h.get($$0)) {
            cbr<?> $$2 = (cbr<?>)$$1.getFirst();
            cbs $$3 = (cbs)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends buh<? super E>>> a(int $$0, ImmutableList<? extends buh<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends buh<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         buh<? super E> $$4 = (buh<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cbr<U> a;
      private final Optional<? extends cbq<U>> b;

      static <U> btp.a<U> a(cbr<U> $$0, Optional<? extends cbq<?>> $$1) {
         return new btp.a<>($$0, (Optional<? extends cbq<U>>)$$1);
      }

      a(cbr<U> $$0, Optional<? extends cbq<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(btp<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(lh.B.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bso> {
      private final Collection<? extends cbr<?>> a;
      private final Collection<? extends ccy<? extends ccx<? super E>>> b;
      private final Codec<btp<E>> c;

      b(Collection<? extends cbr<?>> $$0, Collection<? extends ccy<? extends ccx<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = btp.b($$0, $$1);
      }

      public btp<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(btp.a::error).orElseGet(() -> new btp<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
