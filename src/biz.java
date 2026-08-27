import javax.annotation.concurrent.Immutable;

@Immutable
public class biz {
   public static final biz a = new biz("");
   public static final String b = "Lock";
   private final String c;

   public biz(String $$0) {
      this.c = $$0;
   }

   public boolean a(clj $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.A() && this.c.equals($$0.y().getString());
   }

   public void a(rz $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }
   }

   public static biz b(rz $$0) {
      return $$0.b("Lock", 8) ? new biz($$0.l("Lock")) : a;
   }
}
