public class dtj extends dsy {
   private int a;

   public dtj(jh $$0, dvv $$1) {
      super(dta.s, $$0, $$1);
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
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
