import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class ftk {
   public static hhr.b a(alk $$0) {
      return new hhl.a($$0, List.of());
   }

   public static hhr.b a(alk $$0, fsp... $$1) {
      return new hhl.a($$0, List.of($$1));
   }

   public static fsp a(int $$0) {
      return new fsk($$0);
   }

   public static hhr.b a(hhr.b... $$0) {
      return new hho.a(List.of($$0));
   }

   public static hhr.b a(alk $$0, hkg.a $$1) {
      return new hhz.a($$0, $$1);
   }

   public static hhx.a a(hhr.b $$0, float $$1) {
      return new hhx.a($$1, $$0);
   }

   public static hhr.b a(hjc $$0, hhr.b $$1, hhx.a... $$2) {
      return new hhx.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hhr.b a(hjc $$0, float $$1, hhr.b $$2, hhx.a... $$3) {
      return new hhx.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hhr.b a(hjc $$0, hhr.b $$1, List<hhx.a> $$2) {
      return new hhx.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hhr.b a(hjc $$0, List<hhx.a> $$1) {
      return new hhx.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hhr.b a(hjc $$0, float $$1, List<hhx.a> $$2) {
      return new hhx.b($$0, $$1, $$2, Optional.empty());
   }

   public static hhr.b a(hif $$0, hhr.b $$1, hhr.b $$2) {
      return new hhp.a($$0, $$1, $$2);
   }

   public static <T> hhy.b<T> a(T $$0, hhr.b $$1) {
      return new hhy.b<>(List.of($$0), $$1);
   }

   public static <T> hhy.b<T> a(List<T> $$0, hhr.b $$1) {
      return new hhy.b<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hhr.b a(hjs<T> $$0, hhr.b $$1, hhy.b<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hhr.b a(hjs<T> $$0, hhr.b $$1, List<hhy.b<T>> $$2) {
      return new hhy.c(new hhy.d<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hhr.b a(hjs<T> $$0, hhy.b<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hhr.b a(hjs<T> $$0, List<hhy.b<T>> $$1) {
      return new hhy.c(new hhy.d<>($$0, $$1), Optional.empty());
   }

   public static hif a() {
      return new hio();
   }

   public static hif a(kk<?> $$0) {
      return new hik($$0, false);
   }

   public static hhr.b a(hhr.b $$0, hhr.b $$1) {
      return a(new hjk(), $$1, a(djz.i, $$0));
   }

   public static <T extends Comparable<T>> hhr.b a(ecj<T> $$0, hhr.b $$1, Map<T, hhr.b> $$2) {
      List<hhy.b<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hhy.b<>(List.of($$2x), (hhr.b)$$1x.getValue());
      }).toList();
      return a(new hjo($$0.f()), $$1, $$3);
   }

   public static hhr.b b(hhr.b $$0, hhr.b $$1) {
      return a(hjp.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
