import java.util.Map;
import java.util.Map.Entry;

public class fkn {
   private Map<dcb, fwr> a = Map.of();
   private final fwx b;

   public fkn(fwx $$0) {
      this.b = $$0;
   }

   public fuv a(dcb $$0) {
      return this.b($$0).e();
   }

   public fwr b(dcb $$0) {
      fwr $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public fwx a() {
      return this.b;
   }

   public void a(Map<dcb, fwr> $$0) {
      this.a = $$0;
   }

   public static fwy c(dcb $$0) {
      return a(jb.f.b($$0.b()), $$0);
   }

   public static fwy a(acq $$0, dcb $$1) {
      return new fwy($$0, b($$1.C()));
   }

   public static String b(Map<dde<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dde<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dde<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dde<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
