import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fno {
   public static hbi.b a(aku $$0) {
      return new hbd.a($$0, List.of());
   }

   public static hbi.b a(aku $$0, fmt... $$1) {
      return new hbd.a($$0, List.of($$1));
   }

   public static fmt a(int $$0) {
      return new fmo($$0);
   }

   public static hbi.b a(hbi.b... $$0) {
      return new hbg.a(List.of($$0));
   }

   public static hbi.b a(aku $$0, hdo.a $$1) {
      return new hbp.a($$0, $$1);
   }

   public static hbn.a a(hbi.b $$0, float $$1) {
      return new hbn.a($$1, $$0);
   }

   public static hbi.b a(hcp $$0, hbi.b $$1, hbn.a... $$2) {
      return new hbn.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hbi.b a(hcp $$0, float $$1, hbi.b $$2, hbn.a... $$3) {
      return new hbn.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hbi.b a(hcp $$0, hbi.b $$1, List<hbn.a> $$2) {
      return new hbn.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hbi.b a(hcp $$0, List<hbn.a> $$1) {
      return new hbn.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hbi.b a(hcp $$0, float $$1, List<hbn.a> $$2) {
      return new hbn.b($$0, $$1, $$2, Optional.empty());
   }

   public static hbi.b a(hbu $$0, hbi.b $$1, hbi.b $$2) {
      return new hbh.a($$0, $$1, $$2);
   }

   public static <T> hbo.a<T> a(T $$0, hbi.b $$1) {
      return new hbo.a<>(List.of($$0), $$1);
   }

   public static <T> hbo.a<T> a(List<T> $$0, hbi.b $$1) {
      return new hbo.a<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hbi.b a(hdb<T> $$0, hbi.b $$1, hbo.a<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hbi.b a(hdb<T> $$0, hbi.b $$1, List<hbo.a<T>> $$2) {
      return new hbo.b(new hbo.c<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hbi.b a(hdb<T> $$0, hbo.a<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hbi.b a(hdb<T> $$0, List<hbo.a<T>> $$1) {
      return new hbo.b(new hbo.c<>($$0, $$1), Optional.empty());
   }

   public static hbu a() {
      return new hcc();
   }

   public static hbu a(ku<?> $$0) {
      return new hby($$0);
   }

   public static <T extends Comparable<T>> hbi.b a(dxz<T> $$0, hbi.b $$1, Map<T, hbi.b> $$2) {
      List<hbo.a<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hbo.a<>(List.of($$2x), (hbi.b)$$1x.getValue());
      }).toList();
      return a(new hcy($$0.f()), $$1, $$3);
   }
}
