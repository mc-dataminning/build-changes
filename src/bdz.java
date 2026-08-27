import javax.annotation.concurrent.Immutable;

@Immutable
public class bdz {
   public static final bdz a = new bdz("");
   public static final String b = "Lock";
   private final String c;

   public bdz(String $$0) {
      this.c = $$0;
   }

   public boolean a(cfz $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(qr $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bdz b(qr $$0) {
      return $$0.b("Lock", 8) ? new bdz($$0.l("Lock")) : a;
   }
}
