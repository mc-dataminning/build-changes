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

public class bvo<E extends bun> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bvo<E>>> b;
   private static final int c = 20;
   private final Map<cdq<?>, Optional<? extends cdp<?>>> d = Maps.newHashMap();
   private final Map<cex<? extends cew<? super E>>, cew<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cpp, Set<bwg<? super E>>>> f = Maps.newTreeMap();
   private cpr g = cpr.c;
   private final Map<cpp, Set<Pair<cdq<?>, cdr>>> h = Maps.newHashMap();
   private final Map<cpp, Set<cdq<?>>> i = Maps.newHashMap();
   private Set<cpp> j = Sets.newHashSet();
   private final Set<cpp> k = Sets.newHashSet();
   private cpp l = cpp.b;
   private long m = -9999L;

   public static <E extends bun> bvo.b<E> a(Collection<? extends cdq<?>> $$0, Collection<? extends cex<? extends cew<? super E>>> $$1) {
      return new bvo.b<>($$0, $$1);
   }

   public static <E extends bun> Codec<bvo<E>> b(final Collection<? extends cdq<?>> $$0, final Collection<? extends cex<? extends cew<? super E>>> $$1) {
      final MutableObject<Codec<bvo<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bvo<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> lv.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bvo<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bvo.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cdq<?>> $$3x = lv.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bvo.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bvo.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bvo.a::error)
                     .<ImmutableList<bvo.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bvo<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bvo.a<U>> a(cdq<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bvo.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bvo<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bvo<E>>)$$2.getValue();
   }

   public bvo(
      Collection<? extends cdq<?>> $$0, Collection<? extends cex<? extends cew<? super E>>> $$1, ImmutableList<bvo.a<?>> $$2, Supplier<Codec<bvo<E>>> $$3
   ) {
      this.b = $$3;

      for (cdq<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cex<? extends cew<? super E>> $$5 : $$1) {
         this.e.put($$5, (cew<? super E>)$$5.a());
      }

      for (cew<? super E> $$6 : this.e.values()) {
         for (cdq<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bvo.a<?> $$8 = (bvo.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bvo.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bvo.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cdq<?> $$0) {
      return this.a($$0, cdr.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cdq<?>)$$0, Optional.empty()));
   }

   public <U> void b(cdq<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cdq<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cdq<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cdp.a($$1, $$2)));
   }

   public <U> void a(cdq<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cdp::a));
   }

   <U> void b(cdq<U> $$0, Optional<? extends cdp<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cdq<U> $$0) {
      Optional<? extends cdp<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cdp::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cdq<U> $$0) {
      Optional<? extends cdp<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cdp::c);
   }

   public <U> long e(cdq<U> $$0) {
      Optional<? extends cdp<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cdp::b).orElse(0L);
   }

   @Deprecated
   @bal
   public Map<cdq<?>, Optional<? extends cdp<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cdq<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cdq<?> $$0, cdr $$1) {
      Optional<? extends cdp<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cdr.c || $$1 == cdr.a && $$2.isPresent() || $$1 == cdr.b && $$2.isEmpty();
   }

   public cpr c() {
      return this.g;
   }

   public void a(cpr $$0) {
      this.g = $$0;
   }

   public void a(Set<cpp> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bal
   public Set<cpp> d() {
      return this.k;
   }

   @Deprecated
   @bal
   public List<bwg<? super E>> e() {
      List<bwg<? super E>> $$0 = new ObjectArrayList();

      for (Map<cpp, Set<bwg<? super E>>> $$1 : this.f.values()) {
         for (Set<bwg<? super E>> $$2 : $$1.values()) {
            for (bwg<? super E> $$3 : $$2) {
               if ($$3.a() == bwf.a.b) {
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

   public Optional<cpp> g() {
      for (cpp $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cpp $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cpp $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cpp $$0) {
      for (cpp $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cdq<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cdq<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cpp $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cpp> $$0) {
      for (cpp $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cpp $$0) {
      this.l = $$0;
   }

   public void a(cpp $$0, int $$1, ImmutableList<? extends bwg<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cpp $$0, int $$1, ImmutableList<? extends bwg<? super E>> $$2, cdq<?> $$3) {
      Set<Pair<cdq<?>, cdr>> $$4 = ImmutableSet.of(Pair.of($$3, cdr.a));
      Set<cdq<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cpp $$0, ImmutableList<? extends Pair<Integer, ? extends bwg<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cpp $$0, ImmutableList<? extends Pair<Integer, ? extends bwg<? super E>>> $$1, Set<Pair<cdq<?>, cdr>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cpp $$0, ImmutableList<? extends Pair<Integer, ? extends bwg<? super E>>> $$1, Set<Pair<cdq<?>, cdr>> $$2, Set<cdq<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bwg<? super E>> $$4 = (Pair<Integer, ? extends bwg<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bwg<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cpp $$0) {
      return this.k.contains($$0);
   }

   public bvo<E> i() {
      bvo<E> $$0 = new bvo<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cdq<?>, Optional<? extends cdp<?>>> $$1 : this.d.entrySet()) {
         cdq<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(arj $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(arj $$0, E $$1) {
      for (cew<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cdq<?>, Optional<? extends cdp<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cdp<?> $$1 = (cdp<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(arj $$0, E $$1) {
      long $$2 = $$1.dS().aa();

      for (bwg<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(arj $$0, E $$1) {
      long $$2 = $$0.aa();

      for (Map<cpp, Set<bwg<? super E>>> $$3 : this.f.values()) {
         for (Entry<cpp, Set<bwg<? super E>>> $$4 : $$3.entrySet()) {
            cpp $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bwg<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bwf.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(arj $$0, E $$1) {
      long $$2 = $$0.aa();

      for (bwg<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cpp $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cdq<?>, cdr> $$1 : this.h.get($$0)) {
            cdq<?> $$2 = (cdq<?>)$$1.getFirst();
            cdr $$3 = (cdr)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bwg<? super E>>> a(int $$0, ImmutableList<? extends bwg<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bwg<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bwg<? super E> $$4 = (bwg<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cdq<U> a;
      private final Optional<? extends cdp<U>> b;

      static <U> bvo.a<U> a(cdq<U> $$0, Optional<? extends cdp<?>> $$1) {
         return new bvo.a<>($$0, (Optional<? extends cdp<U>>)$$1);
      }

      a(cdq<U> $$0, Optional<? extends cdp<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bvo<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(lv.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bun> {
      private final Collection<? extends cdq<?>> a;
      private final Collection<? extends cex<? extends cew<? super E>>> b;
      private final Codec<bvo<E>> c;

      b(Collection<? extends cdq<?>> $$0, Collection<? extends cex<? extends cew<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bvo.b($$0, $$1);
      }

      public bvo<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bvo.a::error).orElseGet(() -> new bvo<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
