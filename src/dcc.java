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

public class dcc extends avq<dcd> implements dbw {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alo<dce>, dcc.c> b = Map.of(
      dce.d,
      $$0 -> $$0 instanceof dcq $$1 ? $$1.k() : Optional.empty(),
      dce.b,
      $$0 -> $$0 instanceof dcq $$1 ? $$1.f() : Optional.empty(),
      dce.c,
      $$0 -> $$0 instanceof dcq $$1 ? $$1.c() : Optional.empty(),
      dce.e,
      b(dcg.b),
      dce.f,
      b(dcg.c),
      dce.g,
      b(dcg.d),
      dce.h,
      b(dcg.e)
   );
   private final js.a c;
   private dcd d = dcd.a;
   private Map<alo<dce>, dce> e = Map.of();
   private dci.b<dcv> f = dci.b.a();
   private List<dcc.d> g = List.of();
   private Map<alo<dbv<?>>, List<dcc.d>> h = Map.of();

   public dcc(js.a $$0) {
      this.c = $$0;
   }

   protected dcd a(avl $$0, bpj $$1) {
      SortedMap<alp, dbv<?>> $$2 = new TreeMap<>();
      avp.a($$0, mb.c(mb.bk), this.c.a(JsonOps.INSTANCE), dbv.a, $$2);
      List<dca<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         alo<dbv<?>> $$3x = alo.a(mb.bk, $$1x);
         dca<?> $$4 = new dca($$3x, $$2x);
         $$3.add($$4);
      });
      return dcd.a($$3);
   }

   protected void a(dcd $$0, avl $$1, bpj $$2) {
      this.d = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(csk $$0) {
      List<dci.a<dcv>> $$1 = new ArrayList<>();
      List<dcc.b> $$2 = b.entrySet().stream().map($$0x -> new dcc.b((alo<dce>)$$0x.getKey(), (dcc.c)$$0x.getValue())).toList();
      this.d.a().forEach($$3 -> {
         dbv<?> $$4 = $$3.b();
         if (!$$4.aq_() && $$4.ap_().d()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dcv $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dci.a<>($$5.k(), new dci<>($$5.c(), Optional.of((dca<dcv>)$$3))));
            }
         }
      });
      this.e = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.f = new dci.b<>($$1);
      this.g = a(this.d.a(), $$0);
      this.h = this.g.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<dbr> a(csk $$0, List<dbr> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(csk $$0, dbr $$1) {
      return $$1.a().stream().allMatch($$1x -> ((cxc)$$1x.a()).a($$0));
   }

   public <I extends dcb, T extends dbv<I>> Optional<dca<T>> a(dcg<T> $$0, I $$1, dgz $$2, @Nullable alo<dbv<?>> $$3) {
      dca<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dcb, T extends dbv<I>> Optional<dca<T>> a(dcg<T> $$0, I $$1, dgz $$2, @Nullable dca<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dcb, T extends dbv<I>> Optional<dca<T>> a(dcg<T> $$0, I $$1, dgz $$2) {
      return this.d.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dca<?>> b(alo<dbv<?>> $$0) {
      return Optional.ofNullable(this.d.a($$0));
   }

   @Nullable
   private <T extends dbv<?>> dca<T> a(dcg<T> $$0, alo<dbv<?>> $$1) {
      dca<?> $$2 = this.d.a($$1);
      return (dca<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<alo<dce>, dce> b() {
      return this.e;
   }

   public dci.b<dcv> d() {
      return this.f;
   }

   @Override
   public dce a(alo<dce> $$0) {
      return this.e.getOrDefault($$0, dce.j);
   }

   @Override
   public dci.b<dcv> a() {
      return this.f;
   }

   public Collection<dca<?>> e() {
      return this.d.a();
   }

   @Nullable
   public dcc.d a(ddc $$0) {
      return this.g.get($$0.a());
   }

   public void a(alo<dbv<?>> $$0, Consumer<ddb> $$1) {
      List<dcc.d> $$2 = this.h.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dca<?> a(alo<dbv<?>> $$0, JsonObject $$1, js.a $$2) {
      dbv<?> $$3 = (dbv<?>)dbv.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dca<>($$0, $$3);
   }

   public static <I extends dcb, T extends dbv<I>> dcc.a<I, T> a(final dcg<T> $$0) {
      return new dcc.a<I, T>() {
         @Nullable
         private alo<dbv<?>> b;

         @Override
         public Optional<dca<T>> a(I $$0x, arx $$1) {
            dcc $$2 = $$1.t();
            Optional<dca<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dca<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dcc.d> a(Iterable<dca<?>> $$0, csk $$1) {
      List<dcc.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dca<?> $$4 : $$0) {
         dbv<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dbr>> $$8;
         if ($$5.aq_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ap_().b());
         }

         for (dda $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               ddc $$12 = new ddc($$11);
               ddb $$13 = new ddb($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dcc.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dcc.c b(dcg<? extends dcn> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dcn $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dcb, T extends dbv<I>> {
      Optional<dca<T>> a(I var1, arx var2);
   }

   public static class b implements Consumer<dbv<?>> {
      final alo<dce> a;
      private final dcc.c b;
      private final List<dbr> c = new ArrayList<>();

      protected b(alo<dce> $$0, dcc.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dbv<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dce a(csk $$0) {
         return dce.a(dcc.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<dbr> apply(dbv<?> var1);
   }

   public static record d(ddb a, dca<?> b) {
   }
}
