import javax.annotation.concurrent.Immutable;

@Immutable
public class bgq {
   public static final bgq a = new bgq("");
   public static final String b = "Lock";
   private final String c;

   public bgq(String $$0) {
      this.c = $$0;
   }

   public boolean a(ciw $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(qs $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bgq b(qs $$0) {
      return $$0.b("Lock", 8) ? new bgq($$0.l("Lock")) : a;
   }
}
