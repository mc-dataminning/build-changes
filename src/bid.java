import javax.annotation.concurrent.Immutable;

@Immutable
public class bid {
   public static final bid a = new bid("");
   public static final String b = "Lock";
   private final String c;

   public bid(String $$0) {
      this.c = $$0;
   }

   public boolean a(ckj $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(rt $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static bid b(rt $$0) {
      return $$0.b("Lock", 8) ? new bid($$0.l("Lock")) : a;
   }
}
