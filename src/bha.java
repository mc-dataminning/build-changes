import javax.annotation.concurrent.Immutable;

@Immutable
public class bha {
   public static final bha a = new bha("");
   public static final String b = "Lock";
   private final String c;

   public bha(String $$0) {
      this.c = $$0;
   }

   public boolean a(cjf $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(qy $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bha b(qy $$0) {
      return $$0.b("Lock", 8) ? new bha($$0.l("Lock")) : a;
   }
}
