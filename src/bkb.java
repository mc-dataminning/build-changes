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

public class bkb<E extends bjb> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bkb<E>>> b;
   private static final int c = 20;
   private final Map<bsc<?>, Optional<? extends bsb<?>>> d = Maps.newHashMap();
   private final Map<bth<? extends btg<? super E>>, btg<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cda, Set<bkt<? super E>>>> f = Maps.newTreeMap();
   private cdc g = cdc.c;
   private final Map<cda, Set<Pair<bsc<?>, bsd>>> h = Maps.newHashMap();
   private final Map<cda, Set<bsc<?>>> i = Maps.newHashMap();
   private Set<cda> j = Sets.newHashSet();
   private final Set<cda> k = Sets.newHashSet();
   private cda l = cda.b;
   private long m = -9999L;

   public static <E extends bjb> bkb.b<E> a(Collection<? extends bsc<?>> $$0, Collection<? extends bth<? extends btg<? super E>>> $$1) {
      return new bkb.b<>($$0, $$1);
   }

   public static <E extends bjb> Codec<bkb<E>> b(final Collection<? extends bsc<?>> $$0, final Collection<? extends bth<? extends btg<? super E>>> $$1) {
      final MutableObject<Codec<bkb<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bkb<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> jd.C.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bkb<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bkb.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<bsc<?>> $$3x = jd.C.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bkb.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bkb.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bkb.a::error)
                     .<ImmutableList<bkb.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bkb<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bkb.a<U>> a(bsc<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bkb.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bkb<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bkb<E>>)$$2.getValue();
   }

   public bkb(
      Collection<? extends bsc<?>> $$0, Collection<? extends bth<? extends btg<? super E>>> $$1, ImmutableList<bkb.a<?>> $$2, Supplier<Codec<bkb<E>>> $$3
   ) {
      this.b = $$3;

      for (bsc<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (bth<? extends btg<? super E>> $$5 : $$1) {
         this.e.put($$5, (btg<? super E>)$$5.a());
      }

      for (btg<? super E> $$6 : this.e.values()) {
         for (bsc<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bkb.a<?> $$8 = (bkb.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bkb.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bkb.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(bsc<?> $$0) {
      return this.a($$0, bsd.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((bsc<?>)$$0, Optional.empty()));
   }

   public <U> void b(bsc<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(bsc<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(bsc<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(bsb.a($$1, $$2)));
   }

   public <U> void a(bsc<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(bsb::a));
   }

   <U> void b(bsc<U> $$0, Optional<? extends bsb<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(bsc<U> $$0) {
      Optional<? extends bsb<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(bsb::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(bsc<U> $$0) {
      Optional<? extends bsb<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(bsb::c);
   }

   public <U> long e(bsc<U> $$0) {
      Optional<? extends bsb<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(bsb::b).orElse(0L);
   }

   @Deprecated
   @ast
   public Map<bsc<?>, Optional<? extends bsb<?>>> b() {
      return this.d;
   }

   public <U> boolean b(bsc<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(bsc<?> $$0, bsd $$1) {
      Optional<? extends bsb<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == bsd.c || $$1 == bsd.a && $$2.isPresent() || $$1 == bsd.b && $$2.isEmpty();
   }

   public cdc c() {
      return this.g;
   }

   public void a(cdc $$0) {
      this.g = $$0;
   }

   public void a(Set<cda> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @ast
   public Set<cda> d() {
      return this.k;
   }

   @Deprecated
   @ast
   public List<bkt<? super E>> e() {
      List<bkt<? super E>> $$0 = new ObjectArrayList();

      for (Map<cda, Set<bkt<? super E>>> $$1 : this.f.values()) {
         for (Set<bkt<? super E>> $$2 : $$1.values()) {
            for (bkt<? super E> $$3 : $$2) {
               if ($$3.a() == bks.a.b) {
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

   public Optional<cda> g() {
      for (cda $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cda $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cda $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cda $$0) {
      for (cda $$1 : this.k) {
         if ($$1 != $$0) {
            Set<bsc<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (bsc<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cda $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cda> $$0) {
      for (cda $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cda $$0) {
      this.l = $$0;
   }

   public void a(cda $$0, int $$1, ImmutableList<? extends bkt<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cda $$0, int $$1, ImmutableList<? extends bkt<? super E>> $$2, bsc<?> $$3) {
      Set<Pair<bsc<?>, bsd>> $$4 = ImmutableSet.of(Pair.of($$3, bsd.a));
      Set<bsc<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cda $$0, ImmutableList<? extends Pair<Integer, ? extends bkt<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cda $$0, ImmutableList<? extends Pair<Integer, ? extends bkt<? super E>>> $$1, Set<Pair<bsc<?>, bsd>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cda $$0, ImmutableList<? extends Pair<Integer, ? extends bkt<? super E>>> $$1, Set<Pair<bsc<?>, bsd>> $$2, Set<bsc<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bkt<? super E>> $$4 = (Pair<Integer, ? extends bkt<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bkt<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cda $$0) {
      return this.k.contains($$0);
   }

   public bkb<E> i() {
      bkb<E> $$0 = new bkb<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<bsc<?>, Optional<? extends bsb<?>>> $$1 : this.d.entrySet()) {
         bsc<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(akn $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(akn $$0, E $$1) {
      for (btg<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<bsc<?>, Optional<? extends bsb<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            bsb<?> $$1 = (bsb<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(akn $$0, E $$1) {
      long $$2 = $$1.dK().V();

      for (bkt<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(akn $$0, E $$1) {
      long $$2 = $$0.V();

      for (Map<cda, Set<bkt<? super E>>> $$3 : this.f.values()) {
         for (Entry<cda, Set<bkt<? super E>>> $$4 : $$3.entrySet()) {
            cda $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bkt<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bks.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(akn $$0, E $$1) {
      long $$2 = $$0.V();

      for (bkt<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cda $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<bsc<?>, bsd> $$1 : this.h.get($$0)) {
            bsc<?> $$2 = (bsc<?>)$$1.getFirst();
            bsd $$3 = (bsd)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bkt<? super E>>> a(int $$0, ImmutableList<? extends bkt<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bkt<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bkt<? super E> $$4 = (bkt<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final bsc<U> a;
      private final Optional<? extends bsb<U>> b;

      static <U> bkb.a<U> a(bsc<U> $$0, Optional<? extends bsb<?>> $$1) {
         return new bkb.a<>($$0, (Optional<? extends bsb<U>>)$$1);
      }

      a(bsc<U> $$0, Optional<? extends bsb<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bkb<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(jd.C.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bjb> {
      private final Collection<? extends bsc<?>> a;
      private final Collection<? extends bth<? extends btg<? super E>>> b;
      private final Codec<bkb<E>> c;

      b(Collection<? extends bsc<?>> $$0, Collection<? extends bth<? extends btg<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bkb.b($$0, $$1);
      }

      public bkb<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bkb.a::error).orElseGet(() -> new bkb<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
