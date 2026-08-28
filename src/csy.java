public class csy extends ctw {
   private final cou a;
   private int b;

   public csy(cou $$0, bsd $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cwm $$0) {
      return false;
   }

   @Override
   public cwm a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cou $$0, cwm $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cwm $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwm $$0) {
      $$0.a(this.a.dV(), this.a, this.b);
      if (this.a instanceof arq $$1 && this.c instanceof dsm $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
