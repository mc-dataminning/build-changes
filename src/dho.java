public class dho extends dhd {
   private int a;

   public dho(hx $$0, djp $$1) {
      super(dhf.s, $$0, $$1);
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a = $$0.h("OutputSignal");
   }

   public int c() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
