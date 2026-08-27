import javax.annotation.concurrent.Immutable;

@Immutable
public class bjn {
   public static final bjn a = new bjn("");
   public static final String b = "Lock";
   private final String c;

   public bjn(String $$0) {
      this.c = $$0;
   }

   public boolean a(cmh $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(sj $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bjn b(sj $$0) {
      return $$0.b("Lock", 8) ? new bjn($$0.l("Lock")) : a;
   }
}
