public class dji extends dix {
   private int a;

   public dji(hz $$0, dlj $$1) {
      super(diz.s, $$0, $$1);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(sw $$0) {
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
