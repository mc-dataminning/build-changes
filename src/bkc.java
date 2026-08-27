import javax.annotation.concurrent.Immutable;

@Immutable
public class bkc {
   public static final bkc a = new bkc("");
   public static final String b = "Lock";
   private final String c;

   public bkc(String $$0) {
      this.c = $$0;
   }

   public boolean a(cmx $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(sn $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bkc b(sn $$0) {
      return $$0.b("Lock", 8) ? new bkc($$0.l("Lock")) : a;
   }
}
