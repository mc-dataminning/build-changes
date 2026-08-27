import javax.annotation.concurrent.Immutable;

@Immutable
public class bgv {
   public static final bgv a = new bgv("");
   public static final String b = "Lock";
   private final String c;

   public bgv(String $$0) {
      this.c = $$0;
   }

   public boolean a(cja $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(qu $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bgv b(qu $$0) {
      return $$0.b("Lock", 8) ? new bgv($$0.l("Lock")) : a;
   }
}
