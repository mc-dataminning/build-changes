import java.util.Map;
import java.util.Map.Entry;

public class fty {
   private Map<djg, ggl> a = Map.of();
   private final ggr b;

   public fty(ggr $$0) {
      this.b = $$0;
   }

   public gel a(djg $$0) {
      return this.b($$0).e();
   }

   public ggl b(djg $$0) {
      ggl $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public ggr a() {
      return this.b;
   }

   public void a(Map<djg, ggl> $$0) {
      this.a = $$0;
   }

   public static ggs c(djg $$0) {
      return a(kd.e.b($$0.b()), $$0);
   }

   public static ggs a(ahg $$0, djg $$1) {
      return new ggs($$0, b($$1.C()));
   }

   public static String b(Map<dkj<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dkj<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dkj<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dkj<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
