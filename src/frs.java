import java.util.Map;
import java.util.Map.Entry;

public class frs {
   private Map<dhn, gea> a = Map.of();
   private final geg b;

   public frs(geg $$0) {
      this.b = $$0;
   }

   public gbz a(dhn $$0) {
      return this.b($$0).e();
   }

   public gea b(dhn $$0) {
      gea $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public geg a() {
      return this.b;
   }

   public void a(Map<dhn, gea> $$0) {
      this.a = $$0;
   }

   public static geh c(dhn $$0) {
      return a(kc.f.b($$0.b()), $$0);
   }

   public static geh a(agm $$0, dhn $$1) {
      return new geh($$0, b($$1.C()));
   }

   public static String b(Map<diq<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<diq<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         diq<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(diq<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
