import javax.annotation.concurrent.Immutable;

@Immutable
public class bhg {
   public static final bhg a = new bhg("");
   public static final String b = "Lock";
   private final String c;

   public bhg(String $$0) {
      this.c = $$0;
   }

   public boolean a(cjl $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(qw $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bhg b(qw $$0) {
      return $$0.b("Lock", 8) ? new bhg($$0.l("Lock")) : a;
   }
}
