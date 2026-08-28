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

public class bua<E extends bsy> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bua<E>>> b;
   private static final int c = 20;
   private final Map<ccc<?>, Optional<? extends ccb<?>>> d = Maps.newHashMap();
   private final Map<cdj<? extends cdi<? super E>>, cdi<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cnw, Set<bus<? super E>>>> f = Maps.newTreeMap();
   private cny g = cny.c;
   private final Map<cnw, Set<Pair<ccc<?>, ccd>>> h = Maps.newHashMap();
   private final Map<cnw, Set<ccc<?>>> i = Maps.newHashMap();
   private Set<cnw> j = Sets.newHashSet();
   private final Set<cnw> k = Sets.newHashSet();
   private cnw l = cnw.b;
   private long m = -9999L;

   public static <E extends bsy> bua.b<E> a(Collection<? extends ccc<?>> $$0, Collection<? extends cdj<? extends cdi<? super E>>> $$1) {
      return new bua.b<>($$0, $$1);
   }

   public static <E extends bsy> Codec<bua<E>> b(final Collection<? extends ccc<?>> $$0, final Collection<? extends cdj<? extends cdi<? super E>>> $$1) {
      final MutableObject<Codec<bua<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bua<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> lq.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bua<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bua.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<ccc<?>> $$3x = lq.z.r().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bua.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bua.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bua.a::error)
                     .<ImmutableList<bua.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bua<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bua.a<U>> a(ccc<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bua.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bua<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bua<E>>)$$2.getValue();
   }

   public bua(
      Collection<? extends ccc<?>> $$0, Collection<? extends cdj<? extends cdi<? super E>>> $$1, ImmutableList<bua.a<?>> $$2, Supplier<Codec<bua<E>>> $$3
   ) {
      this.b = $$3;

      for (ccc<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cdj<? extends cdi<? super E>> $$5 : $$1) {
         this.e.put($$5, (cdi<? super E>)$$5.a());
      }

      for (cdi<? super E> $$6 : this.e.values()) {
         for (ccc<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bua.a<?> $$8 = (bua.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bua.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bua.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(ccc<?> $$0) {
      return this.a($$0, ccd.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((ccc<?>)$$0, Optional.empty()));
   }

   public <U> void b(ccc<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(ccc<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(ccc<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(ccb.a($$1, $$2)));
   }

   public <U> void a(ccc<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(ccb::a));
   }

   <U> void b(ccc<U> $$0, Optional<? extends ccb<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(ccc<U> $$0) {
      Optional<? extends ccb<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(ccb::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(ccc<U> $$0) {
      Optional<? extends ccb<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(ccb::c);
   }

   public <U> long e(ccc<U> $$0) {
      Optional<? extends ccb<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(ccb::b).orElse(0L);
   }

   @Deprecated
   @azi
   public Map<ccc<?>, Optional<? extends ccb<?>>> b() {
      return this.d;
   }

   public <U> boolean b(ccc<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(ccc<?> $$0, ccd $$1) {
      Optional<? extends ccb<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == ccd.c || $$1 == ccd.a && $$2.isPresent() || $$1 == ccd.b && $$2.isEmpty();
   }

   public cny c() {
      return this.g;
   }

   public void a(cny $$0) {
      this.g = $$0;
   }

   public void a(Set<cnw> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @azi
   public Set<cnw> d() {
      return this.k;
   }

   @Deprecated
   @azi
   public List<bus<? super E>> e() {
      List<bus<? super E>> $$0 = new ObjectArrayList();

      for (Map<cnw, Set<bus<? super E>>> $$1 : this.f.values()) {
         for (Set<bus<? super E>> $$2 : $$1.values()) {
            for (bus<? super E> $$3 : $$2) {
               if ($$3.a() == bur.a.b) {
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

   public Optional<cnw> g() {
      for (cnw $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cnw $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cnw $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cnw $$0) {
      for (cnw $$1 : this.k) {
         if ($$1 != $$0) {
            Set<ccc<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (ccc<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cnw $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cnw> $$0) {
      for (cnw $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cnw $$0) {
      this.l = $$0;
   }

   public void a(cnw $$0, int $$1, ImmutableList<? extends bus<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cnw $$0, int $$1, ImmutableList<? extends bus<? super E>> $$2, ccc<?> $$3) {
      Set<Pair<ccc<?>, ccd>> $$4 = ImmutableSet.of(Pair.of($$3, ccd.a));
      Set<ccc<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cnw $$0, ImmutableList<? extends Pair<Integer, ? extends bus<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cnw $$0, ImmutableList<? extends Pair<Integer, ? extends bus<? super E>>> $$1, Set<Pair<ccc<?>, ccd>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cnw $$0, ImmutableList<? extends Pair<Integer, ? extends bus<? super E>>> $$1, Set<Pair<ccc<?>, ccd>> $$2, Set<ccc<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bus<? super E>> $$4 = (Pair<Integer, ? extends bus<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bus<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cnw $$0) {
      return this.k.contains($$0);
   }

   public bua<E> i() {
      bua<E> $$0 = new bua<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<ccc<?>, Optional<? extends ccb<?>>> $$1 : this.d.entrySet()) {
         ccc<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(aqk $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(aqk $$0, E $$1) {
      for (cdi<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<ccc<?>, Optional<? extends ccb<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            ccb<?> $$1 = (ccb<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aqk $$0, E $$1) {
      long $$2 = $$1.dP().Z();

      for (bus<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aqk $$0, E $$1) {
      long $$2 = $$0.Z();

      for (Map<cnw, Set<bus<? super E>>> $$3 : this.f.values()) {
         for (Entry<cnw, Set<bus<? super E>>> $$4 : $$3.entrySet()) {
            cnw $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bus<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bur.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aqk $$0, E $$1) {
      long $$2 = $$0.Z();

      for (bus<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cnw $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<ccc<?>, ccd> $$1 : this.h.get($$0)) {
            ccc<?> $$2 = (ccc<?>)$$1.getFirst();
            ccd $$3 = (ccd)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bus<? super E>>> a(int $$0, ImmutableList<? extends bus<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bus<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bus<? super E> $$4 = (bus<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final ccc<U> a;
      private final Optional<? extends ccb<U>> b;

      static <U> bua.a<U> a(ccc<U> $$0, Optional<? extends ccb<?>> $$1) {
         return new bua.a<>($$0, (Optional<? extends ccb<U>>)$$1);
      }

      a(ccc<U> $$0, Optional<? extends ccb<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bua<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(lq.z.r().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bsy> {
      private final Collection<? extends ccc<?>> a;
      private final Collection<? extends cdj<? extends cdi<? super E>>> b;
      private final Codec<bua<E>> c;

      b(Collection<? extends ccc<?>> $$0, Collection<? extends cdj<? extends cdi<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bua.b($$0, $$1);
      }

      public bua<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bua.a::error).orElseGet(() -> new bua<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
