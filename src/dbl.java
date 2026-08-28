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

public class dbl extends auu<dbm> implements dbf {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aku<dbn>, dbl.c> b = Map.of(
      dbn.d,
      $$0 -> $$0 instanceof dbz $$1 ? $$1.k() : Optional.empty(),
      dbn.b,
      $$0 -> $$0 instanceof dbz $$1 ? $$1.f() : Optional.empty(),
      dbn.c,
      $$0 -> $$0 instanceof dbz $$1 ? $$1.c() : Optional.empty(),
      dbn.e,
      b(dbp.b),
      dbn.f,
      b(dbp.c),
      dbn.g,
      b(dbp.d),
      dbn.h,
      b(dbp.e)
   );
   private static final ako c = ako.a(mc.bk);
   private final jt.a d;
   private dbm e = dbm.a;
   private Map<aku<dbn>, dbn> f = Map.of();
   private dbr.b<dce> g = dbr.b.a();
   private List<dbl.d> h = List.of();
   private Map<aku<dbe<?>>, List<dbl.d>> i = Map.of();

   public dbl(jt.a $$0) {
      this.d = $$0;
   }

   protected dbm a(aup $$0, bot $$1) {
      SortedMap<akv, dbe<?>> $$2 = new TreeMap<>();
      aut.a($$0, c, this.d.a(JsonOps.INSTANCE), dbe.a, $$2);
      List<dbj<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         aku<dbe<?>> $$3x = aku.a(mc.bk, $$1x);
         dbj<?> $$4 = new dbj($$3x, $$2x);
         $$3.add($$4);
      });
      return dbm.a($$3);
   }

   protected void a(dbm $$0, aup $$1, bot $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(crt $$0) {
      List<dbr.a<dce>> $$1 = new ArrayList<>();
      List<dbl.b> $$2 = b.entrySet().stream().map($$0x -> new dbl.b((aku<dbn>)$$0x.getKey(), (dbl.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         dbe<?> $$4 = $$3.b();
         if (!$$4.ap_() && $$4.ao_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dce $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dbr.a<>($$5.k(), new dbr<>($$5.c(), Optional.of((dbj<dce>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dbr.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<dba> a(crt $$0, List<dba> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(crt $$0, dba $$1) {
      return $$1.a().allMatch($$1x -> ((cwl)$$1x.a()).a($$0));
   }

   public <I extends dbk, T extends dbe<I>> Optional<dbj<T>> a(dbp<T> $$0, I $$1, dgi $$2, @Nullable aku<dbe<?>> $$3) {
      dbj<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dbk, T extends dbe<I>> Optional<dbj<T>> a(dbp<T> $$0, I $$1, dgi $$2, @Nullable dbj<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dbk, T extends dbe<I>> Optional<dbj<T>> a(dbp<T> $$0, I $$1, dgi $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dbj<?>> b(aku<dbe<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends dbe<?>> dbj<T> a(dbp<T> $$0, aku<dbe<?>> $$1) {
      dbj<?> $$2 = this.e.a($$1);
      return (dbj<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<aku<dbn>, dbn> b() {
      return this.f;
   }

   public dbr.b<dce> d() {
      return this.g;
   }

   @Override
   public dbn a(aku<dbn> $$0) {
      return this.f.getOrDefault($$0, dbn.j);
   }

   @Override
   public dbr.b<dce> a() {
      return this.g;
   }

   public Collection<dbj<?>> e() {
      return this.e.a();
   }

   @Nullable
   public dbl.d a(dcl $$0) {
      return this.h.get($$0.a());
   }

   public void a(aku<dbe<?>> $$0, Consumer<dck> $$1) {
      List<dbl.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dbj<?> a(aku<dbe<?>> $$0, JsonObject $$1, jt.a $$2) {
      dbe<?> $$3 = (dbe<?>)dbe.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dbj<>($$0, $$3);
   }

   public static <I extends dbk, T extends dbe<I>> dbl.a<I, T> a(final dbp<T> $$0) {
      return new dbl.a<I, T>() {
         @Nullable
         private aku<dbe<?>> b;

         @Override
         public Optional<dbj<T>> a(I $$0x, ard $$1) {
            dbl $$2 = $$1.t();
            Optional<dbj<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dbj<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dbl.d> a(Iterable<dbj<?>> $$0, crt $$1) {
      List<dbl.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dbj<?> $$4 : $$0) {
         dbe<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dba>> $$8;
         if ($$5.ap_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ao_().b());
         }

         for (dcj $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               dcl $$12 = new dcl($$11);
               dck $$13 = new dck($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dbl.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dbl.c b(dbp<? extends dbw> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof dbw $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dbk, T extends dbe<I>> {
      Optional<dbj<T>> a(I var1, ard var2);
   }

   public static class b implements Consumer<dbe<?>> {
      final aku<dbn> a;
      private final dbl.c b;
      private final List<dba> c = new ArrayList<>();

      protected b(aku<dbn> $$0, dbl.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dbe<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dbn a(crt $$0) {
         return dbn.a(dbl.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<dba> apply(dbe<?> var1);
   }

   public static record d(dck a, dbj<?> b) {
   }
}
