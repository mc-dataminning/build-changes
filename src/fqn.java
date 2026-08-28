import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fqn {
   public static hep.b a(ale $$0) {
      return new hej.a($$0, List.of());
   }

   public static hep.b a(ale $$0, fpq... $$1) {
      return new hej.a($$0, List.of($$1));
   }

   public static fpq a(int $$0) {
      return new fpl($$0);
   }

   public static hep.b a(hep.b... $$0) {
      return new hem.a(List.of($$0));
   }

   public static hep.b a(ale $$0, hhd.a $$1) {
      return new hew.a($$0, $$1);
   }

   public static heu.a a(hep.b $$0, float $$1) {
      return new heu.a($$1, $$0);
   }

   public static hep.b a(hfz $$0, hep.b $$1, heu.a... $$2) {
      return new heu.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hep.b a(hfz $$0, float $$1, hep.b $$2, heu.a... $$3) {
      return new heu.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hep.b a(hfz $$0, hep.b $$1, List<heu.a> $$2) {
      return new heu.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hep.b a(hfz $$0, List<heu.a> $$1) {
      return new heu.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hep.b a(hfz $$0, float $$1, List<heu.a> $$2) {
      return new heu.b($$0, $$1, $$2, Optional.empty());
   }

   public static hep.b a(hfc $$0, hep.b $$1, hep.b $$2) {
      return new hen.a($$0, $$1, $$2);
   }

   public static <T> hev.b<T> a(T $$0, hep.b $$1) {
      return new hev.b<>(List.of($$0), $$1);
   }

   public static <T> hev.b<T> a(List<T> $$0, hep.b $$1) {
      return new hev.b<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hep.b a(hgp<T> $$0, hep.b $$1, hev.b<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hep.b a(hgp<T> $$0, hep.b $$1, List<hev.b<T>> $$2) {
      return new hev.c(new hev.d<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hep.b a(hgp<T> $$0, hev.b<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hep.b a(hgp<T> $$0, List<hev.b<T>> $$1) {
      return new hev.c(new hev.d<>($$0, $$1), Optional.empty());
   }

   public static hfc a() {
      return new hfl();
   }

   public static hfc a(ki<?> $$0) {
      return new hfh($$0, false);
   }

   public static hep.b a(hep.b $$0, hep.b $$1) {
      return a(new hgh(), $$1, a(dip.i, $$0));
   }

   public static <T extends Comparable<T>> hep.b a(ear<T> $$0, hep.b $$1, Map<T, hep.b> $$2) {
      List<hev.b<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hev.b<>(List.of($$2x), (hep.b)$$1x.getValue());
      }).toList();
      return a(new hgl($$0.f()), $$1, $$3);
   }

   public static hep.b b(hep.b $$0, hep.b $$1) {
      return a(hgm.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
