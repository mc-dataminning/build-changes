import javax.annotation.concurrent.Immutable;

@Immutable
public class bjx {
   public static final bjx a = new bjx("");
   public static final String b = "Lock";
   private final String c;

   public bjx(String $$0) {
      this.c = $$0;
   }

   public boolean a(cmr $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(sl $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bjx b(sl $$0) {
      return $$0.b("Lock", 8) ? new bjx($$0.l("Lock")) : a;
   }
}
