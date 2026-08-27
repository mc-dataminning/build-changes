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

public class bki<E extends bji> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bki<E>>> b;
   private static final int c = 20;
   private final Map<bsj<?>, Optional<? extends bsi<?>>> d = Maps.newHashMap();
   private final Map<bto<? extends btn<? super E>>, btn<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cdh, Set<bla<? super E>>>> f = Maps.newTreeMap();
   private cdj g = cdj.c;
   private final Map<cdh, Set<Pair<bsj<?>, bsk>>> h = Maps.newHashMap();
   private final Map<cdh, Set<bsj<?>>> i = Maps.newHashMap();
   private Set<cdh> j = Sets.newHashSet();
   private final Set<cdh> k = Sets.newHashSet();
   private cdh l = cdh.b;
   private long m = -9999L;

   public static <E extends bji> bki.b<E> a(Collection<? extends bsj<?>> $$0, Collection<? extends bto<? extends btn<? super E>>> $$1) {
      return new bki.b<>($$0, $$1);
   }

   public static <E extends bji> Codec<bki<E>> b(final Collection<? extends bsj<?>> $$0, final Collection<? extends bto<? extends btn<? super E>>> $$1) {
      final MutableObject<Codec<bki<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bki<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> jd.C.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bki<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bki.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<bsj<?>> $$3x = jd.C.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bki.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bki.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bki.a::error)
                     .<ImmutableList<bki.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bki<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bki.a<U>> a(bsj<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bki.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bki<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bki<E>>)$$2.getValue();
   }

   public bki(
      Collection<? extends bsj<?>> $$0, Collection<? extends bto<? extends btn<? super E>>> $$1, ImmutableList<bki.a<?>> $$2, Supplier<Codec<bki<E>>> $$3
   ) {
      this.b = $$3;

      for (bsj<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (bto<? extends btn<? super E>> $$5 : $$1) {
         this.e.put($$5, (btn<? super E>)$$5.a());
      }

      for (btn<? super E> $$6 : this.e.values()) {
         for (bsj<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bki.a<?> $$8 = (bki.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bki.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bki.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(bsj<?> $$0) {
      return this.a($$0, bsk.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((bsj<?>)$$0, Optional.empty()));
   }

   public <U> void b(bsj<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(bsj<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(bsj<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(bsi.a($$1, $$2)));
   }

   public <U> void a(bsj<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(bsi::a));
   }

   <U> void b(bsj<U> $$0, Optional<? extends bsi<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(bsj<U> $$0) {
      Optional<? extends bsi<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(bsi::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(bsj<U> $$0) {
      Optional<? extends bsi<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(bsi::c);
   }

   public <U> long e(bsj<U> $$0) {
      Optional<? extends bsi<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(bsi::b).orElse(0L);
   }

   @Deprecated
   @ata
   public Map<bsj<?>, Optional<? extends bsi<?>>> b() {
      return this.d;
   }

   public <U> boolean b(bsj<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(bsj<?> $$0, bsk $$1) {
      Optional<? extends bsi<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == bsk.c || $$1 == bsk.a && $$2.isPresent() || $$1 == bsk.b && $$2.isEmpty();
   }

   public cdj c() {
      return this.g;
   }

   public void a(cdj $$0) {
      this.g = $$0;
   }

   public void a(Set<cdh> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @ata
   public Set<cdh> d() {
      return this.k;
   }

   @Deprecated
   @ata
   public List<bla<? super E>> e() {
      List<bla<? super E>> $$0 = new ObjectArrayList();

      for (Map<cdh, Set<bla<? super E>>> $$1 : this.f.values()) {
         for (Set<bla<? super E>> $$2 : $$1.values()) {
            for (bla<? super E> $$3 : $$2) {
               if ($$3.a() == bkz.a.b) {
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

   public Optional<cdh> g() {
      for (cdh $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cdh $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cdh $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cdh $$0) {
      for (cdh $$1 : this.k) {
         if ($$1 != $$0) {
            Set<bsj<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (bsj<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cdh $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cdh> $$0) {
      for (cdh $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cdh $$0) {
      this.l = $$0;
   }

   public void a(cdh $$0, int $$1, ImmutableList<? extends bla<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cdh $$0, int $$1, ImmutableList<? extends bla<? super E>> $$2, bsj<?> $$3) {
      Set<Pair<bsj<?>, bsk>> $$4 = ImmutableSet.of(Pair.of($$3, bsk.a));
      Set<bsj<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cdh $$0, ImmutableList<? extends Pair<Integer, ? extends bla<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cdh $$0, ImmutableList<? extends Pair<Integer, ? extends bla<? super E>>> $$1, Set<Pair<bsj<?>, bsk>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cdh $$0, ImmutableList<? extends Pair<Integer, ? extends bla<? super E>>> $$1, Set<Pair<bsj<?>, bsk>> $$2, Set<bsj<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bla<? super E>> $$4 = (Pair<Integer, ? extends bla<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bla<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cdh $$0) {
      return this.k.contains($$0);
   }

   public bki<E> i() {
      bki<E> $$0 = new bki<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<bsj<?>, Optional<? extends bsi<?>>> $$1 : this.d.entrySet()) {
         bsj<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(aks $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(aks $$0, E $$1) {
      for (btn<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<bsj<?>, Optional<? extends bsi<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            bsi<?> $$1 = (bsi<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aks $$0, E $$1) {
      long $$2 = $$1.dL().V();

      for (bla<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aks $$0, E $$1) {
      long $$2 = $$0.V();

      for (Map<cdh, Set<bla<? super E>>> $$3 : this.f.values()) {
         for (Entry<cdh, Set<bla<? super E>>> $$4 : $$3.entrySet()) {
            cdh $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bla<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bkz.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aks $$0, E $$1) {
      long $$2 = $$0.V();

      for (bla<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cdh $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<bsj<?>, bsk> $$1 : this.h.get($$0)) {
            bsj<?> $$2 = (bsj<?>)$$1.getFirst();
            bsk $$3 = (bsk)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bla<? super E>>> a(int $$0, ImmutableList<? extends bla<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bla<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bla<? super E> $$4 = (bla<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final bsj<U> a;
      private final Optional<? extends bsi<U>> b;

      static <U> bki.a<U> a(bsj<U> $$0, Optional<? extends bsi<?>> $$1) {
         return new bki.a<>($$0, (Optional<? extends bsi<U>>)$$1);
      }

      a(bsj<U> $$0, Optional<? extends bsi<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bki<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(jd.C.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bji> {
      private final Collection<? extends bsj<?>> a;
      private final Collection<? extends bto<? extends btn<? super E>>> b;
      private final Codec<bki<E>> c;

      b(Collection<? extends bsj<?>> $$0, Collection<? extends bto<? extends btn<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bki.b($$0, $$1);
      }

      public bki<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bki.a::error).orElseGet(() -> new bki<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
