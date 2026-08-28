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

public class byw<E extends bxw> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<byw<E>>> b;
   private static final int c = 20;
   private final Map<cgy<?>, Optional<? extends cgx<?>>> d = Maps.newHashMap();
   private final Map<cif<? extends cie<? super E>>, cie<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<ctt, Set<bzo<? super E>>>> f = Maps.newTreeMap();
   private ctv g = ctv.c;
   private final Map<ctt, Set<Pair<cgy<?>, cgz>>> h = Maps.newHashMap();
   private final Map<ctt, Set<cgy<?>>> i = Maps.newHashMap();
   private Set<ctt> j = Sets.newHashSet();
   private final Set<ctt> k = Sets.newHashSet();
   private ctt l = ctt.b;
   private long m = -9999L;

   public static <E extends bxw> byw.b<E> a(Collection<? extends cgy<?>> $$0, Collection<? extends cif<? extends cie<? super E>>> $$1) {
      return new byw.b<>($$0, $$1);
   }

   public static <E extends bxw> Codec<byw<E>> b(final Collection<? extends cgy<?>> $$0, final Collection<? extends cif<? extends cie<? super E>>> $$1) {
      final MutableObject<Codec<byw<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<byw<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> mh.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<byw<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<byw.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cgy<?>> $$3x = mh.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends byw.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<byw.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(byw.a::error)
                     .<ImmutableList<byw.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new byw<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<byw.a<U>> a(cgy<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new byw.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(byw<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<byw<E>>)$$2.getValue();
   }

   public byw(
      Collection<? extends cgy<?>> $$0, Collection<? extends cif<? extends cie<? super E>>> $$1, ImmutableList<byw.a<?>> $$2, Supplier<Codec<byw<E>>> $$3
   ) {
      this.b = $$3;

      for (cgy<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (cif<? extends cie<? super E>> $$5 : $$1) {
         this.e.put($$5, (cie<? super E>)$$5.a());
      }

      for (cie<? super E> $$6 : this.e.values()) {
         for (cgy<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         byw.a<?> $$8 = (byw.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<byw.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> byw.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cgy<?> $$0) {
      return this.a($$0, cgz.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cgy<?>)$$0, Optional.empty()));
   }

   public <U> void b(cgy<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cgy<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cgy<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cgx.a($$1, $$2)));
   }

   public <U> void a(cgy<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cgx::a));
   }

   <U> void b(cgy<U> $$0, Optional<? extends cgx<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cgy<U> $$0) {
      Optional<? extends cgx<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cgx::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cgy<U> $$0) {
      Optional<? extends cgx<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cgx::c);
   }

   public <U> long e(cgy<U> $$0) {
      Optional<? extends cgx<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cgx::b).orElse(0L);
   }

   @Deprecated
   @baz
   public Map<cgy<?>, Optional<? extends cgx<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cgy<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cgy<?> $$0, cgz $$1) {
      Optional<? extends cgx<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cgz.c || $$1 == cgz.a && $$2.isPresent() || $$1 == cgz.b && $$2.isEmpty();
   }

   public ctv c() {
      return this.g;
   }

   public void a(ctv $$0) {
      this.g = $$0;
   }

   public void a(Set<ctt> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @baz
   public Set<ctt> d() {
      return this.k;
   }

   @Deprecated
   @baz
   public List<bzo<? super E>> e() {
      List<bzo<? super E>> $$0 = new ObjectArrayList();

      for (Map<ctt, Set<bzo<? super E>>> $$1 : this.f.values()) {
         for (Set<bzo<? super E>> $$2 : $$1.values()) {
            for (bzo<? super E> $$3 : $$2) {
               if ($$3.a() == bzn.a.b) {
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

   public Optional<ctt> g() {
      for (ctt $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(ctt $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(ctt $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(ctt $$0) {
      for (ctt $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cgy<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cgy<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         ctt $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<ctt> $$0) {
      for (ctt $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(ctt $$0) {
      this.l = $$0;
   }

   public void a(ctt $$0, int $$1, ImmutableList<? extends bzo<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(ctt $$0, int $$1, ImmutableList<? extends bzo<? super E>> $$2, cgy<?> $$3) {
      Set<Pair<cgy<?>, cgz>> $$4 = ImmutableSet.of(Pair.of($$3, cgz.a));
      Set<cgy<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(ctt $$0, ImmutableList<? extends Pair<Integer, ? extends bzo<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(ctt $$0, int $$1, ImmutableList<? extends bzo<? super E>> $$2, Set<Pair<cgy<?>, cgz>> $$3) {
      this.a($$0, this.a($$1, $$2), $$3);
   }

   public void a(ctt $$0, ImmutableList<? extends Pair<Integer, ? extends bzo<? super E>>> $$1, Set<Pair<cgy<?>, cgz>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(ctt $$0, ImmutableList<? extends Pair<Integer, ? extends bzo<? super E>>> $$1, Set<Pair<cgy<?>, cgz>> $$2, Set<cgy<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bzo<? super E>> $$4 = (Pair<Integer, ? extends bzo<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bzo<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(ctt $$0) {
      return this.k.contains($$0);
   }

   public byw<E> i() {
      byw<E> $$0 = new byw<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cgy<?>, Optional<? extends cgx<?>>> $$1 : this.d.entrySet()) {
         cgy<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(aru $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(aru $$0, E $$1) {
      for (cie<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cgy<?>, Optional<? extends cgx<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cgx<?> $$1 = (cgx<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aru $$0, E $$1) {
      long $$2 = $$1.dV().ae();

      for (bzo<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aru $$0, E $$1) {
      long $$2 = $$0.ae();

      for (Map<ctt, Set<bzo<? super E>>> $$3 : this.f.values()) {
         for (Entry<ctt, Set<bzo<? super E>>> $$4 : $$3.entrySet()) {
            ctt $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bzo<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bzn.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aru $$0, E $$1) {
      long $$2 = $$0.ae();

      for (bzo<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(ctt $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cgy<?>, cgz> $$1 : this.h.get($$0)) {
            cgy<?> $$2 = (cgy<?>)$$1.getFirst();
            cgz $$3 = (cgz)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bzo<? super E>>> a(int $$0, ImmutableList<? extends bzo<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bzo<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bzo<? super E> $$4 = (bzo<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cgy<U> a;
      private final Optional<? extends cgx<U>> b;

      static <U> byw.a<U> a(cgy<U> $$0, Optional<? extends cgx<?>> $$1) {
         return new byw.a<>($$0, (Optional<? extends cgx<U>>)$$1);
      }

      a(cgy<U> $$0, Optional<? extends cgx<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(byw<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mh.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bxw> {
      private final Collection<? extends cgy<?>> a;
      private final Collection<? extends cif<? extends cie<? super E>>> b;
      private final Codec<byw<E>> c;

      b(Collection<? extends cgy<?>> $$0, Collection<? extends cif<? extends cie<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = byw.b($$0, $$1);
      }

      public byw<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(byw.a::error).orElseGet(() -> new byw<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
