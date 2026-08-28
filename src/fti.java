import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fti {
   public static hhp.b a(ali $$0) {
      return new hhj.a($$0, List.of());
   }

   public static hhp.b a(ali $$0, fsn... $$1) {
      return new hhj.a($$0, List.of($$1));
   }

   public static fsn a(int $$0) {
      return new fsi($$0);
   }

   public static hhp.b a(hhp.b... $$0) {
      return new hhm.a(List.of($$0));
   }

   public static hhp.b a(ali $$0, hke.a $$1) {
      return new hhx.a($$0, $$1);
   }

   public static hhv.a a(hhp.b $$0, float $$1) {
      return new hhv.a($$1, $$0);
   }

   public static hhp.b a(hja $$0, hhp.b $$1, hhv.a... $$2) {
      return new hhv.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hhp.b a(hja $$0, float $$1, hhp.b $$2, hhv.a... $$3) {
      return new hhv.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hhp.b a(hja $$0, hhp.b $$1, List<hhv.a> $$2) {
      return new hhv.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hhp.b a(hja $$0, List<hhv.a> $$1) {
      return new hhv.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hhp.b a(hja $$0, float $$1, List<hhv.a> $$2) {
      return new hhv.b($$0, $$1, $$2, Optional.empty());
   }

   public static hhp.b a(hid $$0, hhp.b $$1, hhp.b $$2) {
      return new hhn.a($$0, $$1, $$2);
   }

   public static <T> hhw.b<T> a(T $$0, hhp.b $$1) {
      return new hhw.b<>(List.of($$0), $$1);
   }

   public static <T> hhw.b<T> a(List<T> $$0, hhp.b $$1) {
      return new hhw.b<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hhp.b a(hjq<T> $$0, hhp.b $$1, hhw.b<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hhp.b a(hjq<T> $$0, hhp.b $$1, List<hhw.b<T>> $$2) {
      return new hhw.c(new hhw.d<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hhp.b a(hjq<T> $$0, hhw.b<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hhp.b a(hjq<T> $$0, List<hhw.b<T>> $$1) {
      return new hhw.c(new hhw.d<>($$0, $$1), Optional.empty());
   }

   public static hid a() {
      return new him();
   }

   public static hid a(kj<?> $$0) {
      return new hii($$0, false);
   }

   public static hhp.b a(hhp.b $$0, hhp.b $$1) {
      return a(new hji(), $$1, a(djx.i, $$0));
   }

   public static <T extends Comparable<T>> hhp.b a(ech<T> $$0, hhp.b $$1, Map<T, hhp.b> $$2) {
      List<hhw.b<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hhw.b<>(List.of($$2x), (hhp.b)$$1x.getValue());
      }).toList();
      return a(new hjm($$0.f()), $$1, $$3);
   }

   public static hhp.b b(hhp.b $$0, hhp.b $$1) {
      return a(hjn.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
