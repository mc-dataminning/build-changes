import javax.annotation.concurrent.Immutable;

@Immutable
public class bmo {
   public static final bmo a = new bmo("");
   public static final String b = "Lock";
   private final String c;

   public bmo(String $$0) {
      this.c = $$0;
   }

   public boolean a(cpq $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.B() && this.c.equals($$0.z().getString());
   }

   public void a(sy $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bmo b(sy $$0) {
      return $$0.b("Lock", 8) ? new bmo($$0.l("Lock")) : a;
   }
}
