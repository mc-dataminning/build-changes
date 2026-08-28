import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class frx {
   public static hgf.b a(alg $$0) {
      return new hfz.a($$0, List.of());
   }

   public static hgf.b a(alg $$0, frd... $$1) {
      return new hfz.a($$0, List.of($$1));
   }

   public static frd a(int $$0) {
      return new fqy($$0);
   }

   public static hgf.b a(hgf.b... $$0) {
      return new hgc.a(List.of($$0));
   }

   public static hgf.b a(alg $$0, hiu.a $$1) {
      return new hgn.a($$0, $$1);
   }

   public static hgl.a a(hgf.b $$0, float $$1) {
      return new hgl.a($$1, $$0);
   }

   public static hgf.b a(hhq $$0, hgf.b $$1, hgl.a... $$2) {
      return new hgl.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hgf.b a(hhq $$0, float $$1, hgf.b $$2, hgl.a... $$3) {
      return new hgl.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hgf.b a(hhq $$0, hgf.b $$1, List<hgl.a> $$2) {
      return new hgl.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hgf.b a(hhq $$0, List<hgl.a> $$1) {
      return new hgl.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hgf.b a(hhq $$0, float $$1, List<hgl.a> $$2) {
      return new hgl.b($$0, $$1, $$2, Optional.empty());
   }

   public static hgf.b a(hgt $$0, hgf.b $$1, hgf.b $$2) {
      return new hgd.a($$0, $$1, $$2);
   }

   public static <T> hgm.b<T> a(T $$0, hgf.b $$1) {
      return new hgm.b<>(List.of($$0), $$1);
   }

   public static <T> hgm.b<T> a(List<T> $$0, hgf.b $$1) {
      return new hgm.b<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hgf.b a(hig<T> $$0, hgf.b $$1, hgm.b<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hgf.b a(hig<T> $$0, hgf.b $$1, List<hgm.b<T>> $$2) {
      return new hgm.c(new hgm.d<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hgf.b a(hig<T> $$0, hgm.b<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hgf.b a(hig<T> $$0, List<hgm.b<T>> $$1) {
      return new hgm.c(new hgm.d<>($$0, $$1), Optional.empty());
   }

   public static hgt a() {
      return new hhc();
   }

   public static hgt a(kj<?> $$0) {
      return new hgy($$0, false);
   }

   public static hgf.b a(hgf.b $$0, hgf.b $$1) {
      return a(new hhy(), $$1, a(djm.i, $$0));
   }

   public static <T extends Comparable<T>> hgf.b a(ebw<T> $$0, hgf.b $$1, Map<T, hgf.b> $$2) {
      List<hgm.b<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hgm.b<>(List.of($$2x), (hgf.b)$$1x.getValue());
      }).toList();
      return a(new hic($$0.f()), $$1, $$3);
   }

   public static hgf.b b(hgf.b $$0, hgf.b $$1) {
      return a(hid.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
