public class aef implements xg<adk> {
   private final hx a;
   private final int b;
   private final boolean c;

   public aef(hx $$0, int $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aef(uj $$0) {
      this.a = $$0.e();
      this.b = $$0.n();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c);
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
