import javax.annotation.concurrent.Immutable;

@Immutable
public class bkd {
   public static final bkd a = new bkd("");
   public static final String b = "Lock";
   private final String c;

   public bkd(String $$0) {
      this.c = $$0;
   }

   public boolean a(cmy $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(sn $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bkd b(sn $$0) {
      return $$0.b("Lock", 8) ? new bkd($$0.l("Lock")) : a;
   }
}
