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

public class dey extends avm<dez> implements des {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alj<dfa>, dey.c> b = Map.of(
      dfa.d,
      $$0 -> $$0 instanceof dfm $$1 ? $$1.k() : Optional.empty(),
      dfa.b,
      $$0 -> $$0 instanceof dfm $$1 ? Optional.of($$1.f()) : Optional.empty(),
      dfa.c,
      $$0 -> $$0 instanceof dfm $$1 ? $$1.c() : Optional.empty(),
      dfa.e,
      b(dfc.b),
      dfa.f,
      b(dfc.c),
      dfa.g,
      b(dfc.d),
      dfa.h,
      b(dfc.e)
   );
   private static final ald c = ald.a(mi.bv);
   private final ji.a d;
   private dez e = dez.a;
   private Map<alj<dfa>, dfa> f = Map.of();
   private dfe.b<dfr> g = dfe.b.a();
   private List<dey.d> h = List.of();
   private Map<alj<der<?>>, List<dey.d>> i = Map.of();

   public dey(ji.a $$0) {
      this.d = $$0;
   }

   protected dez a(avh $$0, brd $$1) {
      SortedMap<alk, der<?>> $$2 = new TreeMap<>();
      avl.a($$0, c, this.d.a(JsonOps.INSTANCE), der.a, $$2);
      List<dew<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         alj<der<?>> $$3x = alj.a(mi.bv, $$1x);
         dew<?> $$4 = new dew($$3x, $$2x);
         $$3.add($$4);
      });
      return dez.a($$3);
   }

   protected void a(dez $$0, avh $$1, brd $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cvj $$0) {
      List<dfe.a<dfr>> $$1 = new ArrayList<>();
      List<dey.b> $$2 = b.entrySet().stream().map($$0x -> new dey.b((alj<dfa>)$$0x.getKey(), (dey.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         der<?> $$4 = $$3.b();
         if (!$$4.aq_() && $$4.ap_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dfr $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dfe.a<>($$5.k(), new dfe<>($$5.c(), Optional.of((dew<dfr>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dfe.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<den> a(cvj $$0, List<den> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cvj $$0, den $$1) {
      return $$1.a().allMatch($$1x -> ((czw)$$1x.a()).a($$0));
   }

   public <I extends dex, T extends der<I>> Optional<dew<T>> a(dfc<T> $$0, I $$1, djz $$2, @Nullable alj<der<?>> $$3) {
      dew<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dex, T extends der<I>> Optional<dew<T>> a(dfc<T> $$0, I $$1, djz $$2, @Nullable dew<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dex, T extends der<I>> Optional<dew<T>> a(dfc<T> $$0, I $$1, djz $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dew<?>> b(alj<der<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends der<?>> dew<T> a(dfc<T> $$0, alj<der<?>> $$1) {
      dew<?> $$2 = this.e.a($$1);
      return (dew<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<alj<dfa>, dfa> b() {
      return this.f;
   }

   public dfe.b<dfr> c() {
      return this.g;
   }

   @Override
   public dfa a(alj<dfa> $$0) {
      return this.f.getOrDefault($$0, dfa.j);
   }

   @Override
   public dfe.b<dfr> a() {
      return this.g;
   }

   public Collection<dew<?>> d() {
      return this.e.a();
   }

   @Nullable
   public dey.d a(dfz $$0) {
      return this.h.get($$0.a());
   }

   public void a(alj<der<?>> $$0, Consumer<dfy> $$1) {
      List<dey.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dew<?> a(alj<der<?>> $$0, JsonObject $$1, ji.a $$2) {
      der<?> $$3 = (der<?>)der.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dew<>($$0, $$3);
   }

   public static <I extends dex, T extends der<I>> dey.a<I, T> a(final dfc<T> $$0) {
      return new dey.a<I, T>() {
         @Nullable
         private alj<der<?>> b;

         @Override
         public Optional<dew<T>> a(I $$0x, aru $$1) {
            dey $$2 = $$1.t();
            Optional<dew<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dew<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dey.d> a(Iterable<dew<?>> $$0, cvj $$1) {
      List<dey.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dew<?> $$4 : $$0) {
         der<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<den>> $$8;
         if ($$5.aq_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ap_().b());
         }

         for (dfx $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dfz $$12 = new dfz($$11);
               dfy $$13 = new dfy($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dey.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dey.c b(dfc<? extends dfj> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dfj $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dex, T extends der<I>> {
      Optional<dew<T>> a(I var1, aru var2);
   }

   public static class b implements Consumer<der<?>> {
      final alj<dfa> a;
      private final dey.c b;
      private final List<den> c = new ArrayList<>();

      protected b(alj<dfa> $$0, dey.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(der<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dfa a(cvj $$0) {
         return dfa.a(dey.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<den> apply(der<?> var1);
   }

   public static record d(dfy a, dew<?> b) {
   }
}
