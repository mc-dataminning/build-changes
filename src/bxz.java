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

public class bxz<E extends bwz> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bxz<E>>> b;
   private static final int c = 20;
   private final Map<cgb<?>, Optional<? extends cga<?>>> d = Maps.newHashMap();
   private final Map<chi<? extends chh<? super E>>, chh<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<csl, Set<byr<? super E>>>> f = Maps.newTreeMap();
   private csn g = csn.c;
   private final Map<csl, Set<Pair<cgb<?>, cgc>>> h = Maps.newHashMap();
   private final Map<csl, Set<cgb<?>>> i = Maps.newHashMap();
   private Set<csl> j = Sets.newHashSet();
   private final Set<csl> k = Sets.newHashSet();
   private csl l = csl.b;
   private long m = -9999L;

   public static <E extends bwz> bxz.b<E> a(Collection<? extends cgb<?>> $$0, Collection<? extends chi<? extends chh<? super E>>> $$1) {
      return new bxz.b<>($$0, $$1);
   }

   public static <E extends bwz> Codec<bxz<E>> b(final Collection<? extends cgb<?>> $$0, final Collection<? extends chi<? extends chh<? super E>>> $$1) {
      final MutableObject<Codec<bxz<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bxz<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> mf.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bxz<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bxz.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cgb<?>> $$3x = mf.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bxz.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bxz.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bxz.a::error)
                     .<ImmutableList<bxz.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bxz<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bxz.a<U>> a(cgb<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bxz.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bxz<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bxz<E>>)$$2.getValue();
   }

   public bxz(
      Collection<? extends cgb<?>> $$0, Collection<? extends chi<? extends chh<? super E>>> $$1, ImmutableList<bxz.a<?>> $$2, Supplier<Codec<bxz<E>>> $$3
   ) {
      this.b = $$3;

      for (cgb<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (chi<? extends chh<? super E>> $$5 : $$1) {
         this.e.put($$5, (chh<? super E>)$$5.a());
      }

      for (chh<? super E> $$6 : this.e.values()) {
         for (cgb<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bxz.a<?> $$8 = (bxz.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bxz.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bxz.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cgb<?> $$0) {
      return this.a($$0, cgc.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cgb<?>)$$0, Optional.empty()));
   }

   public <U> void b(cgb<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cgb<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cgb<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cga.a($$1, $$2)));
   }

   public <U> void a(cgb<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cga::a));
   }

   <U> void b(cgb<U> $$0, Optional<? extends cga<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cgb<U> $$0) {
      Optional<? extends cga<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cga::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cgb<U> $$0) {
      Optional<? extends cga<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cga::c);
   }

   public <U> long e(cgb<U> $$0) {
      Optional<? extends cga<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cga::b).orElse(0L);
   }

   @Deprecated
   @bat
   public Map<cgb<?>, Optional<? extends cga<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cgb<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cgb<?> $$0, cgc $$1) {
      Optional<? extends cga<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cgc.c || $$1 == cgc.a && $$2.isPresent() || $$1 == cgc.b && $$2.isEmpty();
   }

   public csn c() {
      return this.g;
   }

   public void a(csn $$0) {
      this.g = $$0;
   }

   public void a(Set<csl> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bat
   public Set<csl> d() {
      return this.k;
   }

   @Deprecated
   @bat
   public List<byr<? super E>> e() {
      List<byr<? super E>> $$0 = new ObjectArrayList();

      for (Map<csl, Set<byr<? super E>>> $$1 : this.f.values()) {
         for (Set<byr<? super E>> $$2 : $$1.values()) {
            for (byr<? super E> $$3 : $$2) {
               if ($$3.a() == byq.a.b) {
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

   public Optional<csl> g() {
      for (csl $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(csl $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(csl $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(csl $$0) {
      for (csl $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cgb<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cgb<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         csl $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<csl> $$0) {
      for (csl $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(csl $$0) {
      this.l = $$0;
   }

   public void a(csl $$0, int $$1, ImmutableList<? extends byr<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(csl $$0, int $$1, ImmutableList<? extends byr<? super E>> $$2, cgb<?> $$3) {
      Set<Pair<cgb<?>, cgc>> $$4 = ImmutableSet.of(Pair.of($$3, cgc.a));
      Set<cgb<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(csl $$0, ImmutableList<? extends Pair<Integer, ? extends byr<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(csl $$0, int $$1, ImmutableList<? extends byr<? super E>> $$2, Set<Pair<cgb<?>, cgc>> $$3) {
      this.a($$0, this.a($$1, $$2), $$3);
   }

   public void a(csl $$0, ImmutableList<? extends Pair<Integer, ? extends byr<? super E>>> $$1, Set<Pair<cgb<?>, cgc>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(csl $$0, ImmutableList<? extends Pair<Integer, ? extends byr<? super E>>> $$1, Set<Pair<cgb<?>, cgc>> $$2, Set<cgb<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends byr<? super E>> $$4 = (Pair<Integer, ? extends byr<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((byr<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(csl $$0) {
      return this.k.contains($$0);
   }

   public bxz<E> i() {
      bxz<E> $$0 = new bxz<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cgb<?>, Optional<? extends cga<?>>> $$1 : this.d.entrySet()) {
         cgb<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(aro $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(aro $$0, E $$1) {
      for (chh<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cgb<?>, Optional<? extends cga<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cga<?> $$1 = (cga<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aro $$0, E $$1) {
      long $$2 = $$1.dV().ae();

      for (byr<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aro $$0, E $$1) {
      long $$2 = $$0.ae();

      for (Map<csl, Set<byr<? super E>>> $$3 : this.f.values()) {
         for (Entry<csl, Set<byr<? super E>>> $$4 : $$3.entrySet()) {
            csl $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (byr<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == byq.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aro $$0, E $$1) {
      long $$2 = $$0.ae();

      for (byr<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(csl $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cgb<?>, cgc> $$1 : this.h.get($$0)) {
            cgb<?> $$2 = (cgb<?>)$$1.getFirst();
            cgc $$3 = (cgc)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends byr<? super E>>> a(int $$0, ImmutableList<? extends byr<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends byr<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         byr<? super E> $$4 = (byr<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cgb<U> a;
      private final Optional<? extends cga<U>> b;

      static <U> bxz.a<U> a(cgb<U> $$0, Optional<? extends cga<?>> $$1) {
         return new bxz.a<>($$0, (Optional<? extends cga<U>>)$$1);
      }

      a(cgb<U> $$0, Optional<? extends cga<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bxz<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mf.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bwz> {
      private final Collection<? extends cgb<?>> a;
      private final Collection<? extends chi<? extends chh<? super E>>> b;
      private final Codec<bxz<E>> c;

      b(Collection<? extends cgb<?>> $$0, Collection<? extends chi<? extends chh<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bxz.b($$0, $$1);
      }

      public bxz<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bxz.a::error).orElseGet(() -> new bxz<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
