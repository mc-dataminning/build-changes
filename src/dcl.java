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

public class dcl extends awa<dcm> implements dcf {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aly<dcn>, dcl.c> b = Map.of(
      dcn.d,
      $$0 -> $$0 instanceof dcz $$1 ? $$1.k() : Optional.empty(),
      dcn.b,
      $$0 -> $$0 instanceof dcz $$1 ? $$1.f() : Optional.empty(),
      dcn.c,
      $$0 -> $$0 instanceof dcz $$1 ? $$1.c() : Optional.empty(),
      dcn.e,
      b(dcp.b),
      dcn.f,
      b(dcp.c),
      dcn.g,
      b(dcp.d),
      dcn.h,
      b(dcp.e)
   );
   private final js.a c;
   private dcm d = dcm.a;
   private Map<aly<dcn>, dcn> e = Map.of();
   private dcr.b<dde> f = dcr.b.a();
   private List<dcl.d> g = List.of();
   private Map<aly<dce<?>>, List<dcl.d>> h = Map.of();

   public dcl(js.a $$0) {
      this.c = $$0;
   }

   protected dcm a(avv $$0, bpt $$1) {
      SortedMap<alz, dce<?>> $$2 = new TreeMap<>();
      avz.a($$0, mb.c(mb.bk), this.c.a(JsonOps.INSTANCE), dce.a, $$2);
      List<dcj<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         aly<dce<?>> $$3x = aly.a(mb.bk, $$1x);
         dcj<?> $$4 = new dcj($$3x, $$2x);
         $$3.add($$4);
      });
      return dcm.a($$3);
   }

   protected void a(dcm $$0, avv $$1, bpt $$2) {
      this.d = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cst $$0) {
      List<dcr.a<dde>> $$1 = new ArrayList<>();
      List<dcl.b> $$2 = b.entrySet().stream().map($$0x -> new dcl.b((aly<dcn>)$$0x.getKey(), (dcl.c)$$0x.getValue())).toList();
      this.d.a().forEach($$3 -> {
         dce<?> $$4 = $$3.b();
         if (!$$4.aq_() && $$4.ap_().d()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dde $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dcr.a<>($$5.k(), new dcr<>($$5.c(), Optional.of((dcj<dde>)$$3))));
            }
         }
      });
      this.e = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.f = new dcr.b<>($$1);
      this.g = a(this.d.a(), $$0);
      this.h = this.g.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<dca> a(cst $$0, List<dca> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cst $$0, dca $$1) {
      return $$1.a().stream().allMatch($$1x -> ((cxl)$$1x.a()).a($$0));
   }

   public <I extends dck, T extends dce<I>> Optional<dcj<T>> a(dcp<T> $$0, I $$1, dhi $$2, @Nullable aly<dce<?>> $$3) {
      dcj<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dck, T extends dce<I>> Optional<dcj<T>> a(dcp<T> $$0, I $$1, dhi $$2, @Nullable dcj<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dck, T extends dce<I>> Optional<dcj<T>> a(dcp<T> $$0, I $$1, dhi $$2) {
      return this.d.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dcj<?>> b(aly<dce<?>> $$0) {
      return Optional.ofNullable(this.d.a($$0));
   }

   @Nullable
   private <T extends dce<?>> dcj<T> a(dcp<T> $$0, aly<dce<?>> $$1) {
      dcj<?> $$2 = this.d.a($$1);
      return (dcj<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<aly<dcn>, dcn> b() {
      return this.e;
   }

   public dcr.b<dde> d() {
      return this.f;
   }

   @Override
   public dcn a(aly<dcn> $$0) {
      return this.e.getOrDefault($$0, dcn.j);
   }

   @Override
   public dcr.b<dde> a() {
      return this.f;
   }

   public Collection<dcj<?>> e() {
      return this.d.a();
   }

   @Nullable
   public dcl.d a(ddl $$0) {
      return this.g.get($$0.a());
   }

   public void a(aly<dce<?>> $$0, Consumer<ddk> $$1) {
      List<dcl.d> $$2 = this.h.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dcj<?> a(aly<dce<?>> $$0, JsonObject $$1, js.a $$2) {
      dce<?> $$3 = (dce<?>)dce.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dcj<>($$0, $$3);
   }

   public static <I extends dck, T extends dce<I>> dcl.a<I, T> a(final dcp<T> $$0) {
      return new dcl.a<I, T>() {
         @Nullable
         private aly<dce<?>> b;

         @Override
         public Optional<dcj<T>> a(I $$0x, ash $$1) {
            dcl $$2 = $$1.s();
            Optional<dcj<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dcj<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dcl.d> a(Iterable<dcj<?>> $$0, cst $$1) {
      List<dcl.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dcj<?> $$4 : $$0) {
         dce<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dca>> $$8;
         if ($$5.aq_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ap_().b());
         }

         for (ddj $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               ddl $$12 = new ddl($$11);
               ddk $$13 = new ddk($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dcl.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dcl.c b(dcp<? extends dcw> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dcw $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dck, T extends dce<I>> {
      Optional<dcj<T>> a(I var1, ash var2);
   }

   public static class b implements Consumer<dce<?>> {
      final aly<dcn> a;
      private final dcl.c b;
      private final List<dca> c = new ArrayList<>();

      protected b(aly<dcn> $$0, dcl.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dce<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dcn a(cst $$0) {
         return dcn.a(dcl.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<dca> apply(dce<?> var1);
   }

   public static record d(ddk a, dcj<?> b) {
   }
}
