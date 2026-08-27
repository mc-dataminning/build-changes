public class abw implements vd<abc> {
   private final gw a;
   private final int b;
   private final boolean c;

   public abw(gw $$0, int $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public abw(so $$0) {
      this.a = $$0.e();
      this.b = $$0.m();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c);
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
