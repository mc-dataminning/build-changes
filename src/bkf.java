import javax.annotation.concurrent.Immutable;

@Immutable
public class bkf {
   public static final bkf a = new bkf("");
   public static final String b = "Lock";
   private final String c;

   public bkf(String $$0) {
      this.c = $$0;
   }

   public boolean a(cng $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(so $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bkf b(so $$0) {
      return $$0.b("Lock", 8) ? new bkf($$0.l("Lock")) : a;
   }
}
