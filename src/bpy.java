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

public class bpy<E extends box> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bpy<E>>> b;
   private static final int c = 20;
   private final Map<bya<?>, Optional<? extends bxz<?>>> d = Maps.newHashMap();
   private final Map<bzh<? extends bzg<? super E>>, bzg<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cjn, Set<bqq<? super E>>>> f = Maps.newTreeMap();
   private cjp g = cjp.c;
   private final Map<cjn, Set<Pair<bya<?>, byb>>> h = Maps.newHashMap();
   private final Map<cjn, Set<bya<?>>> i = Maps.newHashMap();
   private Set<cjn> j = Sets.newHashSet();
   private final Set<cjn> k = Sets.newHashSet();
   private cjn l = cjn.b;
   private long m = -9999L;

   public static <E extends box> bpy.b<E> a(Collection<? extends bya<?>> $$0, Collection<? extends bzh<? extends bzg<? super E>>> $$1) {
      return new bpy.b<>($$0, $$1);
   }

   public static <E extends box> Codec<bpy<E>> b(final Collection<? extends bya<?>> $$0, final Collection<? extends bzh<? extends bzg<? super E>>> $$1) {
      final MutableObject<Codec<bpy<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bpy<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> kh.B.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bpy<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bpy.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<bya<?>> $$3x = kh.B.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bpy.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bpy.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bpy.a::error)
                     .<ImmutableList<bpy.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bpy<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bpy.a<U>> a(bya<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bpy.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bpy<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bpy<E>>)$$2.getValue();
   }

   public bpy(
      Collection<? extends bya<?>> $$0, Collection<? extends bzh<? extends bzg<? super E>>> $$1, ImmutableList<bpy.a<?>> $$2, Supplier<Codec<bpy<E>>> $$3
   ) {
      this.b = $$3;

      for (bya<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (bzh<? extends bzg<? super E>> $$5 : $$1) {
         this.e.put($$5, (bzg<? super E>)$$5.a());
      }

      for (bzg<? super E> $$6 : this.e.values()) {
         for (bya<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bpy.a<?> $$8 = (bpy.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bpy.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bpy.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(bya<?> $$0) {
      return this.a($$0, byb.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((bya<?>)$$0, Optional.empty()));
   }

   public <U> void b(bya<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(bya<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(bya<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(bxz.a($$1, $$2)));
   }

   public <U> void a(bya<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(bxz::a));
   }

   <U> void b(bya<U> $$0, Optional<? extends bxz<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(bya<U> $$0) {
      Optional<? extends bxz<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(bxz::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(bya<U> $$0) {
      Optional<? extends bxz<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(bxz::c);
   }

   public <U> long e(bya<U> $$0) {
      Optional<? extends bxz<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(bxz::b).orElse(0L);
   }

   @Deprecated
   @axp
   public Map<bya<?>, Optional<? extends bxz<?>>> b() {
      return this.d;
   }

   public <U> boolean b(bya<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(bya<?> $$0, byb $$1) {
      Optional<? extends bxz<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == byb.c || $$1 == byb.a && $$2.isPresent() || $$1 == byb.b && $$2.isEmpty();
   }

   public cjp c() {
      return this.g;
   }

   public void a(cjp $$0) {
      this.g = $$0;
   }

   public void a(Set<cjn> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @axp
   public Set<cjn> d() {
      return this.k;
   }

   @Deprecated
   @axp
   public List<bqq<? super E>> e() {
      List<bqq<? super E>> $$0 = new ObjectArrayList();

      for (Map<cjn, Set<bqq<? super E>>> $$1 : this.f.values()) {
         for (Set<bqq<? super E>> $$2 : $$1.values()) {
            for (bqq<? super E> $$3 : $$2) {
               if ($$3.a() == bqp.a.b) {
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

   public Optional<cjn> g() {
      for (cjn $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cjn $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cjn $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cjn $$0) {
      for (cjn $$1 : this.k) {
         if ($$1 != $$0) {
            Set<bya<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (bya<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cjn $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cjn> $$0) {
      for (cjn $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cjn $$0) {
      this.l = $$0;
   }

   public void a(cjn $$0, int $$1, ImmutableList<? extends bqq<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cjn $$0, int $$1, ImmutableList<? extends bqq<? super E>> $$2, bya<?> $$3) {
      Set<Pair<bya<?>, byb>> $$4 = ImmutableSet.of(Pair.of($$3, byb.a));
      Set<bya<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cjn $$0, ImmutableList<? extends Pair<Integer, ? extends bqq<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cjn $$0, ImmutableList<? extends Pair<Integer, ? extends bqq<? super E>>> $$1, Set<Pair<bya<?>, byb>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cjn $$0, ImmutableList<? extends Pair<Integer, ? extends bqq<? super E>>> $$1, Set<Pair<bya<?>, byb>> $$2, Set<bya<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bqq<? super E>> $$4 = (Pair<Integer, ? extends bqq<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bqq<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cjn $$0) {
      return this.k.contains($$0);
   }

   public bpy<E> i() {
      bpy<E> $$0 = new bpy<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<bya<?>, Optional<? extends bxz<?>>> $$1 : this.d.entrySet()) {
         bya<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(apa $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(apa $$0, E $$1) {
      for (bzg<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<bya<?>, Optional<? extends bxz<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            bxz<?> $$1 = (bxz<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(apa $$0, E $$1) {
      long $$2 = $$1.dJ().X();

      for (bqq<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(apa $$0, E $$1) {
      long $$2 = $$0.X();

      for (Map<cjn, Set<bqq<? super E>>> $$3 : this.f.values()) {
         for (Entry<cjn, Set<bqq<? super E>>> $$4 : $$3.entrySet()) {
            cjn $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bqq<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bqp.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(apa $$0, E $$1) {
      long $$2 = $$0.X();

      for (bqq<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cjn $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<bya<?>, byb> $$1 : this.h.get($$0)) {
            bya<?> $$2 = (bya<?>)$$1.getFirst();
            byb $$3 = (byb)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bqq<? super E>>> a(int $$0, ImmutableList<? extends bqq<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bqq<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bqq<? super E> $$4 = (bqq<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final bya<U> a;
      private final Optional<? extends bxz<U>> b;

      static <U> bpy.a<U> a(bya<U> $$0, Optional<? extends bxz<?>> $$1) {
         return new bpy.a<>($$0, (Optional<? extends bxz<U>>)$$1);
      }

      a(bya<U> $$0, Optional<? extends bxz<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bpy<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(kh.B.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends box> {
      private final Collection<? extends bya<?>> a;
      private final Collection<? extends bzh<? extends bzg<? super E>>> b;
      private final Codec<bpy<E>> c;

      b(Collection<? extends bya<?>> $$0, Collection<? extends bzh<? extends bzg<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bpy.b($$0, $$1);
      }

      public bpy<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bpy.a::error).orElseGet(() -> new bpy<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
