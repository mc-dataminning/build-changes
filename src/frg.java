import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class frg {
   public static hfn.b a(alg $$0) {
      return new hfh.a($$0, List.of());
   }

   public static hfn.b a(alg $$0, fqj... $$1) {
      return new hfh.a($$0, List.of($$1));
   }

   public static fqj a(int $$0) {
      return new fqe($$0);
   }

   public static hfn.b a(hfn.b... $$0) {
      return new hfk.a(List.of($$0));
   }

   public static hfn.b a(alg $$0, hib.a $$1) {
      return new hfu.a($$0, $$1);
   }

   public static hfs.a a(hfn.b $$0, float $$1) {
      return new hfs.a($$1, $$0);
   }

   public static hfn.b a(hgx $$0, hfn.b $$1, hfs.a... $$2) {
      return new hfs.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hfn.b a(hgx $$0, float $$1, hfn.b $$2, hfs.a... $$3) {
      return new hfs.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hfn.b a(hgx $$0, hfn.b $$1, List<hfs.a> $$2) {
      return new hfs.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hfn.b a(hgx $$0, List<hfs.a> $$1) {
      return new hfs.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hfn.b a(hgx $$0, float $$1, List<hfs.a> $$2) {
      return new hfs.b($$0, $$1, $$2, Optional.empty());
   }

   public static hfn.b a(hga $$0, hfn.b $$1, hfn.b $$2) {
      return new hfl.a($$0, $$1, $$2);
   }

   public static <T> hft.b<T> a(T $$0, hfn.b $$1) {
      return new hft.b<>(List.of($$0), $$1);
   }

   public static <T> hft.b<T> a(List<T> $$0, hfn.b $$1) {
      return new hft.b<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hfn.b a(hhn<T> $$0, hfn.b $$1, hft.b<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hfn.b a(hhn<T> $$0, hfn.b $$1, List<hft.b<T>> $$2) {
      return new hft.c(new hft.d<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hfn.b a(hhn<T> $$0, hft.b<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hfn.b a(hhn<T> $$0, List<hft.b<T>> $$1) {
      return new hft.c(new hft.d<>($$0, $$1), Optional.empty());
   }

   public static hga a() {
      return new hgj();
   }

   public static hga a(ki<?> $$0) {
      return new hgf($$0, false);
   }

   public static hfn.b a(hfn.b $$0, hfn.b $$1) {
      return a(new hhf(), $$1, a(dja.i, $$0));
   }

   public static <T extends Comparable<T>> hfn.b a(ebk<T> $$0, hfn.b $$1, Map<T, hfn.b> $$2) {
      List<hft.b<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hft.b<>(List.of($$2x), (hfn.b)$$1x.getValue());
      }).toList();
      return a(new hhj($$0.f()), $$1, $$3);
   }

   public static hfn.b b(hfn.b $$0, hfn.b $$1) {
      return a(hhk.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
