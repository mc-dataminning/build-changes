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

public class buo<E extends btl> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<buo<E>>> b;
   private static final int c = 20;
   private final Map<ccq<?>, Optional<? extends ccp<?>>> d = Maps.newHashMap();
   private final Map<cdx<? extends cdw<? super E>>, cdw<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cok, Set<bvg<? super E>>>> f = Maps.newTreeMap();
   private com g = com.c;
   private final Map<cok, Set<Pair<ccq<?>, ccr>>> h = Maps.newHashMap();
   private final Map<cok, Set<ccq<?>>> i = Maps.newHashMap();
   private Set<cok> j = Sets.newHashSet();
   private final Set<cok> k = Sets.newHashSet();
   private cok l = cok.b;
   private long m = -9999L;

   public static <E extends btl> buo.b<E> a(Collection<? extends ccq<?>> $$0, Collection<? extends cdx<? extends cdw<? super E>>> $$1) {
      return new buo.b<>($$0, $$1);
   }

   public static <E extends btl> Codec<buo<E>> b(final Collection<? extends ccq<?>> $$0, final Collection<? extends cdx<? extends cdw<? super E>>> $$1) {
      final MutableObject<Codec<buo<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<buo<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> lt.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<buo<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<buo.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<ccq<?>> $$3x = lt.z.r().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends buo.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<buo.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(buo.a::error)
                     .<ImmutableList<buo.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new buo<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<buo.a<U>> a(ccq<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new buo.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(buo<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<buo<E>>)$$2.getValue();
   }

   public buo(
      Collection<? extends ccq<?>> $$0, Collection<? extends cdx<? extends cdw<? super E>>> $$1, ImmutableList<buo.a<?>> $$2, Supplier<Codec<buo<E>>> $$3
   ) {
      this.b = $$3;

      for (ccq<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cdx<? extends cdw<? super E>> $$5 : $$1) {
         this.e.put($$5, (cdw<? super E>)$$5.a());
      }

      for (cdw<? super E> $$6 : this.e.values()) {
         for (ccq<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         buo.a<?> $$8 = (buo.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<buo.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> buo.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(ccq<?> $$0) {
      return this.a($$0, ccr.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((ccq<?>)$$0, Optional.empty()));
   }

   public <U> void b(ccq<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(ccq<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(ccq<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(ccp.a($$1, $$2)));
   }

   public <U> void a(ccq<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(ccp::a));
   }

   <U> void b(ccq<U> $$0, Optional<? extends ccp<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(ccq<U> $$0) {
      Optional<? extends ccp<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(ccp::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(ccq<U> $$0) {
      Optional<? extends ccp<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(ccp::c);
   }

   public <U> long e(ccq<U> $$0) {
      Optional<? extends ccp<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(ccp::b).orElse(0L);
   }

   @Deprecated
   @azs
   public Map<ccq<?>, Optional<? extends ccp<?>>> b() {
      return this.d;
   }

   public <U> boolean b(ccq<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(ccq<?> $$0, ccr $$1) {
      Optional<? extends ccp<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == ccr.c || $$1 == ccr.a && $$2.isPresent() || $$1 == ccr.b && $$2.isEmpty();
   }

   public com c() {
      return this.g;
   }

   public void a(com $$0) {
      this.g = $$0;
   }

   public void a(Set<cok> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @azs
   public Set<cok> d() {
      return this.k;
   }

   @Deprecated
   @azs
   public List<bvg<? super E>> e() {
      List<bvg<? super E>> $$0 = new ObjectArrayList();

      for (Map<cok, Set<bvg<? super E>>> $$1 : this.f.values()) {
         for (Set<bvg<? super E>> $$2 : $$1.values()) {
            for (bvg<? super E> $$3 : $$2) {
               if ($$3.a() == bvf.a.b) {
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

   public Optional<cok> g() {
      for (cok $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cok $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cok $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cok $$0) {
      for (cok $$1 : this.k) {
         if ($$1 != $$0) {
            Set<ccq<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (ccq<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cok $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cok> $$0) {
      for (cok $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cok $$0) {
      this.l = $$0;
   }

   public void a(cok $$0, int $$1, ImmutableList<? extends bvg<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cok $$0, int $$1, ImmutableList<? extends bvg<? super E>> $$2, ccq<?> $$3) {
      Set<Pair<ccq<?>, ccr>> $$4 = ImmutableSet.of(Pair.of($$3, ccr.a));
      Set<ccq<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cok $$0, ImmutableList<? extends Pair<Integer, ? extends bvg<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cok $$0, ImmutableList<? extends Pair<Integer, ? extends bvg<? super E>>> $$1, Set<Pair<ccq<?>, ccr>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cok $$0, ImmutableList<? extends Pair<Integer, ? extends bvg<? super E>>> $$1, Set<Pair<ccq<?>, ccr>> $$2, Set<ccq<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bvg<? super E>> $$4 = (Pair<Integer, ? extends bvg<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bvg<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cok $$0) {
      return this.k.contains($$0);
   }

   public buo<E> i() {
      buo<E> $$0 = new buo<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<ccq<?>, Optional<? extends ccp<?>>> $$1 : this.d.entrySet()) {
         ccq<?> $$2 = $$1.getKey();
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
      for (cdw<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<ccq<?>, Optional<? extends ccp<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            ccp<?> $$1 = (ccp<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aqt $$0, E $$1) {
      long $$2 = $$1.dQ().Z();

      for (bvg<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aqt $$0, E $$1) {
      long $$2 = $$0.Z();

      for (Map<cok, Set<bvg<? super E>>> $$3 : this.f.values()) {
         for (Entry<cok, Set<bvg<? super E>>> $$4 : $$3.entrySet()) {
            cok $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bvg<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bvf.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aqt $$0, E $$1) {
      long $$2 = $$0.Z();

      for (bvg<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cok $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<ccq<?>, ccr> $$1 : this.h.get($$0)) {
            ccq<?> $$2 = (ccq<?>)$$1.getFirst();
            ccr $$3 = (ccr)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bvg<? super E>>> a(int $$0, ImmutableList<? extends bvg<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bvg<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bvg<? super E> $$4 = (bvg<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final ccq<U> a;
      private final Optional<? extends ccp<U>> b;

      static <U> buo.a<U> a(ccq<U> $$0, Optional<? extends ccp<?>> $$1) {
         return new buo.a<>($$0, (Optional<? extends ccp<U>>)$$1);
      }

      a(ccq<U> $$0, Optional<? extends ccp<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(buo<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(lt.z.r().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends btl> {
      private final Collection<? extends ccq<?>> a;
      private final Collection<? extends cdx<? extends cdw<? super E>>> b;
      private final Codec<buo<E>> c;

      b(Collection<? extends ccq<?>> $$0, Collection<? extends cdx<? extends cdw<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = buo.b($$0, $$1);
      }

      public buo<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(buo.a::error).orElseGet(() -> new buo<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
