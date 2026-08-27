import java.util.Map;
import java.util.Map.Entry;

public class foz {
   private Map<dfl, gbh> a = Map.of();
   private final gbn b;

   public foz(gbn $$0) {
      this.b = $$0;
   }

   public fzg a(dfl $$0) {
      return this.b($$0).e();
   }

   public gbh b(dfl $$0) {
      gbh $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gbn a() {
      return this.b;
   }

   public void a(Map<dfl, gbh> $$0) {
      this.a = $$0;
   }

   public static gbo c(dfl $$0) {
      return a(jd.f.b($$0.b()), $$0);
   }

   public static gbo a(aey $$0, dfl $$1) {
      return new gbo($$0, b($$1.C()));
   }

   public static String b(Map<dgo<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dgo<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dgo<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dgo<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
