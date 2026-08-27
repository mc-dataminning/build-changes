import java.util.Map;
import java.util.Map.Entry;

public class ftb {
   private Map<dip, gfp> a = Map.of();
   private final gfv b;

   public ftb(gfv $$0) {
      this.b = $$0;
   }

   public gdo a(dip $$0) {
      return this.b($$0).e();
   }

   public gfp b(dip $$0) {
      gfp $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gfv a() {
      return this.b;
   }

   public void a(Map<dip, gfp> $$0) {
      this.a = $$0;
   }

   public static gfw c(dip $$0) {
      return a(kb.e.b($$0.b()), $$0);
   }

   public static gfw a(agt $$0, dip $$1) {
      return new gfw($$0, b($$1.C()));
   }

   public static String b(Map<djs<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<djs<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         djs<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(djs<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
