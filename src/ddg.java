public class ddg extends dcv {
   private int a;

   public ddg(gw $$0, dfj $$1) {
      super(dcx.s, $$0, $$1);
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(qy $$0) {
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
