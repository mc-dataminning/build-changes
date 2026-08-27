public class dhf extends dgu {
   private int a;

   public dhf(hx $$0, djg $$1) {
      super(dgw.s, $$0, $$1);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(sn $$0) {
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
