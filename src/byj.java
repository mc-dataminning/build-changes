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

public class byj<E extends bxj> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<byj<E>>> b;
   private static final int c = 20;
   private final Map<cgl<?>, Optional<? extends cgk<?>>> d = Maps.newHashMap();
   private final Map<chs<? extends chr<? super E>>, chr<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<ctg, Set<bzb<? super E>>>> f = Maps.newTreeMap();
   private cti g = cti.c;
   private final Map<ctg, Set<Pair<cgl<?>, cgm>>> h = Maps.newHashMap();
   private final Map<ctg, Set<cgl<?>>> i = Maps.newHashMap();
   private Set<ctg> j = Sets.newHashSet();
   private final Set<ctg> k = Sets.newHashSet();
   private ctg l = ctg.b;
   private long m = -9999L;

   public static <E extends bxj> byj.b<E> a(Collection<? extends cgl<?>> $$0, Collection<? extends chs<? extends chr<? super E>>> $$1) {
      return new byj.b<>($$0, $$1);
   }

   public static <E extends bxj> Codec<byj<E>> b(final Collection<? extends cgl<?>> $$0, final Collection<? extends chs<? extends chr<? super E>>> $$1) {
      final MutableObject<Codec<byj<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<byj<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> mg.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<byj<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<byj.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cgl<?>> $$3x = mg.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends byj.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<byj.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(byj.a::error)
                     .<ImmutableList<byj.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new byj<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<byj.a<U>> a(cgl<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new byj.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(byj<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<byj<E>>)$$2.getValue();
   }

   public byj(
      Collection<? extends cgl<?>> $$0, Collection<? extends chs<? extends chr<? super E>>> $$1, ImmutableList<byj.a<?>> $$2, Supplier<Codec<byj<E>>> $$3
   ) {
      this.b = $$3;

      for (cgl<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (chs<? extends chr<? super E>> $$5 : $$1) {
         this.e.put($$5, (chr<? super E>)$$5.a());
      }

      for (chr<? super E> $$6 : this.e.values()) {
         for (cgl<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         byj.a<?> $$8 = (byj.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<byj.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> byj.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cgl<?> $$0) {
      return this.a($$0, cgm.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cgl<?>)$$0, Optional.empty()));
   }

   public <U> void b(cgl<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cgl<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cgl<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cgk.a($$1, $$2)));
   }

   public <U> void a(cgl<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cgk::a));
   }

   <U> void b(cgl<U> $$0, Optional<? extends cgk<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cgl<U> $$0) {
      Optional<? extends cgk<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cgk::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cgl<U> $$0) {
      Optional<? extends cgk<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cgk::c);
   }

   public <U> long e(cgl<U> $$0) {
      Optional<? extends cgk<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cgk::b).orElse(0L);
   }

   @Deprecated
   @bav
   public Map<cgl<?>, Optional<? extends cgk<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cgl<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cgl<?> $$0, cgm $$1) {
      Optional<? extends cgk<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cgm.c || $$1 == cgm.a && $$2.isPresent() || $$1 == cgm.b && $$2.isEmpty();
   }

   public cti c() {
      return this.g;
   }

   public void a(cti $$0) {
      this.g = $$0;
   }

   public void a(Set<ctg> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bav
   public Set<ctg> d() {
      return this.k;
   }

   @Deprecated
   @bav
   public List<bzb<? super E>> e() {
      List<bzb<? super E>> $$0 = new ObjectArrayList();

      for (Map<ctg, Set<bzb<? super E>>> $$1 : this.f.values()) {
         for (Set<bzb<? super E>> $$2 : $$1.values()) {
            for (bzb<? super E> $$3 : $$2) {
               if ($$3.a() == bza.a.b) {
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

   public Optional<ctg> g() {
      for (ctg $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(ctg $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(ctg $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(ctg $$0) {
      for (ctg $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cgl<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cgl<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         ctg $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<ctg> $$0) {
      for (ctg $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(ctg $$0) {
      this.l = $$0;
   }

   public void a(ctg $$0, int $$1, ImmutableList<? extends bzb<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(ctg $$0, int $$1, ImmutableList<? extends bzb<? super E>> $$2, cgl<?> $$3) {
      Set<Pair<cgl<?>, cgm>> $$4 = ImmutableSet.of(Pair.of($$3, cgm.a));
      Set<cgl<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(ctg $$0, ImmutableList<? extends Pair<Integer, ? extends bzb<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(ctg $$0, int $$1, ImmutableList<? extends bzb<? super E>> $$2, Set<Pair<cgl<?>, cgm>> $$3) {
      this.a($$0, this.a($$1, $$2), $$3);
   }

   public void a(ctg $$0, ImmutableList<? extends Pair<Integer, ? extends bzb<? super E>>> $$1, Set<Pair<cgl<?>, cgm>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(ctg $$0, ImmutableList<? extends Pair<Integer, ? extends bzb<? super E>>> $$1, Set<Pair<cgl<?>, cgm>> $$2, Set<cgl<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bzb<? super E>> $$4 = (Pair<Integer, ? extends bzb<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bzb<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(ctg $$0) {
      return this.k.contains($$0);
   }

   public byj<E> i() {
      byj<E> $$0 = new byj<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cgl<?>, Optional<? extends cgk<?>>> $$1 : this.d.entrySet()) {
         cgl<?> $$2 = $$1.getKey();
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
      for (chr<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cgl<?>, Optional<? extends cgk<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cgk<?> $$1 = (cgk<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arq $$0, E $$1) {
      long $$2 = $$1.dU().ae();

      for (bzb<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arq $$0, E $$1) {
      long $$2 = $$0.ae();

      for (Map<ctg, Set<bzb<? super E>>> $$3 : this.f.values()) {
         for (Entry<ctg, Set<bzb<? super E>>> $$4 : $$3.entrySet()) {
            ctg $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bzb<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bza.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arq $$0, E $$1) {
      long $$2 = $$0.ae();

      for (bzb<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(ctg $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cgl<?>, cgm> $$1 : this.h.get($$0)) {
            cgl<?> $$2 = (cgl<?>)$$1.getFirst();
            cgm $$3 = (cgm)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bzb<? super E>>> a(int $$0, ImmutableList<? extends bzb<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bzb<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bzb<? super E> $$4 = (bzb<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cgl<U> a;
      private final Optional<? extends cgk<U>> b;

      static <U> byj.a<U> a(cgl<U> $$0, Optional<? extends cgk<?>> $$1) {
         return new byj.a<>($$0, (Optional<? extends cgk<U>>)$$1);
      }

      a(cgl<U> $$0, Optional<? extends cgk<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(byj<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mg.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bxj> {
      private final Collection<? extends cgl<?>> a;
      private final Collection<? extends chs<? extends chr<? super E>>> b;
      private final Codec<byj<E>> c;

      b(Collection<? extends cgl<?>> $$0, Collection<? extends chs<? extends chr<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = byj.b($$0, $$1);
      }

      public byj<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(byj.a::error).orElseGet(() -> new byj<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
