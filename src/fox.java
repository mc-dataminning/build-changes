import java.util.Map;
import java.util.Map.Entry;

public class fox {
   private Map<dfj, gbf> a = Map.of();
   private final gbl b;

   public fox(gbl $$0) {
      this.b = $$0;
   }

   public fze a(dfj $$0) {
      return this.b($$0).e();
   }

   public gbf b(dfj $$0) {
      gbf $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gbl a() {
      return this.b;
   }

   public void a(Map<dfj, gbf> $$0) {
      this.a = $$0;
   }

   public static gbm c(dfj $$0) {
      return a(jd.f.b($$0.b()), $$0);
   }

   public static gbm a(aex $$0, dfj $$1) {
      return new gbm($$0, b($$1.C()));
   }

   public static String b(Map<dgm<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dgm<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dgm<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dgm<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
