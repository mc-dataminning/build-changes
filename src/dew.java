import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dew extends avk<dex> implements deq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alh<dey>, dew.c> b = Map.of(
      dey.d,
      $$0 -> $$0 instanceof dfk $$1 ? $$1.k() : Optional.empty(),
      dey.b,
      $$0 -> $$0 instanceof dfk $$1 ? Optional.of($$1.f()) : Optional.empty(),
      dey.c,
      $$0 -> $$0 instanceof dfk $$1 ? $$1.c() : Optional.empty(),
      dey.e,
      b(dfa.b),
      dey.f,
      b(dfa.c),
      dey.g,
      b(dfa.d),
      dey.h,
      b(dfa.e)
   );
   private static final alb c = alb.a(mh.bv);
   private final jh.a d;
   private dex e = dex.a;
   private Map<alh<dey>, dey> f = Map.of();
   private dfc.b<dfp> g = dfc.b.a();
   private List<dew.d> h = List.of();
   private Map<alh<dep<?>>, List<dew.d>> i = Map.of();

   public dew(jh.a $$0) {
      this.d = $$0;
   }

   protected dex a(avf $$0, brb $$1) {
      SortedMap<ali, dep<?>> $$2 = new TreeMap<>();
      avj.a($$0, c, this.d.a(JsonOps.INSTANCE), dep.a, $$2);
      List<deu<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         alh<dep<?>> $$3x = alh.a(mh.bv, $$1x);
         deu<?> $$4 = new deu($$3x, $$2x);
         $$3.add($$4);
      });
      return dex.a($$3);
   }

   protected void a(dex $$0, avf $$1, brb $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cvh $$0) {
      List<dfc.a<dfp>> $$1 = new ArrayList<>();
      List<dew.b> $$2 = b.entrySet().stream().map($$0x -> new dew.b((alh<dey>)$$0x.getKey(), (dew.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         dep<?> $$4 = $$3.b();
         if (!$$4.aq_() && $$4.ap_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dfp $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dfc.a<>($$5.k(), new dfc<>($$5.c(), Optional.of((deu<dfp>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dfc.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<del> a(cvh $$0, List<del> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cvh $$0, del $$1) {
      return $$1.a().allMatch($$1x -> ((czu)$$1x.a()).a($$0));
   }

   public <I extends dev, T extends dep<I>> Optional<deu<T>> a(dfa<T> $$0, I $$1, djx $$2, @Nullable alh<dep<?>> $$3) {
      deu<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dev, T extends dep<I>> Optional<deu<T>> a(dfa<T> $$0, I $$1, djx $$2, @Nullable deu<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dev, T extends dep<I>> Optional<deu<T>> a(dfa<T> $$0, I $$1, djx $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<deu<?>> b(alh<dep<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends dep<?>> deu<T> a(dfa<T> $$0, alh<dep<?>> $$1) {
      deu<?> $$2 = this.e.a($$1);
      return (deu<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<alh<dey>, dey> b() {
      return this.f;
   }

   public dfc.b<dfp> c() {
      return this.g;
   }

   @Override
   public dey a(alh<dey> $$0) {
      return this.f.getOrDefault($$0, dey.j);
   }

   @Override
   public dfc.b<dfp> a() {
      return this.g;
   }

   public Collection<deu<?>> d() {
      return this.e.a();
   }

   @Nullable
   public dew.d a(dfx $$0) {
      return this.h.get($$0.a());
   }

   public void a(alh<dep<?>> $$0, Consumer<dfw> $$1) {
      List<dew.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static deu<?> a(alh<dep<?>> $$0, JsonObject $$1, jh.a $$2) {
      dep<?> $$3 = (dep<?>)dep.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new deu<>($$0, $$3);
   }

   public static <I extends dev, T extends dep<I>> dew.a<I, T> a(final dfa<T> $$0) {
      return new dew.a<I, T>() {
         @Nullable
         private alh<dep<?>> b;

         @Override
         public Optional<deu<T>> a(I $$0x, ars $$1) {
            dew $$2 = $$1.t();
            Optional<deu<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               deu<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dew.d> a(Iterable<deu<?>> $$0, cvh $$1) {
      List<dew.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (deu<?> $$4 : $$0) {
         dep<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<del>> $$8;
         if ($$5.aq_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ap_().b());
         }

         for (dfv $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dfx $$12 = new dfx($$11);
               dfw $$13 = new dfw($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dew.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dew.c b(dfa<? extends dfh> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dfh $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dev, T extends dep<I>> {
      Optional<deu<T>> a(I var1, ars var2);
   }

   public static class b implements Consumer<dep<?>> {
      final alh<dey> a;
      private final dew.c b;
      private final List<del> c = new ArrayList<>();

      protected b(alh<dey> $$0, dew.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dep<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dey a(cvh $$0) {
         return dey.a(dew.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<del> apply(dep<?> var1);
   }

   public static record d(dfw a, deu<?> b) {
   }
}
