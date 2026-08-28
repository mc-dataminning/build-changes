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

public class bxa<E extends bvy> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bxa<E>>> b;
   private static final int c = 20;
   private final Map<cfc<?>, Optional<? extends cfb<?>>> d = Maps.newHashMap();
   private final Map<cgj<? extends cgi<? super E>>, cgi<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cri, Set<bxs<? super E>>>> f = Maps.newTreeMap();
   private crk g = crk.c;
   private final Map<cri, Set<Pair<cfc<?>, cfd>>> h = Maps.newHashMap();
   private final Map<cri, Set<cfc<?>>> i = Maps.newHashMap();
   private Set<cri> j = Sets.newHashSet();
   private final Set<cri> k = Sets.newHashSet();
   private cri l = cri.b;
   private long m = -9999L;

   public static <E extends bvy> bxa.b<E> a(Collection<? extends cfc<?>> $$0, Collection<? extends cgj<? extends cgi<? super E>>> $$1) {
      return new bxa.b<>($$0, $$1);
   }

   public static <E extends bvy> Codec<bxa<E>> b(final Collection<? extends cfc<?>> $$0, final Collection<? extends cgj<? extends cgi<? super E>>> $$1) {
      final MutableObject<Codec<bxa<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bxa<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> mb.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bxa<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bxa.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cfc<?>> $$3x = mb.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bxa.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bxa.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bxa.a::error)
                     .<ImmutableList<bxa.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bxa<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bxa.a<U>> a(cfc<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bxa.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bxa<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bxa<E>>)$$2.getValue();
   }

   public bxa(
      Collection<? extends cfc<?>> $$0, Collection<? extends cgj<? extends cgi<? super E>>> $$1, ImmutableList<bxa.a<?>> $$2, Supplier<Codec<bxa<E>>> $$3
   ) {
      this.b = $$3;

      for (cfc<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cgj<? extends cgi<? super E>> $$5 : $$1) {
         this.e.put($$5, (cgi<? super E>)$$5.a());
      }

      for (cgi<? super E> $$6 : this.e.values()) {
         for (cfc<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bxa.a<?> $$8 = (bxa.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bxa.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bxa.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cfc<?> $$0) {
      return this.a($$0, cfd.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cfc<?>)$$0, Optional.empty()));
   }

   public <U> void b(cfc<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cfc<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cfc<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cfb.a($$1, $$2)));
   }

   public <U> void a(cfc<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cfb::a));
   }

   <U> void b(cfc<U> $$0, Optional<? extends cfb<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cfc<U> $$0) {
      Optional<? extends cfb<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cfb::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cfc<U> $$0) {
      Optional<? extends cfb<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cfb::c);
   }

   public <U> long e(cfc<U> $$0) {
      Optional<? extends cfb<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cfb::b).orElse(0L);
   }

   @Deprecated
   @bag
   public Map<cfc<?>, Optional<? extends cfb<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cfc<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cfc<?> $$0, cfd $$1) {
      Optional<? extends cfb<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cfd.c || $$1 == cfd.a && $$2.isPresent() || $$1 == cfd.b && $$2.isEmpty();
   }

   public crk c() {
      return this.g;
   }

   public void a(crk $$0) {
      this.g = $$0;
   }

   public void a(Set<cri> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bag
   public Set<cri> d() {
      return this.k;
   }

   @Deprecated
   @bag
   public List<bxs<? super E>> e() {
      List<bxs<? super E>> $$0 = new ObjectArrayList();

      for (Map<cri, Set<bxs<? super E>>> $$1 : this.f.values()) {
         for (Set<bxs<? super E>> $$2 : $$1.values()) {
            for (bxs<? super E> $$3 : $$2) {
               if ($$3.a() == bxr.a.b) {
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

   public Optional<cri> g() {
      for (cri $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cri $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cri $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cri $$0) {
      for (cri $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cfc<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cfc<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cri $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cri> $$0) {
      for (cri $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cri $$0) {
      this.l = $$0;
   }

   public void a(cri $$0, int $$1, ImmutableList<? extends bxs<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cri $$0, int $$1, ImmutableList<? extends bxs<? super E>> $$2, cfc<?> $$3) {
      Set<Pair<cfc<?>, cfd>> $$4 = ImmutableSet.of(Pair.of($$3, cfd.a));
      Set<cfc<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cri $$0, ImmutableList<? extends Pair<Integer, ? extends bxs<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cri $$0, ImmutableList<? extends Pair<Integer, ? extends bxs<? super E>>> $$1, Set<Pair<cfc<?>, cfd>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cri $$0, ImmutableList<? extends Pair<Integer, ? extends bxs<? super E>>> $$1, Set<Pair<cfc<?>, cfd>> $$2, Set<cfc<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bxs<? super E>> $$4 = (Pair<Integer, ? extends bxs<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bxs<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cri $$0) {
      return this.k.contains($$0);
   }

   public bxa<E> i() {
      bxa<E> $$0 = new bxa<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cfc<?>, Optional<? extends cfb<?>>> $$1 : this.d.entrySet()) {
         cfc<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(ard $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(ard $$0, E $$1) {
      for (cgi<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cfc<?>, Optional<? extends cfb<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cfb<?> $$1 = (cfb<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(ard $$0, E $$1) {
      long $$2 = $$1.dU().ae();

      for (bxs<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(ard $$0, E $$1) {
      long $$2 = $$0.ae();

      for (Map<cri, Set<bxs<? super E>>> $$3 : this.f.values()) {
         for (Entry<cri, Set<bxs<? super E>>> $$4 : $$3.entrySet()) {
            cri $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bxs<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bxr.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(ard $$0, E $$1) {
      long $$2 = $$0.ae();

      for (bxs<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cri $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cfc<?>, cfd> $$1 : this.h.get($$0)) {
            cfc<?> $$2 = (cfc<?>)$$1.getFirst();
            cfd $$3 = (cfd)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bxs<? super E>>> a(int $$0, ImmutableList<? extends bxs<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bxs<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bxs<? super E> $$4 = (bxs<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cfc<U> a;
      private final Optional<? extends cfb<U>> b;

      static <U> bxa.a<U> a(cfc<U> $$0, Optional<? extends cfb<?>> $$1) {
         return new bxa.a<>($$0, (Optional<? extends cfb<U>>)$$1);
      }

      a(cfc<U> $$0, Optional<? extends cfb<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bxa<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mb.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bvy> {
      private final Collection<? extends cfc<?>> a;
      private final Collection<? extends cgj<? extends cgi<? super E>>> b;
      private final Codec<bxa<E>> c;

      b(Collection<? extends cfc<?>> $$0, Collection<? extends cgj<? extends cgi<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bxa.b($$0, $$1);
      }

      public bxa<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bxa.a::error).orElseGet(() -> new bxa<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
