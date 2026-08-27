import javax.annotation.concurrent.Immutable;

@Immutable
public class bgs {
   public static final bgs a = new bgs("");
   public static final String b = "Lock";
   private final String c;

   public bgs(String $$0) {
      this.c = $$0;
   }

   public boolean a(cix $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(qr $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bgs b(qr $$0) {
      return $$0.b("Lock", 8) ? new bgs($$0.l("Lock")) : a;
   }
}
