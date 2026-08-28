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

public class dcs extends avf<dct> implements dcm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alc<dcu>, dcs.c> b = Map.of(
      dcu.d,
      $$0 -> $$0 instanceof ddg $$1 ? $$1.k() : Optional.empty(),
      dcu.b,
      $$0 -> $$0 instanceof ddg $$1 ? $$1.f() : Optional.empty(),
      dcu.c,
      $$0 -> $$0 instanceof ddg $$1 ? $$1.c() : Optional.empty(),
      dcu.e,
      b(dcw.b),
      dcu.f,
      b(dcw.c),
      dcu.g,
      b(dcw.d),
      dcu.h,
      b(dcw.e)
   );
   private static final akw c = akw.a(me.br);
   private final ju.a d;
   private dct e = dct.a;
   private Map<alc<dcu>, dcu> f = Map.of();
   private dcy.b<ddl> g = dcy.b.a();
   private List<dcs.d> h = List.of();
   private Map<alc<dcl<?>>, List<dcs.d>> i = Map.of();

   public dcs(ju.a $$0) {
      this.d = $$0;
   }

   protected dct a(ava $$0, bqb $$1) {
      SortedMap<ald, dcl<?>> $$2 = new TreeMap<>();
      ave.a($$0, c, this.d.a(JsonOps.INSTANCE), dcl.a, $$2);
      List<dcq<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         alc<dcl<?>> $$3x = alc.a(me.br, $$1x);
         dcq<?> $$4 = new dcq($$3x, $$2x);
         $$3.add($$4);
      });
      return dct.a($$3);
   }

   protected void a(dct $$0, ava $$1, bqb $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cte $$0) {
      List<dcy.a<ddl>> $$1 = new ArrayList<>();
      List<dcs.b> $$2 = b.entrySet().stream().map($$0x -> new dcs.b((alc<dcu>)$$0x.getKey(), (dcs.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         dcl<?> $$4 = $$3.b();
         if (!$$4.al_() && $$4.ak_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof ddl $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dcy.a<>($$5.k(), new dcy<>($$5.c(), Optional.of((dcq<ddl>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dcy.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<dch> a(cte $$0, List<dch> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cte $$0, dch $$1) {
      return $$1.a().allMatch($$1x -> ((cxu)$$1x.a()).a($$0));
   }

   public <I extends dcr, T extends dcl<I>> Optional<dcq<T>> a(dcw<T> $$0, I $$1, dhp $$2, @Nullable alc<dcl<?>> $$3) {
      dcq<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dcr, T extends dcl<I>> Optional<dcq<T>> a(dcw<T> $$0, I $$1, dhp $$2, @Nullable dcq<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dcr, T extends dcl<I>> Optional<dcq<T>> a(dcw<T> $$0, I $$1, dhp $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dcq<?>> b(alc<dcl<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends dcl<?>> dcq<T> a(dcw<T> $$0, alc<dcl<?>> $$1) {
      dcq<?> $$2 = this.e.a($$1);
      return (dcq<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<alc<dcu>, dcu> b() {
      return this.f;
   }

   public dcy.b<ddl> d() {
      return this.g;
   }

   @Override
   public dcu a(alc<dcu> $$0) {
      return this.f.getOrDefault($$0, dcu.j);
   }

   @Override
   public dcy.b<ddl> a() {
      return this.g;
   }

   public Collection<dcq<?>> e() {
      return this.e.a();
   }

   @Nullable
   public dcs.d a(ddt $$0) {
      return this.h.get($$0.a());
   }

   public void a(alc<dcl<?>> $$0, Consumer<dds> $$1) {
      List<dcs.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dcq<?> a(alc<dcl<?>> $$0, JsonObject $$1, ju.a $$2) {
      dcl<?> $$3 = (dcl<?>)dcl.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dcq<>($$0, $$3);
   }

   public static <I extends dcr, T extends dcl<I>> dcs.a<I, T> a(final dcw<T> $$0) {
      return new dcs.a<I, T>() {
         @Nullable
         private alc<dcl<?>> b;

         @Override
         public Optional<dcq<T>> a(I $$0x, arn $$1) {
            dcs $$2 = $$1.t();
            Optional<dcq<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dcq<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dcs.d> a(Iterable<dcq<?>> $$0, cte $$1) {
      List<dcs.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dcq<?> $$4 : $$0) {
         dcl<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dch>> $$8;
         if ($$5.al_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ak_().b());
         }

         for (ddr $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               ddt $$12 = new ddt($$11);
               dds $$13 = new dds($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dcs.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dcs.c b(dcw<? extends ddd> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof ddd $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dcr, T extends dcl<I>> {
      Optional<dcq<T>> a(I var1, arn var2);
   }

   public static class b implements Consumer<dcl<?>> {
      final alc<dcu> a;
      private final dcs.c b;
      private final List<dch> c = new ArrayList<>();

      protected b(alc<dcu> $$0, dcs.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dcl<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dcu a(cte $$0) {
         return dcu.a(dcs.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<dch> apply(dcl<?> var1);
   }

   public static record d(dds a, dcq<?> b) {
   }
}
