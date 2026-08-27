import javax.annotation.concurrent.Immutable;

@Immutable
public class bng {
   public static final bng a = new bng("");
   public static final String b = "Lock";
   private final String c;

   public bng(String $$0) {
      this.c = $$0;
   }

   public boolean a(cqm $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.B() && this.c.equals($$0.z().getString());
   }

   public void a(ta $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bng b(ta $$0) {
      return $$0.b("Lock", 8) ? new bng($$0.l("Lock")) : a;
   }
}
