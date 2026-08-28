import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fnp {
   public static hbl.b a(akv $$0) {
      return new hbf.a($$0, List.of());
   }

   public static hbl.b a(akv $$0, fmt... $$1) {
      return new hbf.a($$0, List.of($$1));
   }

   public static fmt a(int $$0) {
      return new fmo($$0);
   }

   public static hbl.b a(hbl.b... $$0) {
      return new hbi.a(List.of($$0));
   }

   public static hbl.b a(akv $$0, hdw.a $$1) {
      return new hbs.a($$0, $$1);
   }

   public static hbq.a a(hbl.b $$0, float $$1) {
      return new hbq.a($$1, $$0);
   }

   public static hbl.b a(hct $$0, hbl.b $$1, hbq.a... $$2) {
      return new hbq.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hbl.b a(hct $$0, float $$1, hbl.b $$2, hbq.a... $$3) {
      return new hbq.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hbl.b a(hct $$0, hbl.b $$1, List<hbq.a> $$2) {
      return new hbq.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hbl.b a(hct $$0, List<hbq.a> $$1) {
      return new hbq.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hbl.b a(hct $$0, float $$1, List<hbq.a> $$2) {
      return new hbq.b($$0, $$1, $$2, Optional.empty());
   }

   public static hbl.b a(hbx $$0, hbl.b $$1, hbl.b $$2) {
      return new hbj.a($$0, $$1, $$2);
   }

   public static <T> hbr.a<T> a(T $$0, hbl.b $$1) {
      return new hbr.a<>(List.of($$0), $$1);
   }

   public static <T> hbr.a<T> a(List<T> $$0, hbl.b $$1) {
      return new hbr.a<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hbl.b a(hdi<T> $$0, hbl.b $$1, hbr.a<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hbl.b a(hdi<T> $$0, hbl.b $$1, List<hbr.a<T>> $$2) {
      return new hbr.b(new hbr.c<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hbl.b a(hdi<T> $$0, hbr.a<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hbl.b a(hdi<T> $$0, List<hbr.a<T>> $$1) {
      return new hbr.b(new hbr.c<>($$0, $$1), Optional.empty());
   }

   public static hbx a() {
      return new hcg();
   }

   public static hbx a(ku<?> $$0) {
      return new hcc($$0, false);
   }

   public static hbl.b a(hbl.b $$0, hbl.b $$1) {
      return a(new hda(), $$1, a(dgi.i, $$0));
   }

   public static <T extends Comparable<T>> hbl.b a(dxz<T> $$0, hbl.b $$1, Map<T, hbl.b> $$2) {
      List<hbr.a<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hbr.a<>(List.of($$2x), (hbl.b)$$1x.getValue());
      }).toList();
      return a(new hde($$0.f()), $$1, $$3);
   }

   public static hbl.b b(hbl.b $$0, hbl.b $$1) {
      return a(hdf.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
