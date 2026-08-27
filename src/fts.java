import java.util.Map;
import java.util.Map.Entry;

public class fts {
   private Map<dja, ggg> a = Map.of();
   private final ggm b;

   public fts(ggm $$0) {
      this.b = $$0;
   }

   public gef a(dja $$0) {
      return this.b($$0).e();
   }

   public ggg b(dja $$0) {
      ggg $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public ggm a() {
      return this.b;
   }

   public void a(Map<dja, ggg> $$0) {
      this.a = $$0;
   }

   public static ggn c(dja $$0) {
      return a(kd.e.b($$0.b()), $$0);
   }

   public static ggn a(ahd $$0, dja $$1) {
      return new ggn($$0, b($$1.C()));
   }

   public static String b(Map<dkd<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dkd<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dkd<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dkd<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
