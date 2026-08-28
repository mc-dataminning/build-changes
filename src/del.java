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

public class del extends avi<dem> implements def {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alf<den>, del.c> b = Map.of(
      den.d,
      $$0 -> $$0 instanceof dez $$1 ? $$1.k() : Optional.empty(),
      den.b,
      $$0 -> $$0 instanceof dez $$1 ? Optional.of($$1.f()) : Optional.empty(),
      den.c,
      $$0 -> $$0 instanceof dez $$1 ? $$1.c() : Optional.empty(),
      den.e,
      b(dep.b),
      den.f,
      b(dep.c),
      den.g,
      b(dep.d),
      den.h,
      b(dep.e)
   );
   private static final akz c = akz.a(mh.bv);
   private final jh.a d;
   private dem e = dem.a;
   private Map<alf<den>, den> f = Map.of();
   private der.b<dfe> g = der.b.a();
   private List<del.d> h = List.of();
   private Map<alf<dee<?>>, List<del.d>> i = Map.of();

   public del(jh.a $$0) {
      this.d = $$0;
   }

   protected dem a(avd $$0, bqq $$1) {
      SortedMap<alg, dee<?>> $$2 = new TreeMap<>();
      avh.a($$0, c, this.d.a(JsonOps.INSTANCE), dee.a, $$2);
      List<dej<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         alf<dee<?>> $$3x = alf.a(mh.bv, $$1x);
         dej<?> $$4 = new dej($$3x, $$2x);
         $$3.add($$4);
      });
      return dem.a($$3);
   }

   protected void a(dem $$0, avd $$1, bqq $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cuw $$0) {
      List<der.a<dfe>> $$1 = new ArrayList<>();
      List<del.b> $$2 = b.entrySet().stream().map($$0x -> new del.b((alf<den>)$$0x.getKey(), (del.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         dee<?> $$4 = $$3.b();
         if (!$$4.am_() && $$4.al_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dfe $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new der.a<>($$5.k(), new der<>($$5.c(), Optional.of((dej<dfe>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new der.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<dea> a(cuw $$0, List<dea> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cuw $$0, dea $$1) {
      return $$1.a().allMatch($$1x -> ((czj)$$1x.a()).a($$0));
   }

   public <I extends dek, T extends dee<I>> Optional<dej<T>> a(dep<T> $$0, I $$1, djm $$2, @Nullable alf<dee<?>> $$3) {
      dej<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dek, T extends dee<I>> Optional<dej<T>> a(dep<T> $$0, I $$1, djm $$2, @Nullable dej<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dek, T extends dee<I>> Optional<dej<T>> a(dep<T> $$0, I $$1, djm $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dej<?>> b(alf<dee<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends dee<?>> dej<T> a(dep<T> $$0, alf<dee<?>> $$1) {
      dej<?> $$2 = this.e.a($$1);
      return (dej<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<alf<den>, den> b() {
      return this.f;
   }

   public der.b<dfe> c() {
      return this.g;
   }

   @Override
   public den a(alf<den> $$0) {
      return this.f.getOrDefault($$0, den.j);
   }

   @Override
   public der.b<dfe> a() {
      return this.g;
   }

   public Collection<dej<?>> d() {
      return this.e.a();
   }

   @Nullable
   public del.d a(dfm $$0) {
      return this.h.get($$0.a());
   }

   public void a(alf<dee<?>> $$0, Consumer<dfl> $$1) {
      List<del.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dej<?> a(alf<dee<?>> $$0, JsonObject $$1, jh.a $$2) {
      dee<?> $$3 = (dee<?>)dee.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dej<>($$0, $$3);
   }

   public static <I extends dek, T extends dee<I>> del.a<I, T> a(final dep<T> $$0) {
      return new del.a<I, T>() {
         @Nullable
         private alf<dee<?>> b;

         @Override
         public Optional<dej<T>> a(I $$0x, arq $$1) {
            del $$2 = $$1.t();
            Optional<dej<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dej<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<del.d> a(Iterable<dej<?>> $$0, cuw $$1) {
      List<del.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dej<?> $$4 : $$0) {
         dee<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dea>> $$8;
         if ($$5.am_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.al_().b());
         }

         for (dfk $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dfm $$12 = new dfm($$11);
               dfl $$13 = new dfl($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new del.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static del.c b(dep<? extends dew> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dew $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dek, T extends dee<I>> {
      Optional<dej<T>> a(I var1, arq var2);
   }

   public static class b implements Consumer<dee<?>> {
      final alf<den> a;
      private final del.c b;
      private final List<dea> c = new ArrayList<>();

      protected b(alf<den> $$0, del.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dee<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public den a(cuw $$0) {
         return den.a(del.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<dea> apply(dee<?> var1);
   }

   public static record d(dfl a, dej<?> b) {
   }
}
