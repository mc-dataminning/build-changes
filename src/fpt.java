import java.util.Map;
import java.util.Map.Entry;

public class fpt {
   private Map<dgb, gcb> a = Map.of();
   private final gch b;

   public fpt(gch $$0) {
      this.b = $$0;
   }

   public gaa a(dgb $$0) {
      return this.b($$0).e();
   }

   public gcb b(dgb $$0) {
      gcb $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gch a() {
      return this.b;
   }

   public void a(Map<dgb, gcb> $$0) {
      this.a = $$0;
   }

   public static gci c(dgb $$0) {
      return a(jy.f.b($$0.b()), $$0);
   }

   public static gci a(afw $$0, dgb $$1) {
      return new gci($$0, b($$1.C()));
   }

   public static String b(Map<dhe<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dhe<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dhe<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dhe<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
