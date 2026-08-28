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

public class ddq extends avg<ddr> implements ddk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ald<dds>, ddq.c> b = Map.of(
      dds.d,
      $$0 -> $$0 instanceof dee $$1 ? $$1.k() : Optional.empty(),
      dds.b,
      $$0 -> $$0 instanceof dee $$1 ? Optional.of($$1.f()) : Optional.empty(),
      dds.c,
      $$0 -> $$0 instanceof dee $$1 ? $$1.c() : Optional.empty(),
      dds.e,
      b(ddu.b),
      dds.f,
      b(ddu.c),
      dds.g,
      b(ddu.d),
      dds.h,
      b(ddu.e)
   );
   private static final akx c = akx.a(mg.bs);
   private final jg.a d;
   private ddr e = ddr.a;
   private Map<ald<dds>, dds> f = Map.of();
   private ddw.b<dej> g = ddw.b.a();
   private List<ddq.d> h = List.of();
   private Map<ald<ddj<?>>, List<ddq.d>> i = Map.of();

   public ddq(jg.a $$0) {
      this.d = $$0;
   }

   protected ddr a(avb $$0, bqj $$1) {
      SortedMap<ale, ddj<?>> $$2 = new TreeMap<>();
      avf.a($$0, c, this.d.a(JsonOps.INSTANCE), ddj.a, $$2);
      List<ddo<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         ald<ddj<?>> $$3x = ald.a(mg.bs, $$1x);
         ddo<?> $$4 = new ddo($$3x, $$2x);
         $$3.add($$4);
      });
      return ddr.a($$3);
   }

   protected void a(ddr $$0, avb $$1, bqj $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cub $$0) {
      List<ddw.a<dej>> $$1 = new ArrayList<>();
      List<ddq.b> $$2 = b.entrySet().stream().map($$0x -> new ddq.b((ald<dds>)$$0x.getKey(), (ddq.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         ddj<?> $$4 = $$3.b();
         if (!$$4.al_() && $$4.ak_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dej $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new ddw.a<>($$5.k(), new ddw<>($$5.c(), Optional.of((ddo<dej>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new ddw.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<ddf> a(cub $$0, List<ddf> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cub $$0, ddf $$1) {
      return $$1.a().allMatch($$1x -> ((cyo)$$1x.a()).a($$0));
   }

   public <I extends ddp, T extends ddj<I>> Optional<ddo<T>> a(ddu<T> $$0, I $$1, dip $$2, @Nullable ald<ddj<?>> $$3) {
      ddo<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends ddp, T extends ddj<I>> Optional<ddo<T>> a(ddu<T> $$0, I $$1, dip $$2, @Nullable ddo<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends ddp, T extends ddj<I>> Optional<ddo<T>> a(ddu<T> $$0, I $$1, dip $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<ddo<?>> b(ald<ddj<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends ddj<?>> ddo<T> a(ddu<T> $$0, ald<ddj<?>> $$1) {
      ddo<?> $$2 = this.e.a($$1);
      return (ddo<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<ald<dds>, dds> b() {
      return this.f;
   }

   public ddw.b<dej> d() {
      return this.g;
   }

   @Override
   public dds a(ald<dds> $$0) {
      return this.f.getOrDefault($$0, dds.j);
   }

   @Override
   public ddw.b<dej> a() {
      return this.g;
   }

   public Collection<ddo<?>> e() {
      return this.e.a();
   }

   @Nullable
   public ddq.d a(der $$0) {
      return this.h.get($$0.a());
   }

   public void a(ald<ddj<?>> $$0, Consumer<deq> $$1) {
      List<ddq.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static ddo<?> a(ald<ddj<?>> $$0, JsonObject $$1, jg.a $$2) {
      ddj<?> $$3 = (ddj<?>)ddj.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new ddo<>($$0, $$3);
   }

   public static <I extends ddp, T extends ddj<I>> ddq.a<I, T> a(final ddu<T> $$0) {
      return new ddq.a<I, T>() {
         @Nullable
         private ald<ddj<?>> b;

         @Override
         public Optional<ddo<T>> a(I $$0x, aro $$1) {
            ddq $$2 = $$1.t();
            Optional<ddo<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               ddo<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<ddq.d> a(Iterable<ddo<?>> $$0, cub $$1) {
      List<ddq.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (ddo<?> $$4 : $$0) {
         ddj<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<ddf>> $$8;
         if ($$5.al_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ak_().b());
         }

         for (dep $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               der $$12 = new der($$11);
               deq $$13 = new deq($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new ddq.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static ddq.c b(ddu<? extends deb> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof deb $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends ddp, T extends ddj<I>> {
      Optional<ddo<T>> a(I var1, aro var2);
   }

   public static class b implements Consumer<ddj<?>> {
      final ald<dds> a;
      private final ddq.c b;
      private final List<ddf> c = new ArrayList<>();

      protected b(ald<dds> $$0, ddq.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(ddj<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dds a(cub $$0) {
         return dds.a(ddq.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<ddf> apply(ddj<?> var1);
   }

   public static record d(deq a, ddo<?> b) {
   }
}
