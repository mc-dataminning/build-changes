import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fno {
   public static hbk.b a(akv $$0) {
      return new hbe.a($$0, List.of());
   }

   public static hbk.b a(akv $$0, fms... $$1) {
      return new hbe.a($$0, List.of($$1));
   }

   public static fms a(int $$0) {
      return new fmn($$0);
   }

   public static hbk.b a(hbk.b... $$0) {
      return new hbh.a(List.of($$0));
   }

   public static hbk.b a(akv $$0, hdv.a $$1) {
      return new hbr.a($$0, $$1);
   }

   public static hbp.a a(hbk.b $$0, float $$1) {
      return new hbp.a($$1, $$0);
   }

   public static hbk.b a(hcs $$0, hbk.b $$1, hbp.a... $$2) {
      return new hbp.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hbk.b a(hcs $$0, float $$1, hbk.b $$2, hbp.a... $$3) {
      return new hbp.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hbk.b a(hcs $$0, hbk.b $$1, List<hbp.a> $$2) {
      return new hbp.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hbk.b a(hcs $$0, List<hbp.a> $$1) {
      return new hbp.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hbk.b a(hcs $$0, float $$1, List<hbp.a> $$2) {
      return new hbp.b($$0, $$1, $$2, Optional.empty());
   }

   public static hbk.b a(hbw $$0, hbk.b $$1, hbk.b $$2) {
      return new hbi.a($$0, $$1, $$2);
   }

   public static <T> hbq.a<T> a(T $$0, hbk.b $$1) {
      return new hbq.a<>(List.of($$0), $$1);
   }

   public static <T> hbq.a<T> a(List<T> $$0, hbk.b $$1) {
      return new hbq.a<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hbk.b a(hdh<T> $$0, hbk.b $$1, hbq.a<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hbk.b a(hdh<T> $$0, hbk.b $$1, List<hbq.a<T>> $$2) {
      return new hbq.b(new hbq.c<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hbk.b a(hdh<T> $$0, hbq.a<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hbk.b a(hdh<T> $$0, List<hbq.a<T>> $$1) {
      return new hbq.b(new hbq.c<>($$0, $$1), Optional.empty());
   }

   public static hbw a() {
      return new hcf();
   }

   public static hbw a(ku<?> $$0) {
      return new hcb($$0, false);
   }

   public static hbk.b a(hbk.b $$0, hbk.b $$1) {
      return a(new hcz(), $$1, a(dgh.i, $$0));
   }

   public static <T extends Comparable<T>> hbk.b a(dxy<T> $$0, hbk.b $$1, Map<T, hbk.b> $$2) {
      List<hbq.a<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hbq.a<>(List.of($$2x), (hbk.b)$$1x.getValue());
      }).toList();
      return a(new hdd($$0.f()), $$1, $$3);
   }

   public static hbk.b b(hbk.b $$0, hbk.b $$1) {
      return a(hde.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
