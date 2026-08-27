public class cey extends cep implements deu {
   private boolean i = true;

   public cey(bjx<? extends cey> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cey(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public ceo.a v() {
      return ceo.a.f;
   }

   @Override
   public dgb x() {
      return cuc.hc.o();
   }

   @Override
   public int z() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.G()) {
         this.p($$4);
      }
   }

   public boolean G() {
      return this.i;
   }

   public void p(boolean $$0) {
      this.i = $$0;
   }

   @Override
   public double H() {
      return this.dq();
   }

   @Override
   public double I() {
      return this.ds() + 0.5;
   }

   @Override
   public double K() {
      return this.dw();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B && this.bv() && this.G() && this.L()) {
         this.e();
      }
   }

   public boolean L() {
      if (dev.a(this.dL(), this)) {
         return true;
      } else {
         for (bzq $$1 : this.dL().a(bzq.class, this.cG().c(0.25, 0.0, 0.25), bjw.a)) {
            if (dev.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cke ag_() {
      return ckm.ne;
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      $$0.a("Enabled", this.i);
   }

   @Override
   protected void a(rt $$0) {
      super.a($$0);
      this.i = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cfp a(int $$0, ccw $$1) {
      return new cgm($$0, $$1, this);
   }
}
