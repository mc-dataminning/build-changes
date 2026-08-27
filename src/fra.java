import java.util.Map;
import java.util.Map.Entry;

public class fra {
   private Map<dgw, gdi> a = Map.of();
   private final gdo b;

   public fra(gdo $$0) {
      this.b = $$0;
   }

   public gbh a(dgw $$0) {
      return this.b($$0).e();
   }

   public gdi b(dgw $$0) {
      gdi $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gdo a() {
      return this.b;
   }

   public void a(Map<dgw, gdi> $$0) {
      this.a = $$0;
   }

   public static gdp c(dgw $$0) {
      return a(jy.f.b($$0.b()), $$0);
   }

   public static gdp a(agg $$0, dgw $$1) {
      return new gdp($$0, b($$1.C()));
   }

   public static String b(Map<dhz<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dhz<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dhz<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dhz<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
