public class cte extends ctp {
   private final ctc a;
   private final cor b;
   private int g;
   private final deb h;

   public cte(cor $$0, deb $$1, ctc $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cwf $$0) {
      return false;
   }

   @Override
   public cwf a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cwf $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwf $$0) {
      $$0.a(this.b.dY(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cor $$0, cwf $$1) {
      this.b_($$1);
      dec $$2 = this.a.g();
      if ($$2 != null) {
         cwf $$3 = this.a.a(0);
         cwf $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awy.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.q());
      }
   }
}
