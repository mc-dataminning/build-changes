import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fqz {
   public static hff.b a(alg $$0) {
      return new hez.a($$0, List.of());
   }

   public static hff.b a(alg $$0, fqc... $$1) {
      return new hez.a($$0, List.of($$1));
   }

   public static fqc a(int $$0) {
      return new fpx($$0);
   }

   public static hff.b a(hff.b... $$0) {
      return new hfc.a(List.of($$0));
   }

   public static hff.b a(alg $$0, hht.a $$1) {
      return new hfm.a($$0, $$1);
   }

   public static hfk.a a(hff.b $$0, float $$1) {
      return new hfk.a($$1, $$0);
   }

   public static hff.b a(hgp $$0, hff.b $$1, hfk.a... $$2) {
      return new hfk.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hff.b a(hgp $$0, float $$1, hff.b $$2, hfk.a... $$3) {
      return new hfk.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hff.b a(hgp $$0, hff.b $$1, List<hfk.a> $$2) {
      return new hfk.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hff.b a(hgp $$0, List<hfk.a> $$1) {
      return new hfk.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hff.b a(hgp $$0, float $$1, List<hfk.a> $$2) {
      return new hfk.b($$0, $$1, $$2, Optional.empty());
   }

   public static hff.b a(hfs $$0, hff.b $$1, hff.b $$2) {
      return new hfd.a($$0, $$1, $$2);
   }

   public static <T> hfl.b<T> a(T $$0, hff.b $$1) {
      return new hfl.b<>(List.of($$0), $$1);
   }

   public static <T> hfl.b<T> a(List<T> $$0, hff.b $$1) {
      return new hfl.b<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hff.b a(hhf<T> $$0, hff.b $$1, hfl.b<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hff.b a(hhf<T> $$0, hff.b $$1, List<hfl.b<T>> $$2) {
      return new hfl.c(new hfl.d<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hff.b a(hhf<T> $$0, hfl.b<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hff.b a(hhf<T> $$0, List<hfl.b<T>> $$1) {
      return new hfl.c(new hfl.d<>($$0, $$1), Optional.empty());
   }

   public static hfs a() {
      return new hgb();
   }

   public static hfs a(ki<?> $$0) {
      return new hfx($$0, false);
   }

   public static hff.b a(hff.b $$0, hff.b $$1) {
      return a(new hgx(), $$1, a(div.i, $$0));
   }

   public static <T extends Comparable<T>> hff.b a(ebc<T> $$0, hff.b $$1, Map<T, hff.b> $$2) {
      List<hfl.b<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hfl.b<>(List.of($$2x), (hff.b)$$1x.getValue());
      }).toList();
      return a(new hhb($$0.f()), $$1, $$3);
   }

   public static hff.b b(hff.b $$0, hff.b $$1) {
      return a(hhc.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
