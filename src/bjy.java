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

public class bjy<E extends biy> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bjy<E>>> b;
   private static final int c = 20;
   private final Map<brz<?>, Optional<? extends bry<?>>> d = Maps.newHashMap();
   private final Map<bte<? extends btd<? super E>>, btd<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<ccx, Set<bkq<? super E>>>> f = Maps.newTreeMap();
   private ccz g = ccz.c;
   private final Map<ccx, Set<Pair<brz<?>, bsa>>> h = Maps.newHashMap();
   private final Map<ccx, Set<brz<?>>> i = Maps.newHashMap();
   private Set<ccx> j = Sets.newHashSet();
   private final Set<ccx> k = Sets.newHashSet();
   private ccx l = ccx.b;
   private long m = -9999L;

   public static <E extends biy> bjy.b<E> a(Collection<? extends brz<?>> $$0, Collection<? extends bte<? extends btd<? super E>>> $$1) {
      return new bjy.b<>($$0, $$1);
   }

   public static <E extends biy> Codec<bjy<E>> b(final Collection<? extends brz<?>> $$0, final Collection<? extends bte<? extends btd<? super E>>> $$1) {
      final MutableObject<Codec<bjy<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bjy<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> jb.C.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<bjy<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bjy.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<brz<?>> $$3x = jb.C.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bjy.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bjy.a<?>> $$3 = ((DataResult)$$2.getValue())
                     .resultOrPartial(bjy.a::error)
                     .<ImmutableList<bjy.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bjy<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<bjy.a<U>> a(brz<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bjy.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(bjy<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bjy<E>>)$$2.getValue();
   }

   public bjy(
      Collection<? extends brz<?>> $$0, Collection<? extends bte<? extends btd<? super E>>> $$1, ImmutableList<bjy.a<?>> $$2, Supplier<Codec<bjy<E>>> $$3
   ) {
      this.b = $$3;

      for (brz<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (bte<? extends btd<? super E>> $$5 : $$1) {
         this.e.put($$5, (btd<? super E>)$$5.a());
      }

      for (btd<? super E> $$6 : this.e.values()) {
         for (brz<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         bjy.a<?> $$8 = (bjy.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<bjy.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> bjy.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(brz<?> $$0) {
      return this.a($$0, bsa.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((brz<?>)$$0, Optional.empty()));
   }

   public <U> void b(brz<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(brz<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(brz<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(bry.a($$1, $$2)));
   }

   public <U> void a(brz<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(bry::a));
   }

   <U> void b(brz<U> $$0, Optional<? extends bry<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(brz<U> $$0) {
      Optional<? extends bry<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(bry::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(brz<U> $$0) {
      Optional<? extends bry<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(bry::c);
   }

   public <U> long e(brz<U> $$0) {
      Optional<? extends bry<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(bry::b).orElse(0L);
   }

   @Deprecated
   @asq
   public Map<brz<?>, Optional<? extends bry<?>>> b() {
      return this.d;
   }

   public <U> boolean b(brz<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(brz<?> $$0, bsa $$1) {
      Optional<? extends bry<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == bsa.c || $$1 == bsa.a && $$2.isPresent() || $$1 == bsa.b && $$2.isEmpty();
   }

   public ccz c() {
      return this.g;
   }

   public void a(ccz $$0) {
      this.g = $$0;
   }

   public void a(Set<ccx> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @asq
   public Set<ccx> d() {
      return this.k;
   }

   @Deprecated
   @asq
   public List<bkq<? super E>> e() {
      List<bkq<? super E>> $$0 = new ObjectArrayList();

      for (Map<ccx, Set<bkq<? super E>>> $$1 : this.f.values()) {
         for (Set<bkq<? super E>> $$2 : $$1.values()) {
            for (bkq<? super E> $$3 : $$2) {
               if ($$3.a() == bkp.a.b) {
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

   public Optional<ccx> g() {
      for (ccx $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(ccx $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(ccx $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(ccx $$0) {
      for (ccx $$1 : this.k) {
         if ($$1 != $$0) {
            Set<brz<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (brz<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         ccx $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<ccx> $$0) {
      for (ccx $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(ccx $$0) {
      this.l = $$0;
   }

   public void a(ccx $$0, int $$1, ImmutableList<? extends bkq<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(ccx $$0, int $$1, ImmutableList<? extends bkq<? super E>> $$2, brz<?> $$3) {
      Set<Pair<brz<?>, bsa>> $$4 = ImmutableSet.of(Pair.of($$3, bsa.a));
      Set<brz<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(ccx $$0, ImmutableList<? extends Pair<Integer, ? extends bkq<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(ccx $$0, ImmutableList<? extends Pair<Integer, ? extends bkq<? super E>>> $$1, Set<Pair<brz<?>, bsa>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(ccx $$0, ImmutableList<? extends Pair<Integer, ? extends bkq<? super E>>> $$1, Set<Pair<brz<?>, bsa>> $$2, Set<brz<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends bkq<? super E>> $$4 = (Pair<Integer, ? extends bkq<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((bkq<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(ccx $$0) {
      return this.k.contains($$0);
   }

   public bjy<E> i() {
      bjy<E> $$0 = new bjy<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<brz<?>, Optional<? extends bry<?>>> $$1 : this.d.entrySet()) {
         brz<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(akk $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(akk $$0, E $$1) {
      for (btd<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<brz<?>, Optional<? extends bry<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            bry<?> $$1 = (bry<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(akk $$0, E $$1) {
      long $$2 = $$1.dK().V();

      for (bkq<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(akk $$0, E $$1) {
      long $$2 = $$0.V();

      for (Map<ccx, Set<bkq<? super E>>> $$3 : this.f.values()) {
         for (Entry<ccx, Set<bkq<? super E>>> $$4 : $$3.entrySet()) {
            ccx $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (bkq<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == bkp.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(akk $$0, E $$1) {
      long $$2 = $$0.V();

      for (bkq<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(ccx $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<brz<?>, bsa> $$1 : this.h.get($$0)) {
            brz<?> $$2 = (brz<?>)$$1.getFirst();
            bsa $$3 = (bsa)$$1.getSecond();
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

   ImmutableList<? extends Pair<Integer, ? extends bkq<? super E>>> a(int $$0, ImmutableList<? extends bkq<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bkq<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         bkq<? super E> $$4 = (bkq<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final brz<U> a;
      private final Optional<? extends bry<U>> b;

      static <U> bjy.a<U> a(brz<U> $$0, Optional<? extends bry<?>> $$1) {
         return new bjy.a<>($$0, (Optional<? extends bry<U>>)$$1);
      }

      a(brz<U> $$0, Optional<? extends bry<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bjy<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(jb.C.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends biy> {
      private final Collection<? extends brz<?>> a;
      private final Collection<? extends bte<? extends btd<? super E>>> b;
      private final Codec<bjy<E>> c;

      b(Collection<? extends brz<?>> $$0, Collection<? extends bte<? extends btd<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bjy.b($$0, $$1);
      }

      public bjy<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(bjy.a::error).orElseGet(() -> new bjy<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
