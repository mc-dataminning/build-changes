public class cta extends ctl {
   private final csy a;
   private final com b;
   private int g;
   private final ddx h;

   public cta(com $$0, ddx $$1, csy $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cwb $$0) {
      return false;
   }

   @Override
   public cwb a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cwb $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwb $$0) {
      $$0.a(this.b.dX(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(com $$0, cwb $$1) {
      this.b_($$1);
      ddy $$2 = this.a.g();
      if ($$2 != null) {
         cwb $$3 = this.a.a(0);
         cwb $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awv.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.q());
      }
   }
}
