import java.util.Map;
import java.util.Map.Entry;

public class fom {
   private Map<dez, gav> a = Map.of();
   private final gbb b;

   public fom(gbb $$0) {
      this.b = $$0;
   }

   public fyu a(dez $$0) {
      return this.b($$0).e();
   }

   public gav b(dez $$0) {
      gav $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gbb a() {
      return this.b;
   }

   public void a(Map<dez, gav> $$0) {
      this.a = $$0;
   }

   public static gbc c(dez $$0) {
      return a(jb.f.b($$0.b()), $$0);
   }

   public static gbc a(aer $$0, dez $$1) {
      return new gbc($$0, b($$1.C()));
   }

   public static String b(Map<dgc<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dgc<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dgc<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dgc<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
