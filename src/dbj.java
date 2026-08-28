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

public class dbj extends aut<dbk> implements dbd {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akt<dbl>, dbj.c> b = Map.of(
      dbl.d,
      $$0 -> $$0 instanceof dbx $$1 ? $$1.k() : Optional.empty(),
      dbl.b,
      $$0 -> $$0 instanceof dbx $$1 ? $$1.f() : Optional.empty(),
      dbl.c,
      $$0 -> $$0 instanceof dbx $$1 ? $$1.c() : Optional.empty(),
      dbl.e,
      b(dbn.b),
      dbl.f,
      b(dbn.c),
      dbl.g,
      b(dbn.d),
      dbl.h,
      b(dbn.e)
   );
   private static final akn c = akn.a(mc.bk);
   private final jt.a d;
   private dbk e = dbk.a;
   private Map<akt<dbl>, dbl> f = Map.of();
   private dbp.b<dcc> g = dbp.b.a();
   private List<dbj.d> h = List.of();
   private Map<akt<dbc<?>>, List<dbj.d>> i = Map.of();

   public dbj(jt.a $$0) {
      this.d = $$0;
   }

   protected dbk a(auo $$0, bor $$1) {
      SortedMap<aku, dbc<?>> $$2 = new TreeMap<>();
      aus.a($$0, c, this.d.a(JsonOps.INSTANCE), dbc.a, $$2);
      List<dbh<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         akt<dbc<?>> $$3x = akt.a(mc.bk, $$1x);
         dbh<?> $$4 = new dbh($$3x, $$2x);
         $$3.add($$4);
      });
      return dbk.a($$3);
   }

   protected void a(dbk $$0, auo $$1, bor $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(crr $$0) {
      List<dbp.a<dcc>> $$1 = new ArrayList<>();
      List<dbj.b> $$2 = b.entrySet().stream().map($$0x -> new dbj.b((akt<dbl>)$$0x.getKey(), (dbj.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         dbc<?> $$4 = $$3.b();
         if (!$$4.ap_() && $$4.ao_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dcc $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dbp.a<>($$5.k(), new dbp<>($$5.c(), Optional.of((dbh<dcc>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dbp.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<day> a(crr $$0, List<day> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(crr $$0, day $$1) {
      return $$1.a().allMatch($$1x -> ((cwj)$$1x.a()).a($$0));
   }

   public <I extends dbi, T extends dbc<I>> Optional<dbh<T>> a(dbn<T> $$0, I $$1, dgg $$2, @Nullable akt<dbc<?>> $$3) {
      dbh<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dbi, T extends dbc<I>> Optional<dbh<T>> a(dbn<T> $$0, I $$1, dgg $$2, @Nullable dbh<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dbi, T extends dbc<I>> Optional<dbh<T>> a(dbn<T> $$0, I $$1, dgg $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dbh<?>> b(akt<dbc<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends dbc<?>> dbh<T> a(dbn<T> $$0, akt<dbc<?>> $$1) {
      dbh<?> $$2 = this.e.a($$1);
      return (dbh<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<akt<dbl>, dbl> b() {
      return this.f;
   }

   public dbp.b<dcc> d() {
      return this.g;
   }

   @Override
   public dbl a(akt<dbl> $$0) {
      return this.f.getOrDefault($$0, dbl.j);
   }

   @Override
   public dbp.b<dcc> a() {
      return this.g;
   }

   public Collection<dbh<?>> e() {
      return this.e.a();
   }

   @Nullable
   public dbj.d a(dcj $$0) {
      return this.h.get($$0.a());
   }

   public void a(akt<dbc<?>> $$0, Consumer<dci> $$1) {
      List<dbj.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dbh<?> a(akt<dbc<?>> $$0, JsonObject $$1, jt.a $$2) {
      dbc<?> $$3 = (dbc<?>)dbc.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dbh<>($$0, $$3);
   }

   public static <I extends dbi, T extends dbc<I>> dbj.a<I, T> a(final dbn<T> $$0) {
      return new dbj.a<I, T>() {
         @Nullable
         private akt<dbc<?>> b;

         @Override
         public Optional<dbh<T>> a(I $$0x, arc $$1) {
            dbj $$2 = $$1.t();
            Optional<dbh<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dbh<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dbj.d> a(Iterable<dbh<?>> $$0, crr $$1) {
      List<dbj.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dbh<?> $$4 : $$0) {
         dbc<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<day>> $$8;
         if ($$5.ap_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ao_().b());
         }

         for (dch $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dcj $$12 = new dcj($$11);
               dci $$13 = new dci($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dbj.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dbj.c b(dbn<? extends dbu> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dbu $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dbi, T extends dbc<I>> {
      Optional<dbh<T>> a(I var1, arc var2);
   }

   public static class b implements Consumer<dbc<?>> {
      final akt<dbl> a;
      private final dbj.c b;
      private final List<day> c = new ArrayList<>();

      protected b(akt<dbl> $$0, dbj.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dbc<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dbl a(crr $$0) {
         return dbl.a(dbj.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<day> apply(dbc<?> var1);
   }

   public static record d(dci a, dbh<?> b) {
   }
}
