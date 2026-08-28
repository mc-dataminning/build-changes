import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fnm {
   public static hbh.b a(aku $$0) {
      return new hbc.a($$0, List.of());
   }

   public static hbh.b a(aku $$0, fmr... $$1) {
      return new hbc.a($$0, List.of($$1));
   }

   public static fmr a(int $$0) {
      return new fmm($$0);
   }

   public static hbh.b a(hbh.b... $$0) {
      return new hbf.a(List.of($$0));
   }

   public static hbh.b a(aku $$0, hdq.a $$1) {
      return new hbo.a($$0, $$1);
   }

   public static hbm.a a(hbh.b $$0, float $$1) {
      return new hbm.a($$1, $$0);
   }

   public static hbh.b a(hco $$0, hbh.b $$1, hbm.a... $$2) {
      return new hbm.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hbh.b a(hco $$0, float $$1, hbh.b $$2, hbm.a... $$3) {
      return new hbm.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hbh.b a(hco $$0, hbh.b $$1, List<hbm.a> $$2) {
      return new hbm.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hbh.b a(hco $$0, List<hbm.a> $$1) {
      return new hbm.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hbh.b a(hco $$0, float $$1, List<hbm.a> $$2) {
      return new hbm.b($$0, $$1, $$2, Optional.empty());
   }

   public static hbh.b a(hbt $$0, hbh.b $$1, hbh.b $$2) {
      return new hbg.a($$0, $$1, $$2);
   }

   public static <T> hbn.a<T> a(T $$0, hbh.b $$1) {
      return new hbn.a<>(List.of($$0), $$1);
   }

   public static <T> hbn.a<T> a(List<T> $$0, hbh.b $$1) {
      return new hbn.a<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hbh.b a(hdc<T> $$0, hbh.b $$1, hbn.a<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hbh.b a(hdc<T> $$0, hbh.b $$1, List<hbn.a<T>> $$2) {
      return new hbn.b(new hbn.c<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hbh.b a(hdc<T> $$0, hbn.a<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hbh.b a(hdc<T> $$0, List<hbn.a<T>> $$1) {
      return new hbn.b(new hbn.c<>($$0, $$1), Optional.empty());
   }

   public static hbt a() {
      return new hcc();
   }

   public static hbt a(ku<?> $$0) {
      return new hby($$0, false);
   }

   public static <T extends Comparable<T>> hbh.b a(dxx<T> $$0, hbh.b $$1, Map<T, hbh.b> $$2) {
      List<hbn.a<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hbn.a<>(List.of($$2x), (hbh.b)$$1x.getValue());
      }).toList();
      return a(new hcy($$0.f()), $$1, $$3);
   }

   public static hbh.b a(hbh.b $$0, hbh.b $$1) {
      return a(hcz.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
