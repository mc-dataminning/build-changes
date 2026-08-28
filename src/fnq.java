import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fnq {
   public static hbm.b a(akv $$0) {
      return new hbg.a($$0, List.of());
   }

   public static hbm.b a(akv $$0, fmu... $$1) {
      return new hbg.a($$0, List.of($$1));
   }

   public static fmu a(int $$0) {
      return new fmp($$0);
   }

   public static hbm.b a(hbm.b... $$0) {
      return new hbj.a(List.of($$0));
   }

   public static hbm.b a(akv $$0, hdx.a $$1) {
      return new hbt.a($$0, $$1);
   }

   public static hbr.a a(hbm.b $$0, float $$1) {
      return new hbr.a($$1, $$0);
   }

   public static hbm.b a(hcu $$0, hbm.b $$1, hbr.a... $$2) {
      return new hbr.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hbm.b a(hcu $$0, float $$1, hbm.b $$2, hbr.a... $$3) {
      return new hbr.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hbm.b a(hcu $$0, hbm.b $$1, List<hbr.a> $$2) {
      return new hbr.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hbm.b a(hcu $$0, List<hbr.a> $$1) {
      return new hbr.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hbm.b a(hcu $$0, float $$1, List<hbr.a> $$2) {
      return new hbr.b($$0, $$1, $$2, Optional.empty());
   }

   public static hbm.b a(hby $$0, hbm.b $$1, hbm.b $$2) {
      return new hbk.a($$0, $$1, $$2);
   }

   public static <T> hbs.a<T> a(T $$0, hbm.b $$1) {
      return new hbs.a<>(List.of($$0), $$1);
   }

   public static <T> hbs.a<T> a(List<T> $$0, hbm.b $$1) {
      return new hbs.a<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hbm.b a(hdj<T> $$0, hbm.b $$1, hbs.a<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hbm.b a(hdj<T> $$0, hbm.b $$1, List<hbs.a<T>> $$2) {
      return new hbs.b(new hbs.c<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hbm.b a(hdj<T> $$0, hbs.a<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hbm.b a(hdj<T> $$0, List<hbs.a<T>> $$1) {
      return new hbs.b(new hbs.c<>($$0, $$1), Optional.empty());
   }

   public static hby a() {
      return new hch();
   }

   public static hby a(ku<?> $$0) {
      return new hcd($$0, false);
   }

   public static hbm.b a(hbm.b $$0, hbm.b $$1) {
      return a(new hdb(), $$1, a(dgj.i, $$0));
   }

   public static <T extends Comparable<T>> hbm.b a(dya<T> $$0, hbm.b $$1, Map<T, hbm.b> $$2) {
      List<hbs.a<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hbs.a<>(List.of($$2x), (hbm.b)$$1x.getValue());
      }).toList();
      return a(new hdf($$0.f()), $$1, $$3);
   }

   public static hbm.b b(hbm.b $$0, hbm.b $$1) {
      return a(hdg.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
