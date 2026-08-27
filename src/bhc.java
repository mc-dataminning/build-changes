import javax.annotation.concurrent.Immutable;

@Immutable
public class bhc {
   public static final bhc a = new bhc("");
   public static final String b = "Lock";
   private final String c;

   public bhc(String $$0) {
      this.c = $$0;
   }

   public boolean a(cjh $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(qy $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bhc b(qy $$0) {
      return $$0.b("Lock", 8) ? new bhc($$0.l("Lock")) : a;
   }
}
