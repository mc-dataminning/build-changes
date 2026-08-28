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

public class dfi extends avt<dfj> implements dfc {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alq<dfk>, dfi.c> b = Map.of(
      dfk.d,
      $$0 -> $$0 instanceof dfw $$1 ? $$1.k() : Optional.empty(),
      dfk.b,
      $$0 -> $$0 instanceof dfw $$1 ? Optional.of($$1.f()) : Optional.empty(),
      dfk.c,
      $$0 -> $$0 instanceof dfw $$1 ? $$1.c() : Optional.empty(),
      dfk.e,
      b(dfm.b),
      dfk.f,
      b(dfm.c),
      dfk.g,
      b(dfm.d),
      dfk.h,
      b(dfm.e)
   );
   private static final alk c = alk.a(mi.bv);
   private final ji.a d;
   private dfj e = dfj.a;
   private Map<alq<dfk>, dfk> f = Map.of();
   private dfo.b<dgb> g = dfo.b.a();
   private List<dfi.d> h = List.of();
   private Map<alq<dfb<?>>, List<dfi.d>> i = Map.of();

   public dfi(ji.a $$0) {
      this.d = $$0;
   }

   protected dfj a(avo $$0, brm $$1) {
      SortedMap<alr, dfb<?>> $$2 = new TreeMap<>();
      avs.a($$0, c, this.d.a(JsonOps.INSTANCE), dfb.a, $$2);
      List<dfg<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         alq<dfb<?>> $$3x = alq.a(mi.bv, $$1x);
         dfg<?> $$4 = new dfg($$3x, $$2x);
         $$3.add($$4);
      });
      return dfj.a($$3);
   }

   protected void a(dfj $$0, avo $$1, brm $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cvs $$0) {
      List<dfo.a<dgb>> $$1 = new ArrayList<>();
      List<dfi.b> $$2 = b.entrySet().stream().map($$0x -> new dfi.b((alq<dfk>)$$0x.getKey(), (dfi.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         dfb<?> $$4 = $$3.b();
         if (!$$4.ar_() && $$4.aq_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dgb $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dfo.a<>($$5.k(), new dfo<>($$5.c(), Optional.of((dfg<dgb>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dfo.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<dex> a(cvs $$0, List<dex> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cvs $$0, dex $$1) {
      return $$1.a().allMatch($$1x -> ((dag)$$1x.a()).a($$0));
   }

   public <I extends dfh, T extends dfb<I>> Optional<dfg<T>> a(dfm<T> $$0, I $$1, dkj $$2, @Nullable alq<dfb<?>> $$3) {
      dfg<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dfh, T extends dfb<I>> Optional<dfg<T>> a(dfm<T> $$0, I $$1, dkj $$2, @Nullable dfg<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dfh, T extends dfb<I>> Optional<dfg<T>> a(dfm<T> $$0, I $$1, dkj $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dfg<?>> b(alq<dfb<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends dfb<?>> dfg<T> a(dfm<T> $$0, alq<dfb<?>> $$1) {
      dfg<?> $$2 = this.e.a($$1);
      return (dfg<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<alq<dfk>, dfk> b() {
      return this.f;
   }

   public dfo.b<dgb> c() {
      return this.g;
   }

   @Override
   public dfk a(alq<dfk> $$0) {
      return this.f.getOrDefault($$0, dfk.j);
   }

   @Override
   public dfo.b<dgb> a() {
      return this.g;
   }

   public Collection<dfg<?>> d() {
      return this.e.a();
   }

   @Nullable
   public dfi.d a(dgj $$0) {
      return this.h.get($$0.a());
   }

   public void a(alq<dfb<?>> $$0, Consumer<dgi> $$1) {
      List<dfi.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dfg<?> a(alq<dfb<?>> $$0, JsonObject $$1, ji.a $$2) {
      dfb<?> $$3 = (dfb<?>)dfb.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dfg<>($$0, $$3);
   }

   public static <I extends dfh, T extends dfb<I>> dfi.a<I, T> a(final dfm<T> $$0) {
      return new dfi.a<I, T>() {
         @Nullable
         private alq<dfb<?>> b;

         @Override
         public Optional<dfg<T>> a(I $$0x, asb $$1) {
            dfi $$2 = $$1.t();
            Optional<dfg<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dfg<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dfi.d> a(Iterable<dfg<?>> $$0, cvs $$1) {
      List<dfi.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dfg<?> $$4 : $$0) {
         dfb<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dex>> $$8;
         if ($$5.ar_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.aq_().b());
         }

         for (dgh $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dgj $$12 = new dgj($$11);
               dgi $$13 = new dgi($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dfi.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dfi.c b(dfm<? extends dft> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dft $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dfh, T extends dfb<I>> {
      Optional<dfg<T>> a(I var1, asb var2);
   }

   public static class b implements Consumer<dfb<?>> {
      final alq<dfk> a;
      private final dfi.c b;
      private final List<dex> c = new ArrayList<>();

      protected b(alq<dfk> $$0, dfi.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dfb<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dfk a(cvs $$0) {
         return dfk.a(dfi.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<dex> apply(dfb<?> var1);
   }

   public static record d(dgi a, dfg<?> b) {
   }
}
