import java.util.Map;
import java.util.Map.Entry;

public class fua {
   private Map<djh, ggn> a = Map.of();
   private final ggt b;

   public fua(ggt $$0) {
      this.b = $$0;
   }

   public gen a(djh $$0) {
      return this.b($$0).e();
   }

   public ggn b(djh $$0) {
      ggn $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public ggt a() {
      return this.b;
   }

   public void a(Map<djh, ggn> $$0) {
      this.a = $$0;
   }

   public static ggu c(djh $$0) {
      return a(kd.e.b($$0.b()), $$0);
   }

   public static ggu a(ahg $$0, djh $$1) {
      return new ggu($$0, b($$1.C()));
   }

   public static String b(Map<dkk<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dkk<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dkk<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dkk<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
