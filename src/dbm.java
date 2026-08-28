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

public class dbm extends auu<dbn> implements dbg {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aku<dbo>, dbm.c> b = Map.of(
      dbo.d,
      $$0 -> $$0 instanceof dca $$1 ? $$1.k() : Optional.empty(),
      dbo.b,
      $$0 -> $$0 instanceof dca $$1 ? $$1.f() : Optional.empty(),
      dbo.c,
      $$0 -> $$0 instanceof dca $$1 ? $$1.c() : Optional.empty(),
      dbo.e,
      b(dbq.b),
      dbo.f,
      b(dbq.c),
      dbo.g,
      b(dbq.d),
      dbo.h,
      b(dbq.e)
   );
   private static final ako c = ako.a(mc.bk);
   private final jt.a d;
   private dbn e = dbn.a;
   private Map<aku<dbo>, dbo> f = Map.of();
   private dbs.b<dcf> g = dbs.b.a();
   private List<dbm.d> h = List.of();
   private Map<aku<dbf<?>>, List<dbm.d>> i = Map.of();

   public dbm(jt.a $$0) {
      this.d = $$0;
   }

   protected dbn a(aup $$0, bou $$1) {
      SortedMap<akv, dbf<?>> $$2 = new TreeMap<>();
      aut.a($$0, c, this.d.a(JsonOps.INSTANCE), dbf.a, $$2);
      List<dbk<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         aku<dbf<?>> $$3x = aku.a(mc.bk, $$1x);
         dbk<?> $$4 = new dbk($$3x, $$2x);
         $$3.add($$4);
      });
      return dbn.a($$3);
   }

   protected void a(dbn $$0, aup $$1, bou $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cru $$0) {
      List<dbs.a<dcf>> $$1 = new ArrayList<>();
      List<dbm.b> $$2 = b.entrySet().stream().map($$0x -> new dbm.b((aku<dbo>)$$0x.getKey(), (dbm.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         dbf<?> $$4 = $$3.b();
         if (!$$4.ap_() && $$4.ao_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dcf $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dbs.a<>($$5.k(), new dbs<>($$5.c(), Optional.of((dbk<dcf>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dbs.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<dbb> a(cru $$0, List<dbb> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cru $$0, dbb $$1) {
      return $$1.a().allMatch($$1x -> ((cwm)$$1x.a()).a($$0));
   }

   public <I extends dbl, T extends dbf<I>> Optional<dbk<T>> a(dbq<T> $$0, I $$1, dgj $$2, @Nullable aku<dbf<?>> $$3) {
      dbk<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dbl, T extends dbf<I>> Optional<dbk<T>> a(dbq<T> $$0, I $$1, dgj $$2, @Nullable dbk<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dbl, T extends dbf<I>> Optional<dbk<T>> a(dbq<T> $$0, I $$1, dgj $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dbk<?>> b(aku<dbf<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends dbf<?>> dbk<T> a(dbq<T> $$0, aku<dbf<?>> $$1) {
      dbk<?> $$2 = this.e.a($$1);
      return (dbk<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<aku<dbo>, dbo> b() {
      return this.f;
   }

   public dbs.b<dcf> d() {
      return this.g;
   }

   @Override
   public dbo a(aku<dbo> $$0) {
      return this.f.getOrDefault($$0, dbo.j);
   }

   @Override
   public dbs.b<dcf> a() {
      return this.g;
   }

   public Collection<dbk<?>> e() {
      return this.e.a();
   }

   @Nullable
   public dbm.d a(dcm $$0) {
      return this.h.get($$0.a());
   }

   public void a(aku<dbf<?>> $$0, Consumer<dcl> $$1) {
      List<dbm.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dbk<?> a(aku<dbf<?>> $$0, JsonObject $$1, jt.a $$2) {
      dbf<?> $$3 = (dbf<?>)dbf.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dbk<>($$0, $$3);
   }

   public static <I extends dbl, T extends dbf<I>> dbm.a<I, T> a(final dbq<T> $$0) {
      return new dbm.a<I, T>() {
         @Nullable
         private aku<dbf<?>> b;

         @Override
         public Optional<dbk<T>> a(I $$0x, ard $$1) {
            dbm $$2 = $$1.t();
            Optional<dbk<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dbk<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dbm.d> a(Iterable<dbk<?>> $$0, cru $$1) {
      List<dbm.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dbk<?> $$4 : $$0) {
         dbf<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dbb>> $$8;
         if ($$5.ap_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ao_().b());
         }

         for (dck $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dcm $$12 = new dcm($$11);
               dcl $$13 = new dcl($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dbm.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dbm.c b(dbq<? extends dbx> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dbx $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dbl, T extends dbf<I>> {
      Optional<dbk<T>> a(I var1, ard var2);
   }

   public static class b implements Consumer<dbf<?>> {
      final aku<dbo> a;
      private final dbm.c b;
      private final List<dbb> c = new ArrayList<>();

      protected b(aku<dbo> $$0, dbm.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dbf<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dbo a(cru $$0) {
         return dbo.a(dbm.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<dbb> apply(dbf<?> var1);
   }

   public static record d(dcl a, dbk<?> b) {
   }
}
