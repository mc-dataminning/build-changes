import javax.annotation.concurrent.Immutable;

@Immutable
public class blx {
   public static final blx a = new blx("");
   public static final String b = "Lock";
   private final String c;

   public blx(String $$0) {
      this.c = $$0;
   }

   public boolean a(coz $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.B() && this.c.equals($$0.z().getString());
   }

   public void a(sw $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static blx b(sw $$0) {
      return $$0.b("Lock", 8) ? new blx($$0.l("Lock")) : a;
   }
}
