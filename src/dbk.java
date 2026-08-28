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

public class dbk extends auu<dbl> implements dbe {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aku<dbm>, dbk.c> b = Map.of(
      dbm.d,
      $$0 -> $$0 instanceof dby $$1 ? $$1.k() : Optional.empty(),
      dbm.b,
      $$0 -> $$0 instanceof dby $$1 ? $$1.f() : Optional.empty(),
      dbm.c,
      $$0 -> $$0 instanceof dby $$1 ? $$1.c() : Optional.empty(),
      dbm.e,
      b(dbo.b),
      dbm.f,
      b(dbo.c),
      dbm.g,
      b(dbo.d),
      dbm.h,
      b(dbo.e)
   );
   private static final ako c = ako.a(mc.bk);
   private final jt.a d;
   private dbl e = dbl.a;
   private Map<aku<dbm>, dbm> f = Map.of();
   private dbq.b<dcd> g = dbq.b.a();
   private List<dbk.d> h = List.of();
   private Map<aku<dbd<?>>, List<dbk.d>> i = Map.of();

   public dbk(jt.a $$0) {
      this.d = $$0;
   }

   protected dbl a(aup $$0, bos $$1) {
      SortedMap<akv, dbd<?>> $$2 = new TreeMap<>();
      aut.a($$0, c, this.d.a(JsonOps.INSTANCE), dbd.a, $$2);
      List<dbi<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         aku<dbd<?>> $$3x = aku.a(mc.bk, $$1x);
         dbi<?> $$4 = new dbi($$3x, $$2x);
         $$3.add($$4);
      });
      return dbl.a($$3);
   }

   protected void a(dbl $$0, aup $$1, bos $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(crs $$0) {
      List<dbq.a<dcd>> $$1 = new ArrayList<>();
      List<dbk.b> $$2 = b.entrySet().stream().map($$0x -> new dbk.b((aku<dbm>)$$0x.getKey(), (dbk.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         dbd<?> $$4 = $$3.b();
         if (!$$4.ap_() && $$4.ao_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dcd $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dbq.a<>($$5.k(), new dbq<>($$5.c(), Optional.of((dbi<dcd>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dbq.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<daz> a(crs $$0, List<daz> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(crs $$0, daz $$1) {
      return $$1.a().allMatch($$1x -> ((cwk)$$1x.a()).a($$0));
   }

   public <I extends dbj, T extends dbd<I>> Optional<dbi<T>> a(dbo<T> $$0, I $$1, dgh $$2, @Nullable aku<dbd<?>> $$3) {
      dbi<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dbj, T extends dbd<I>> Optional<dbi<T>> a(dbo<T> $$0, I $$1, dgh $$2, @Nullable dbi<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dbj, T extends dbd<I>> Optional<dbi<T>> a(dbo<T> $$0, I $$1, dgh $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dbi<?>> b(aku<dbd<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends dbd<?>> dbi<T> a(dbo<T> $$0, aku<dbd<?>> $$1) {
      dbi<?> $$2 = this.e.a($$1);
      return (dbi<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<aku<dbm>, dbm> b() {
      return this.f;
   }

   public dbq.b<dcd> d() {
      return this.g;
   }

   @Override
   public dbm a(aku<dbm> $$0) {
      return this.f.getOrDefault($$0, dbm.j);
   }

   @Override
   public dbq.b<dcd> a() {
      return this.g;
   }

   public Collection<dbi<?>> e() {
      return this.e.a();
   }

   @Nullable
   public dbk.d a(dck $$0) {
      return this.h.get($$0.a());
   }

   public void a(aku<dbd<?>> $$0, Consumer<dcj> $$1) {
      List<dbk.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dbi<?> a(aku<dbd<?>> $$0, JsonObject $$1, jt.a $$2) {
      dbd<?> $$3 = (dbd<?>)dbd.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dbi<>($$0, $$3);
   }

   public static <I extends dbj, T extends dbd<I>> dbk.a<I, T> a(final dbo<T> $$0) {
      return new dbk.a<I, T>() {
         @Nullable
         private aku<dbd<?>> b;

         @Override
         public Optional<dbi<T>> a(I $$0x, ard $$1) {
            dbk $$2 = $$1.t();
            Optional<dbi<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dbi<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dbk.d> a(Iterable<dbi<?>> $$0, crs $$1) {
      List<dbk.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dbi<?> $$4 : $$0) {
         dbd<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<daz>> $$8;
         if ($$5.ap_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ao_().b());
         }

         for (dci $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dck $$12 = new dck($$11);
               dcj $$13 = new dcj($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dbk.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dbk.c b(dbo<? extends dbv> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dbv $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dbj, T extends dbd<I>> {
      Optional<dbi<T>> a(I var1, ard var2);
   }

   public static class b implements Consumer<dbd<?>> {
      final aku<dbm> a;
      private final dbk.c b;
      private final List<daz> c = new ArrayList<>();

      protected b(aku<dbm> $$0, dbk.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dbd<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dbm a(crs $$0) {
         return dbm.a(dbk.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<daz> apply(dbd<?> var1);
   }

   public static record d(dcj a, dbi<?> b) {
   }
}
