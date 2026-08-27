public class dft extends dfi {
   private int a;

   public dft(hx $$0, dhn $$1) {
      super(dfk.s, $$0, $$1);
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(sd $$0) {
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
