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

public class dcf extends awa<dcg> implements dca {
   private static final Logger a = LogUtils.getLogger();
   private final js.a b;
   private dcg c = dcg.a;
   private Map<aly<dch>, dch> d = Map.of();
   private dcl.b<dcy> e = dcl.b.a();
   private List<dcf.b> f = List.of();
   private Map<aly<dbz<?>>, List<dcf.b>> g = Map.of();

   public dcf(js.a $$0) {
      this.b = $$0;
   }

   protected dcg a(avv $$0, bpo $$1) {
      SortedMap<alz, dbz<?>> $$2 = new TreeMap<>();
      avz.a($$0, mb.c(mb.bj), this.b.a(JsonOps.INSTANCE), dbz.a, $$2);
      List<dcd<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         aly<dbz<?>> $$3x = aly.a(mb.bj, $$1x);
         dcd<?> $$4 = new dcd($$3x, $$2x);
         $$3.add($$4);
      });
      return dcg.a($$3);
   }

   protected void a(dcg $$0, avv $$1, bpo $$2) {
      this.c = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cso $$0) {
      List<dbv> $$1 = new ArrayList<>();
      List<dbv> $$2 = new ArrayList<>();
      List<dbv> $$3 = new ArrayList<>();
      List<dbv> $$4 = new ArrayList<>();
      List<dbv> $$5 = new ArrayList<>();
      List<dbv> $$6 = new ArrayList<>();
      List<dbv> $$7 = new ArrayList<>();
      List<dcl.a<dcy>> $$8 = new ArrayList<>();
      this.c.a().forEach($$9 -> {
         dbz<?> $$10 = $$9.b();
         if (!$$10.aq_() && $$10.ap_().d()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$9.a().a());
         } else {
            if ($$10 instanceof dct $$11) {
               $$11.k().ifPresent($$3::add);
               $$11.f().ifPresent($$2::add);
               $$11.c().ifPresent($$1::add);
            }

            if ($$10 instanceof dbf $$12) {
               if ($$12.b() == dcj.b) {
                  $$4.add($$12.k());
               } else if ($$12.b() == dcj.c) {
                  $$5.add($$12.k());
               } else if ($$12.b() == dcj.d) {
                  $$6.add($$12.k());
               } else if ($$12.b() == dcj.e) {
                  $$7.add($$12.k());
               }
            }

            if ($$10 instanceof dcy $$13 && a($$0, $$13.k()) && $$13.c().a($$0)) {
               $$8.add(new dcl.a<>($$13.k(), new dcl<>($$13.c(), Optional.of((dcd<dcy>)$$9))));
            }
         }
      });
      this.d = Map.of(
         dch.d,
         dch.a(a($$0, $$3)),
         dch.b,
         dch.a(a($$0, $$2)),
         dch.c,
         dch.a(a($$0, $$1)),
         dch.e,
         dch.a(a($$0, $$4)),
         dch.f,
         dch.a(a($$0, $$5)),
         dch.g,
         dch.a(a($$0, $$6)),
         dch.h,
         dch.a(a($$0, $$7))
      );
      this.e = new dcl.b<>($$8);
      this.f = a(this.c.a(), $$0);
      this.g = this.f.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   private static List<dbv> a(cso $$0, List<dbv> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cso $$0, dbv $$1) {
      return $$1.a().stream().allMatch($$1x -> ((cxg)$$1x.a()).a($$0));
   }

   public <I extends dce, T extends dbz<I>> Optional<dcd<T>> a(dcj<T> $$0, I $$1, dha $$2, @Nullable aly<dbz<?>> $$3) {
      dcd<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dce, T extends dbz<I>> Optional<dcd<T>> a(dcj<T> $$0, I $$1, dha $$2, @Nullable dcd<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dce, T extends dbz<I>> Optional<dcd<T>> a(dcj<T> $$0, I $$1, dha $$2) {
      return this.c.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dcd<?>> b(aly<dbz<?>> $$0) {
      return Optional.ofNullable(this.c.a($$0));
   }

   @Nullable
   private <T extends dbz<?>> dcd<T> a(dcj<T> $$0, aly<dbz<?>> $$1) {
      dcd<?> $$2 = this.c.a($$1);
      return (dcd<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<aly<dch>, dch> b() {
      return this.d;
   }

   public dcl.b<dcy> d() {
      return this.e;
   }

   @Override
   public dch a(aly<dch> $$0) {
      return this.d.getOrDefault($$0, dch.j);
   }

   @Override
   public dcl.b<dcy> a() {
      return this.e;
   }

   public Collection<dcd<?>> e() {
      return this.c.a();
   }

   @Nullable
   public dcf.b a(dde $$0) {
      return this.f.get($$0.a());
   }

   public void a(aly<dbz<?>> $$0, Consumer<ddd> $$1) {
      this.g.get($$0).forEach($$1x -> $$1.accept($$1x.a));
   }

   @VisibleForTesting
   protected static dcd<?> a(aly<dbz<?>> $$0, JsonObject $$1, js.a $$2) {
      dbz<?> $$3 = (dbz<?>)dbz.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dcd<>($$0, $$3);
   }

   public static <I extends dce, T extends dbz<I>> dcf.a<I, T> a(final dcj<T> $$0) {
      return new dcf.a<I, T>() {
         @Nullable
         private aly<dbz<?>> b;

         @Override
         public Optional<dcd<T>> a(I $$0x, ash $$1) {
            dcf $$2 = $$1.s();
            Optional<dcd<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dcd<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dcf.b> a(Iterable<dcd<?>> $$0, cso $$1) {
      List<dcf.b> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dcd<?> $$4 : $$0) {
         dbz<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dbv>> $$8;
         if ($$5.aq_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ap_().b());
         }

         for (ddc $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dde $$12 = new dde($$11);
               ddd $$13 = new ddd($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dcf.b($$13, $$4));
            }
         }
      }

      return $$2;
   }

   public interface a<I extends dce, T extends dbz<I>> {
      Optional<dcd<T>> a(I var1, ash var2);
   }

   public static record b(ddd a, dcd<?> b) {
   }
}
