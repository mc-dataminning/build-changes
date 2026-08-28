import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class frs {
   public static hfz.b a(alg $$0) {
      return new hft.a($$0, List.of());
   }

   public static hfz.b a(alg $$0, fqy... $$1) {
      return new hft.a($$0, List.of($$1));
   }

   public static fqy a(int $$0) {
      return new fqt($$0);
   }

   public static hfz.b a(hfz.b... $$0) {
      return new hfw.a(List.of($$0));
   }

   public static hfz.b a(alg $$0, hio.a $$1) {
      return new hgh.a($$0, $$1);
   }

   public static hgf.a a(hfz.b $$0, float $$1) {
      return new hgf.a($$1, $$0);
   }

   public static hfz.b a(hhk $$0, hfz.b $$1, hgf.a... $$2) {
      return new hgf.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hfz.b a(hhk $$0, float $$1, hfz.b $$2, hgf.a... $$3) {
      return new hgf.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hfz.b a(hhk $$0, hfz.b $$1, List<hgf.a> $$2) {
      return new hgf.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hfz.b a(hhk $$0, List<hgf.a> $$1) {
      return new hgf.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hfz.b a(hhk $$0, float $$1, List<hgf.a> $$2) {
      return new hgf.b($$0, $$1, $$2, Optional.empty());
   }

   public static hfz.b a(hgn $$0, hfz.b $$1, hfz.b $$2) {
      return new hfx.a($$0, $$1, $$2);
   }

   public static <T> hgg.b<T> a(T $$0, hfz.b $$1) {
      return new hgg.b<>(List.of($$0), $$1);
   }

   public static <T> hgg.b<T> a(List<T> $$0, hfz.b $$1) {
      return new hgg.b<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hfz.b a(hia<T> $$0, hfz.b $$1, hgg.b<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hfz.b a(hia<T> $$0, hfz.b $$1, List<hgg.b<T>> $$2) {
      return new hgg.c(new hgg.d<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hfz.b a(hia<T> $$0, hgg.b<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hfz.b a(hia<T> $$0, List<hgg.b<T>> $$1) {
      return new hgg.c(new hgg.d<>($$0, $$1), Optional.empty());
   }

   public static hgn a() {
      return new hgw();
   }

   public static hgn a(kj<?> $$0) {
      return new hgs($$0, false);
   }

   public static hfz.b a(hfz.b $$0, hfz.b $$1) {
      return a(new hhs(), $$1, a(djh.i, $$0));
   }

   public static <T extends Comparable<T>> hfz.b a(ebr<T> $$0, hfz.b $$1, Map<T, hfz.b> $$2) {
      List<hgg.b<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hgg.b<>(List.of($$2x), (hfz.b)$$1x.getValue());
      }).toList();
      return a(new hhw($$0.f()), $$1, $$3);
   }

   public static hfz.b b(hfz.b $$0, hfz.b $$1) {
      return a(hhx.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
