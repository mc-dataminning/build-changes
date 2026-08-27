import java.util.Map;
import java.util.Map.Entry;

public class fny {
   private Map<dey, gah> a = Map.of();
   private final gan b;

   public fny(gan $$0) {
      this.b = $$0;
   }

   public fyg a(dey $$0) {
      return this.b($$0).e();
   }

   public gah b(dey $$0) {
      gah $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gan a() {
      return this.b;
   }

   public void a(Map<dey, gah> $$0) {
      this.a = $$0;
   }

   public static gao c(dey $$0) {
      return a(jc.f.b($$0.b()), $$0);
   }

   public static gao a(aep $$0, dey $$1) {
      return new gao($$0, b($$1.C()));
   }

   public static String b(Map<dgb<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dgb<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dgb<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dgb<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
