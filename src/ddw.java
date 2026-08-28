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

public class ddw extends avi<ddx> implements ddq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alf<ddy>, ddw.c> b = Map.of(
      ddy.d,
      $$0 -> $$0 instanceof dek $$1 ? $$1.k() : Optional.empty(),
      ddy.b,
      $$0 -> $$0 instanceof dek $$1 ? Optional.of($$1.f()) : Optional.empty(),
      ddy.c,
      $$0 -> $$0 instanceof dek $$1 ? $$1.c() : Optional.empty(),
      ddy.e,
      b(dea.b),
      ddy.f,
      b(dea.c),
      ddy.g,
      b(dea.d),
      ddy.h,
      b(dea.e)
   );
   private static final akz c = akz.a(mg.bt);
   private final jg.a d;
   private ddx e = ddx.a;
   private Map<alf<ddy>, ddy> f = Map.of();
   private dec.b<dep> g = dec.b.a();
   private List<ddw.d> h = List.of();
   private Map<alf<ddp<?>>, List<ddw.d>> i = Map.of();

   public ddw(jg.a $$0) {
      this.d = $$0;
   }

   protected ddx a(avd $$0, bqm $$1) {
      SortedMap<alg, ddp<?>> $$2 = new TreeMap<>();
      avh.a($$0, c, this.d.a(JsonOps.INSTANCE), ddp.a, $$2);
      List<ddu<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         alf<ddp<?>> $$3x = alf.a(mg.bt, $$1x);
         ddu<?> $$4 = new ddu($$3x, $$2x);
         $$3.add($$4);
      });
      return ddx.a($$3);
   }

   protected void a(ddx $$0, avd $$1, bqm $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cuh $$0) {
      List<dec.a<dep>> $$1 = new ArrayList<>();
      List<ddw.b> $$2 = b.entrySet().stream().map($$0x -> new ddw.b((alf<ddy>)$$0x.getKey(), (ddw.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         ddp<?> $$4 = $$3.b();
         if (!$$4.al_() && $$4.ak_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dep $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dec.a<>($$5.k(), new dec<>($$5.c(), Optional.of((ddu<dep>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dec.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<ddl> a(cuh $$0, List<ddl> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cuh $$0, ddl $$1) {
      return $$1.a().allMatch($$1x -> ((cyu)$$1x.a()).a($$0));
   }

   public <I extends ddv, T extends ddp<I>> Optional<ddu<T>> a(dea<T> $$0, I $$1, div $$2, @Nullable alf<ddp<?>> $$3) {
      ddu<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends ddv, T extends ddp<I>> Optional<ddu<T>> a(dea<T> $$0, I $$1, div $$2, @Nullable ddu<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends ddv, T extends ddp<I>> Optional<ddu<T>> a(dea<T> $$0, I $$1, div $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<ddu<?>> b(alf<ddp<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends ddp<?>> ddu<T> a(dea<T> $$0, alf<ddp<?>> $$1) {
      ddu<?> $$2 = this.e.a($$1);
      return (ddu<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<alf<ddy>, ddy> b() {
      return this.f;
   }

   public dec.b<dep> d() {
      return this.g;
   }

   @Override
   public ddy a(alf<ddy> $$0) {
      return this.f.getOrDefault($$0, ddy.j);
   }

   @Override
   public dec.b<dep> a() {
      return this.g;
   }

   public Collection<ddu<?>> e() {
      return this.e.a();
   }

   @Nullable
   public ddw.d a(dex $$0) {
      return this.h.get($$0.a());
   }

   public void a(alf<ddp<?>> $$0, Consumer<dew> $$1) {
      List<ddw.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static ddu<?> a(alf<ddp<?>> $$0, JsonObject $$1, jg.a $$2) {
      ddp<?> $$3 = (ddp<?>)ddp.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new ddu<>($$0, $$3);
   }

   public static <I extends ddv, T extends ddp<I>> ddw.a<I, T> a(final dea<T> $$0) {
      return new ddw.a<I, T>() {
         @Nullable
         private alf<ddp<?>> b;

         @Override
         public Optional<ddu<T>> a(I $$0x, arq $$1) {
            ddw $$2 = $$1.t();
            Optional<ddu<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               ddu<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<ddw.d> a(Iterable<ddu<?>> $$0, cuh $$1) {
      List<ddw.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (ddu<?> $$4 : $$0) {
         ddp<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<ddl>> $$8;
         if ($$5.al_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ak_().b());
         }

         for (dev $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dex $$12 = new dex($$11);
               dew $$13 = new dew($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new ddw.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static ddw.c b(dea<? extends deh> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof deh $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends ddv, T extends ddp<I>> {
      Optional<ddu<T>> a(I var1, arq var2);
   }

   public static class b implements Consumer<ddp<?>> {
      final alf<ddy> a;
      private final ddw.c b;
      private final List<ddl> c = new ArrayList<>();

      protected b(alf<ddy> $$0, ddw.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(ddp<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public ddy a(cuh $$0) {
         return ddy.a(ddw.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<ddl> apply(ddp<?> var1);
   }

   public static record d(dew a, ddu<?> b) {
   }
}
