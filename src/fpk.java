import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fpk {
   public static hdk.b a(ald $$0) {
      return new hde.a($$0, List.of());
   }

   public static hdk.b a(ald $$0, fon... $$1) {
      return new hde.a($$0, List.of($$1));
   }

   public static fon a(int $$0) {
      return new foi($$0);
   }

   public static hdk.b a(hdk.b... $$0) {
      return new hdh.a(List.of($$0));
   }

   public static hdk.b a(ald $$0, hfw.a $$1) {
      return new hdr.a($$0, $$1);
   }

   public static hdp.a a(hdk.b $$0, float $$1) {
      return new hdp.a($$1, $$0);
   }

   public static hdk.b a(hes $$0, hdk.b $$1, hdp.a... $$2) {
      return new hdp.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hdk.b a(hes $$0, float $$1, hdk.b $$2, hdp.a... $$3) {
      return new hdp.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hdk.b a(hes $$0, hdk.b $$1, List<hdp.a> $$2) {
      return new hdp.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hdk.b a(hes $$0, List<hdp.a> $$1) {
      return new hdp.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hdk.b a(hes $$0, float $$1, List<hdp.a> $$2) {
      return new hdp.b($$0, $$1, $$2, Optional.empty());
   }

   public static hdk.b a(hdw $$0, hdk.b $$1, hdk.b $$2) {
      return new hdi.a($$0, $$1, $$2);
   }

   public static <T> hdq.a<T> a(T $$0, hdk.b $$1) {
      return new hdq.a<>(List.of($$0), $$1);
   }

   public static <T> hdq.a<T> a(List<T> $$0, hdk.b $$1) {
      return new hdq.a<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hdk.b a(hfi<T> $$0, hdk.b $$1, hdq.a<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hdk.b a(hfi<T> $$0, hdk.b $$1, List<hdq.a<T>> $$2) {
      return new hdq.b(new hdq.c<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hdk.b a(hfi<T> $$0, hdq.a<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hdk.b a(hfi<T> $$0, List<hdq.a<T>> $$1) {
      return new hdq.b(new hdq.c<>($$0, $$1), Optional.empty());
   }

   public static hdw a() {
      return new hef();
   }

   public static hdw a(kw<?> $$0) {
      return new heb($$0, false);
   }

   public static hdk.b a(hdk.b $$0, hdk.b $$1) {
      return a(new hfa(), $$1, a(dhp.i, $$0));
   }

   public static <T extends Comparable<T>> hdk.b a(dzp<T> $$0, hdk.b $$1, Map<T, hdk.b> $$2) {
      List<hdq.a<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hdq.a<>(List.of($$2x), (hdk.b)$$1x.getValue());
      }).toList();
      return a(new hfe($$0.f()), $$1, $$3);
   }

   public static hdk.b b(hdk.b $$0, hdk.b $$1) {
      return a(hff.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
