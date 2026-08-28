public class dpt extends dpi {
   private int a;

   public dpt(iz $$0, dsd $$1) {
      super(dpk.s, $$0, $$1);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.h("OutputSignal");
   }

   public int b() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
