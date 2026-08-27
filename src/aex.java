import javax.annotation.Nullable;

public class aex implements xf<adj> {
   private final int a;
   private final String b;
   private final boolean c;

   public aex(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aex(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   @Nullable
   public csp a(cto $$0) {
      blu $$1 = $$0.a(this.a);
      return $$1 instanceof chh ? ((chh)$$1).C() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
