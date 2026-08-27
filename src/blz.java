import javax.annotation.concurrent.Immutable;

@Immutable
public class blz {
   public static final blz a = new blz("");
   public static final String b = "Lock";
   private final String c;

   public blz(String $$0) {
      this.c = $$0;
   }

   public boolean a(cpd $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.B() && this.c.equals($$0.z().getString());
   }

   public void a(sw $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static blz b(sw $$0) {
      return $$0.b("Lock", 8) ? new blz($$0.l("Lock")) : a;
   }
}
