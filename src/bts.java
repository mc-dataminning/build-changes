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

public class bts<E extends bsq> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bts<E>>> b;
   private static final int c = 20;
   private final Map<cbu<?>, Optional<? extends cbt<?>>> d = Maps.newHashMap();
   private final Map<cdb<? extends cda<? super E>>, cda<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cnn, Set<buk<? super E>>>> f = Maps.newTreeMap();
   private cnp g = cnp.c;
   private final Map<cnn, Set<Pair<cbu<?>, cbv>>> h = Maps.newHashMap();
   private final Map<cnn, Set<cbu<?>>> i = Maps.newHashMap();
   private Set<cnn> j = Sets.newHashSet();
   private final Set<cnn> k = Sets.newHashSet();
   private cnn l = cnn.b;
   private long m = -9999L;

   public static <E extends bsq> bts.b<E> a(Collection<? extends cbu<?>> $$0, Collection<? extends cdb<? extends cda<? super E>>> $$1) {
      return new bts.b<>($$0, $$1);
   }

   public static <E extends bsq> Codec<bts<E>> b(final Collection<? extends cbu<?>> $$0, final Collection<? extends cdb<? extends cda<? super E>>> $$1) {
      final MutableObject<Codec<bts<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bts<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> le.B.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bts<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bts.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cbu<?>> $$3x = le.B.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bts.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bts.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bts.a::error)
                     .<ImmutableList<bts.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bts<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bts.a<U>> a(cbu<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bts.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bts<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bts<E>>)$$2.getValue();
   }

   public bts(
      Collection<? extends cbu<?>> $$0, Collection<? extends cdb<? extends cda<? super E>>> $$1, ImmutableList<bts.a<?>> $$2, Supplier<Codec<bts<E>>> $$3
   ) {
      this.b = $$3;

      for (cbu<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cdb<? extends cda<? super E>> $$5 : $$1) {
         this.e.put($$5, (cda<? super E>)$$5.a());
      }

      for (cda<? super E> $$6 : this.e.values()) {
         for (cbu<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bts.a<?> $$8 = (bts.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bts.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bts.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cbu<?> $$0) {
      return this.a($$0, cbv.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cbu<?>)$$0, Optional.empty()));
   }

   public <U> void b(cbu<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cbu<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cbu<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cbt.a($$1, $$2)));
   }

   public <U> void a(cbu<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cbt::a));
   }

   <U> void b(cbu<U> $$0, Optional<? extends cbt<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cbu<U> $$0) {
      Optional<? extends cbt<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cbt::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cbu<U> $$0) {
      Optional<? extends cbt<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cbt::c);
   }

   public <U> long e(cbu<U> $$0) {
      Optional<? extends cbt<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cbt::b).orElse(0L);
   }

   @Deprecated
   @azi
   public Map<cbu<?>, Optional<? extends cbt<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cbu<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cbu<?> $$0, cbv $$1) {
      Optional<? extends cbt<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cbv.c || $$1 == cbv.a && $$2.isPresent() || $$1 == cbv.b && $$2.isEmpty();
   }

   public cnp c() {
      return this.g;
   }

   public void a(cnp $$0) {
      this.g = $$0;
   }

   public void a(Set<cnn> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @azi
   public Set<cnn> d() {
      return this.k;
   }

   @Deprecated
   @azi
   public List<buk<? super E>> e() {
      List<buk<? super E>> $$0 = new ObjectArrayList();

      for (Map<cnn, Set<buk<? super E>>> $$1 : this.f.values()) {
         for (Set<buk<? super E>> $$2 : $$1.values()) {
            for (buk<? super E> $$3 : $$2) {
               if ($$3.a() == buj.a.b) {
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

   public Optional<cnn> g() {
      for (cnn $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cnn $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cnn $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cnn $$0) {
      for (cnn $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cbu<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cbu<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cnn $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cnn> $$0) {
      for (cnn $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cnn $$0) {
      this.l = $$0;
   }

   public void a(cnn $$0, int $$1, ImmutableList<? extends buk<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cnn $$0, int $$1, ImmutableList<? extends buk<? super E>> $$2, cbu<?> $$3) {
      Set<Pair<cbu<?>, cbv>> $$4 = ImmutableSet.of(Pair.of($$3, cbv.a));
      Set<cbu<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cnn $$0, ImmutableList<? extends Pair<Integer, ? extends buk<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cnn $$0, ImmutableList<? extends Pair<Integer, ? extends buk<? super E>>> $$1, Set<Pair<cbu<?>, cbv>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cnn $$0, ImmutableList<? extends Pair<Integer, ? extends buk<? super E>>> $$1, Set<Pair<cbu<?>, cbv>> $$2, Set<cbu<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends buk<? super E>> $$4 = (Pair<Integer, ? extends buk<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((buk<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cnn $$0) {
      return this.k.contains($$0);
   }

   public bts<E> i() {
      bts<E> $$0 = new bts<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cbu<?>, Optional<? extends cbt<?>>> $$1 : this.d.entrySet()) {
         cbu<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(aqn $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(aqn $$0, E $$1) {
      for (cda<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cbu<?>, Optional<? extends cbt<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cbt<?> $$1 = (cbt<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aqn $$0, E $$1) {
      long $$2 = $$1.dP().Y();

      for (buk<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aqn $$0, E $$1) {
      long $$2 = $$0.Y();

      for (Map<cnn, Set<buk<? super E>>> $$3 : this.f.values()) {
         for (Entry<cnn, Set<buk<? super E>>> $$4 : $$3.entrySet()) {
            cnn $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (buk<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == buj.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aqn $$0, E $$1) {
      long $$2 = $$0.Y();

      for (buk<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cnn $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cbu<?>, cbv> $$1 : this.h.get($$0)) {
            cbu<?> $$2 = (cbu<?>)$$1.getFirst();
            cbv $$3 = (cbv)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends buk<? super E>>> a(int $$0, ImmutableList<? extends buk<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends buk<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         buk<? super E> $$4 = (buk<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cbu<U> a;
      private final Optional<? extends cbt<U>> b;

      static <U> bts.a<U> a(cbu<U> $$0, Optional<? extends cbt<?>> $$1) {
         return new bts.a<>($$0, (Optional<? extends cbt<U>>)$$1);
      }

      a(cbu<U> $$0, Optional<? extends cbt<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bts<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(le.B.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bsq> {
      private final Collection<? extends cbu<?>> a;
      private final Collection<? extends cdb<? extends cda<? super E>>> b;
      private final Codec<bts<E>> c;

      b(Collection<? extends cbu<?>> $$0, Collection<? extends cdb<? extends cda<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bts.b($$0, $$1);
      }

      public bts<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bts.a::error).orElseGet(() -> new bts<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
