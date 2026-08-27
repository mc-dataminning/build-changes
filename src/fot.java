import java.util.Map;
import java.util.Map.Entry;

public class fot {
   private Map<dfd, gbb> a = Map.of();
   private final gbh b;

   public fot(gbh $$0) {
      this.b = $$0;
   }

   public fza a(dfd $$0) {
      return this.b($$0).e();
   }

   public gbb b(dfd $$0) {
      gbb $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gbh a() {
      return this.b;
   }

   public void a(Map<dfd, gbb> $$0) {
      this.a = $$0;
   }

   public static gbi c(dfd $$0) {
      return a(jb.f.b($$0.b()), $$0);
   }

   public static gbi a(aez $$0, dfd $$1) {
      return new gbi($$0, b($$1.C()));
   }

   public static String b(Map<dgg<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dgg<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dgg<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dgg<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
