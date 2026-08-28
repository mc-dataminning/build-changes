public class cto extends ctz {
   private final ctm a;
   private final cox b;
   private int g;
   private final dfe h;

   public cto(cox $$0, dfe $$1, ctm $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cwp $$0) {
      return false;
   }

   @Override
   public cwp a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cwp $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwp $$0) {
      $$0.a(this.b.dW(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cox $$0, cwp $$1) {
      this.b_($$1);
      dff $$2 = this.a.g();
      if ($$2 != null) {
         cwp $$3 = this.a.a(0);
         cwp $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awk.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.x() + $$2.q());
      }
   }
}
