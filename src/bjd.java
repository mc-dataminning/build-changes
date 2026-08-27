import javax.annotation.concurrent.Immutable;

@Immutable
public class bjd {
   public static final bjd a = new bjd("");
   public static final String b = "Lock";
   private final String c;

   public bjd(String $$0) {
      this.c = $$0;
   }

   public boolean a(clo $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(sd $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bjd b(sd $$0) {
      return $$0.b("Lock", 8) ? new bjd($$0.l("Lock")) : a;
   }
}
