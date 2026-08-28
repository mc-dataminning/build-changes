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

public class dei extends avi<dej> implements dec {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alf<dek>, dei.c> b = Map.of(
      dek.d,
      $$0 -> $$0 instanceof dew $$1 ? $$1.k() : Optional.empty(),
      dek.b,
      $$0 -> $$0 instanceof dew $$1 ? Optional.of($$1.f()) : Optional.empty(),
      dek.c,
      $$0 -> $$0 instanceof dew $$1 ? $$1.c() : Optional.empty(),
      dek.e,
      b(dem.b),
      dek.f,
      b(dem.c),
      dek.g,
      b(dem.d),
      dek.h,
      b(dem.e)
   );
   private static final akz c = akz.a(mh.bu);
   private final jh.a d;
   private dej e = dej.a;
   private Map<alf<dek>, dek> f = Map.of();
   private deo.b<dfb> g = deo.b.a();
   private List<dei.d> h = List.of();
   private Map<alf<deb<?>>, List<dei.d>> i = Map.of();

   public dei(jh.a $$0) {
      this.d = $$0;
   }

   protected dej a(avd $$0, bqq $$1) {
      SortedMap<alg, deb<?>> $$2 = new TreeMap<>();
      avh.a($$0, c, this.d.a(JsonOps.INSTANCE), deb.a, $$2);
      List<deg<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         alf<deb<?>> $$3x = alf.a(mh.bu, $$1x);
         deg<?> $$4 = new deg($$3x, $$2x);
         $$3.add($$4);
      });
      return dej.a($$3);
   }

   protected void a(dej $$0, avd $$1, bqq $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cut $$0) {
      List<deo.a<dfb>> $$1 = new ArrayList<>();
      List<dei.b> $$2 = b.entrySet().stream().map($$0x -> new dei.b((alf<dek>)$$0x.getKey(), (dei.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         deb<?> $$4 = $$3.b();
         if (!$$4.am_() && $$4.al_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dfb $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new deo.a<>($$5.k(), new deo<>($$5.c(), Optional.of((deg<dfb>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new deo.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<ddx> a(cut $$0, List<ddx> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cut $$0, ddx $$1) {
      return $$1.a().allMatch($$1x -> ((czg)$$1x.a()).a($$0));
   }

   public <I extends deh, T extends deb<I>> Optional<deg<T>> a(dem<T> $$0, I $$1, djh $$2, @Nullable alf<deb<?>> $$3) {
      deg<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends deh, T extends deb<I>> Optional<deg<T>> a(dem<T> $$0, I $$1, djh $$2, @Nullable deg<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends deh, T extends deb<I>> Optional<deg<T>> a(dem<T> $$0, I $$1, djh $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<deg<?>> b(alf<deb<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends deb<?>> deg<T> a(dem<T> $$0, alf<deb<?>> $$1) {
      deg<?> $$2 = this.e.a($$1);
      return (deg<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<alf<dek>, dek> b() {
      return this.f;
   }

   public deo.b<dfb> c() {
      return this.g;
   }

   @Override
   public dek a(alf<dek> $$0) {
      return this.f.getOrDefault($$0, dek.j);
   }

   @Override
   public deo.b<dfb> a() {
      return this.g;
   }

   public Collection<deg<?>> d() {
      return this.e.a();
   }

   @Nullable
   public dei.d a(dfj $$0) {
      return this.h.get($$0.a());
   }

   public void a(alf<deb<?>> $$0, Consumer<dfi> $$1) {
      List<dei.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static deg<?> a(alf<deb<?>> $$0, JsonObject $$1, jh.a $$2) {
      deb<?> $$3 = (deb<?>)deb.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new deg<>($$0, $$3);
   }

   public static <I extends deh, T extends deb<I>> dei.a<I, T> a(final dem<T> $$0) {
      return new dei.a<I, T>() {
         @Nullable
         private alf<deb<?>> b;

         @Override
         public Optional<deg<T>> a(I $$0x, arq $$1) {
            dei $$2 = $$1.t();
            Optional<deg<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               deg<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dei.d> a(Iterable<deg<?>> $$0, cut $$1) {
      List<dei.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (deg<?> $$4 : $$0) {
         deb<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<ddx>> $$8;
         if ($$5.am_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.al_().b());
         }

         for (dfh $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dfj $$12 = new dfj($$11);
               dfi $$13 = new dfi($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dei.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dei.c b(dem<? extends det> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof det $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends deh, T extends deb<I>> {
      Optional<deg<T>> a(I var1, arq var2);
   }

   public static class b implements Consumer<deb<?>> {
      final alf<dek> a;
      private final dei.c b;
      private final List<ddx> c = new ArrayList<>();

      protected b(alf<dek> $$0, dei.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(deb<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dek a(cut $$0) {
         return dek.a(dei.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<ddx> apply(deb<?> var1);
   }

   public static record d(dfi a, deg<?> b) {
   }
}
