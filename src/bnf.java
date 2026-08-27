import javax.annotation.concurrent.Immutable;

@Immutable
public class bnf {
   public static final bnf a = new bnf("");
   public static final String b = "Lock";
   private final String c;

   public bnf(String $$0) {
      this.c = $$0;
   }

   public boolean a(cqk $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.B() && this.c.equals($$0.z().getString());
   }

   public void a(ta $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bnf b(ta $$0) {
      return $$0.b("Lock", 8) ? new bnf($$0.l("Lock")) : a;
   }
}
