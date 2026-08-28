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

public class dck extends awa<dcl> implements dce {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aly<dcm>, dck.c> b = Map.of(
      dcm.d,
      $$0 -> $$0 instanceof dcy $$1 ? $$1.k() : Optional.empty(),
      dcm.b,
      $$0 -> $$0 instanceof dcy $$1 ? $$1.f() : Optional.empty(),
      dcm.c,
      $$0 -> $$0 instanceof dcy $$1 ? $$1.c() : Optional.empty(),
      dcm.e,
      b(dco.b),
      dcm.f,
      b(dco.c),
      dcm.g,
      b(dco.d),
      dcm.h,
      b(dco.e)
   );
   private final js.a c;
   private dcl d = dcl.a;
   private Map<aly<dcm>, dcm> e = Map.of();
   private dcq.b<ddd> f = dcq.b.a();
   private List<dck.d> g = List.of();
   private Map<aly<dcd<?>>, List<dck.d>> h = Map.of();

   public dck(js.a $$0) {
      this.c = $$0;
   }

   protected dcl a(avv $$0, bps $$1) {
      SortedMap<alz, dcd<?>> $$2 = new TreeMap<>();
      avz.a($$0, mb.c(mb.bk), this.c.a(JsonOps.INSTANCE), dcd.a, $$2);
      List<dci<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         aly<dcd<?>> $$3x = aly.a(mb.bk, $$1x);
         dci<?> $$4 = new dci($$3x, $$2x);
         $$3.add($$4);
      });
      return dcl.a($$3);
   }

   protected void a(dcl $$0, avv $$1, bps $$2) {
      this.d = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(css $$0) {
      List<dcq.a<ddd>> $$1 = new ArrayList<>();
      List<dck.b> $$2 = b.entrySet().stream().map($$0x -> new dck.b((aly<dcm>)$$0x.getKey(), (dck.c)$$0x.getValue())).toList();
      this.d.a().forEach($$3 -> {
         dcd<?> $$4 = $$3.b();
         if (!$$4.aq_() && $$4.ap_().d()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof ddd $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dcq.a<>($$5.k(), new dcq<>($$5.c(), Optional.of((dci<ddd>)$$3))));
            }
         }
      });
      this.e = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.f = new dcq.b<>($$1);
      this.g = a(this.d.a(), $$0);
      this.h = this.g.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<dbz> a(css $$0, List<dbz> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(css $$0, dbz $$1) {
      return $$1.a().stream().allMatch($$1x -> ((cxk)$$1x.a()).a($$0));
   }

   public <I extends dcj, T extends dcd<I>> Optional<dci<T>> a(dco<T> $$0, I $$1, dhh $$2, @Nullable aly<dcd<?>> $$3) {
      dci<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dcj, T extends dcd<I>> Optional<dci<T>> a(dco<T> $$0, I $$1, dhh $$2, @Nullable dci<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dcj, T extends dcd<I>> Optional<dci<T>> a(dco<T> $$0, I $$1, dhh $$2) {
      return this.d.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dci<?>> b(aly<dcd<?>> $$0) {
      return Optional.ofNullable(this.d.a($$0));
   }

   @Nullable
   private <T extends dcd<?>> dci<T> a(dco<T> $$0, aly<dcd<?>> $$1) {
      dci<?> $$2 = this.d.a($$1);
      return (dci<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<aly<dcm>, dcm> b() {
      return this.e;
   }

   public dcq.b<ddd> d() {
      return this.f;
   }

   @Override
   public dcm a(aly<dcm> $$0) {
      return this.e.getOrDefault($$0, dcm.j);
   }

   @Override
   public dcq.b<ddd> a() {
      return this.f;
   }

   public Collection<dci<?>> e() {
      return this.d.a();
   }

   @Nullable
   public dck.d a(ddk $$0) {
      return this.g.get($$0.a());
   }

   public void a(aly<dcd<?>> $$0, Consumer<ddj> $$1) {
      List<dck.d> $$2 = this.h.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dci<?> a(aly<dcd<?>> $$0, JsonObject $$1, js.a $$2) {
      dcd<?> $$3 = (dcd<?>)dcd.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dci<>($$0, $$3);
   }

   public static <I extends dcj, T extends dcd<I>> dck.a<I, T> a(final dco<T> $$0) {
      return new dck.a<I, T>() {
         @Nullable
         private aly<dcd<?>> b;

         @Override
         public Optional<dci<T>> a(I $$0x, ash $$1) {
            dck $$2 = $$1.s();
            Optional<dci<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dci<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dck.d> a(Iterable<dci<?>> $$0, css $$1) {
      List<dck.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dci<?> $$4 : $$0) {
         dcd<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dbz>> $$8;
         if ($$5.aq_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ap_().b());
         }

         for (ddi $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               ddk $$12 = new ddk($$11);
               ddj $$13 = new ddj($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dck.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dck.c b(dco<? extends dcv> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dcv $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dcj, T extends dcd<I>> {
      Optional<dci<T>> a(I var1, ash var2);
   }

   public static class b implements Consumer<dcd<?>> {
      final aly<dcm> a;
      private final dck.c b;
      private final List<dbz> c = new ArrayList<>();

      protected b(aly<dcm> $$0, dck.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dcd<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dcm a(css $$0) {
         return dcm.a(dck.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<dbz> apply(dcd<?> var1);
   }

   public static record d(ddj a, dci<?> b) {
   }
}
