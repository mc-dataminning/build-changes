import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fsv {
   public static hhf.b a(alr $$0) {
      return new hgz.a($$0, List.of());
   }

   public static hhf.b a(alr $$0, fsa... $$1) {
      return new hgz.a($$0, List.of($$1));
   }

   public static fsa a(int $$0) {
      return new frv($$0);
   }

   public static hhf.b a(hhf.b... $$0) {
      return new hhc.a(List.of($$0));
   }

   public static hhf.b a(alr $$0, hju.a $$1) {
      return new hhn.a($$0, $$1);
   }

   public static hhl.a a(hhf.b $$0, float $$1) {
      return new hhl.a($$1, $$0);
   }

   public static hhf.b a(hiq $$0, hhf.b $$1, hhl.a... $$2) {
      return new hhl.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hhf.b a(hiq $$0, float $$1, hhf.b $$2, hhl.a... $$3) {
      return new hhl.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hhf.b a(hiq $$0, hhf.b $$1, List<hhl.a> $$2) {
      return new hhl.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hhf.b a(hiq $$0, List<hhl.a> $$1) {
      return new hhl.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hhf.b a(hiq $$0, float $$1, List<hhl.a> $$2) {
      return new hhl.b($$0, $$1, $$2, Optional.empty());
   }

   public static hhf.b a(hht $$0, hhf.b $$1, hhf.b $$2) {
      return new hhd.a($$0, $$1, $$2);
   }

   public static <T> hhm.b<T> a(T $$0, hhf.b $$1) {
      return new hhm.b<>(List.of($$0), $$1);
   }

   public static <T> hhm.b<T> a(List<T> $$0, hhf.b $$1) {
      return new hhm.b<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hhf.b a(hjg<T> $$0, hhf.b $$1, hhm.b<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hhf.b a(hjg<T> $$0, hhf.b $$1, List<hhm.b<T>> $$2) {
      return new hhm.c(new hhm.d<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hhf.b a(hjg<T> $$0, hhm.b<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hhf.b a(hjg<T> $$0, List<hhm.b<T>> $$1) {
      return new hhm.c(new hhm.d<>($$0, $$1), Optional.empty());
   }

   public static hht a() {
      return new hic();
   }

   public static hht a(kk<?> $$0) {
      return new hhy($$0, false);
   }

   public static hhf.b a(hhf.b $$0, hhf.b $$1) {
      return a(new hiy(), $$1, a(dkj.i, $$0));
   }

   public static <T extends Comparable<T>> hhf.b a(ect<T> $$0, hhf.b $$1, Map<T, hhf.b> $$2) {
      List<hhm.b<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hhm.b<>(List.of($$2x), (hhf.b)$$1x.getValue());
      }).toList();
      return a(new hjc($$0.f()), $$1, $$3);
   }

   public static hhf.b b(hhf.b $$0, hhf.b $$1) {
      return a(hjd.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
