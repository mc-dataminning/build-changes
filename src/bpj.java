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

public class bpj<E extends boi> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bpj<E>>> b;
   private static final int c = 20;
   private final Map<bxl<?>, Optional<? extends bxk<?>>> d = Maps.newHashMap();
   private final Map<bys<? extends byr<? super E>>, byr<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<ciy, Set<bqb<? super E>>>> f = Maps.newTreeMap();
   private cja g = cja.c;
   private final Map<ciy, Set<Pair<bxl<?>, bxm>>> h = Maps.newHashMap();
   private final Map<ciy, Set<bxl<?>>> i = Maps.newHashMap();
   private Set<ciy> j = Sets.newHashSet();
   private final Set<ciy> k = Sets.newHashSet();
   private ciy l = ciy.b;
   private long m = -9999L;

   public static <E extends boi> bpj.b<E> a(Collection<? extends bxl<?>> $$0, Collection<? extends bys<? extends byr<? super E>>> $$1) {
      return new bpj.b<>($$0, $$1);
   }

   public static <E extends boi> Codec<bpj<E>> b(final Collection<? extends bxl<?>> $$0, final Collection<? extends bys<? extends byr<? super E>>> $$1) {
      final MutableObject<Codec<bpj<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bpj<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> kf.B.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bpj<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bpj.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<bxl<?>> $$3x = kf.B.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bpj.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bpj.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bpj.a::error)
                     .<ImmutableList<bpj.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bpj<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bpj.a<U>> a(bxl<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bpj.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bpj<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bpj<E>>)$$2.getValue();
   }

   public bpj(
      Collection<? extends bxl<?>> $$0, Collection<? extends bys<? extends byr<? super E>>> $$1, ImmutableList<bpj.a<?>> $$2, Supplier<Codec<bpj<E>>> $$3
   ) {
      this.b = $$3;

      for (bxl<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (bys<? extends byr<? super E>> $$5 : $$1) {
         this.e.put($$5, (byr<? super E>)$$5.a());
      }

      for (byr<? super E> $$6 : this.e.values()) {
         for (bxl<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bpj.a<?> $$8 = (bpj.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bpj.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bpj.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(bxl<?> $$0) {
      return this.a($$0, bxm.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((bxl<?>)$$0, Optional.empty()));
   }

   public <U> void b(bxl<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(bxl<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(bxl<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(bxk.a($$1, $$2)));
   }

   public <U> void a(bxl<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(bxk::a));
   }

   <U> void b(bxl<U> $$0, Optional<? extends bxk<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(bxl<U> $$0) {
      Optional<? extends bxk<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(bxk::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(bxl<U> $$0) {
      Optional<? extends bxk<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(bxk::c);
   }

   public <U> long e(bxl<U> $$0) {
      Optional<? extends bxk<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(bxk::b).orElse(0L);
   }

   @Deprecated
   @axl
   public Map<bxl<?>, Optional<? extends bxk<?>>> b() {
      return this.d;
   }

   public <U> boolean b(bxl<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(bxl<?> $$0, bxm $$1) {
      Optional<? extends bxk<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == bxm.c || $$1 == bxm.a && $$2.isPresent() || $$1 == bxm.b && $$2.isEmpty();
   }

   public cja c() {
      return this.g;
   }

   public void a(cja $$0) {
      this.g = $$0;
   }

   public void a(Set<ciy> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @axl
   public Set<ciy> d() {
      return this.k;
   }

   @Deprecated
   @axl
   public List<bqb<? super E>> e() {
      List<bqb<? super E>> $$0 = new ObjectArrayList();

      for (Map<ciy, Set<bqb<? super E>>> $$1 : this.f.values()) {
         for (Set<bqb<? super E>> $$2 : $$1.values()) {
            for (bqb<? super E> $$3 : $$2) {
               if ($$3.a() == bqa.a.b) {
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

   public Optional<ciy> g() {
      for (ciy $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(ciy $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(ciy $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(ciy $$0) {
      for (ciy $$1 : this.k) {
         if ($$1 != $$0) {
            Set<bxl<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (bxl<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         ciy $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<ciy> $$0) {
      for (ciy $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(ciy $$0) {
      this.l = $$0;
   }

   public void a(ciy $$0, int $$1, ImmutableList<? extends bqb<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(ciy $$0, int $$1, ImmutableList<? extends bqb<? super E>> $$2, bxl<?> $$3) {
      Set<Pair<bxl<?>, bxm>> $$4 = ImmutableSet.of(Pair.of($$3, bxm.a));
      Set<bxl<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(ciy $$0, ImmutableList<? extends Pair<Integer, ? extends bqb<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(ciy $$0, ImmutableList<? extends Pair<Integer, ? extends bqb<? super E>>> $$1, Set<Pair<bxl<?>, bxm>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(ciy $$0, ImmutableList<? extends Pair<Integer, ? extends bqb<? super E>>> $$1, Set<Pair<bxl<?>, bxm>> $$2, Set<bxl<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bqb<? super E>> $$4 = (Pair<Integer, ? extends bqb<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bqb<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(ciy $$0) {
      return this.k.contains($$0);
   }

   public bpj<E> i() {
      bpj<E> $$0 = new bpj<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<bxl<?>, Optional<? extends bxk<?>>> $$1 : this.d.entrySet()) {
         bxl<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(aow $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(aow $$0, E $$1) {
      for (byr<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<bxl<?>, Optional<? extends bxk<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            bxk<?> $$1 = (bxk<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aow $$0, E $$1) {
      long $$2 = $$1.dM().X();

      for (bqb<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aow $$0, E $$1) {
      long $$2 = $$0.X();

      for (Map<ciy, Set<bqb<? super E>>> $$3 : this.f.values()) {
         for (Entry<ciy, Set<bqb<? super E>>> $$4 : $$3.entrySet()) {
            ciy $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bqb<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bqa.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aow $$0, E $$1) {
      long $$2 = $$0.X();

      for (bqb<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(ciy $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<bxl<?>, bxm> $$1 : this.h.get($$0)) {
            bxl<?> $$2 = (bxl<?>)$$1.getFirst();
            bxm $$3 = (bxm)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bqb<? super E>>> a(int $$0, ImmutableList<? extends bqb<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bqb<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bqb<? super E> $$4 = (bqb<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final bxl<U> a;
      private final Optional<? extends bxk<U>> b;

      static <U> bpj.a<U> a(bxl<U> $$0, Optional<? extends bxk<?>> $$1) {
         return new bpj.a<>($$0, (Optional<? extends bxk<U>>)$$1);
      }

      a(bxl<U> $$0, Optional<? extends bxk<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bpj<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(kf.B.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends boi> {
      private final Collection<? extends bxl<?>> a;
      private final Collection<? extends bys<? extends byr<? super E>>> b;
      private final Codec<bpj<E>> c;

      b(Collection<? extends bxl<?>> $$0, Collection<? extends bys<? extends byr<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bpj.b($$0, $$1);
      }

      public bpj<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bpj.a::error).orElseGet(() -> new bpj<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
