public class cng extends cmf {
   private static final cuh e = new cuh(cuk.vT);
   private static final ajy<Float> g = akc.a(cng.class, aka.d);
   private int h = 60;

   public cng(bsb<? extends cng> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(g, 5.0F);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("lifetime", this.h);
      $$0.a("strength", this.y());
   }

   @Override
   public void a(uk $$0) {
      this.h = $$0.h("lifetime");
      this.a($$0.j("strength"));
   }

   public void a(float $$0) {
      this.as.a(g, $$0);
   }

   public float y() {
      return this.as.a(g);
   }

   @Override
   public void l() {
      if (!this.dU().C) {
         this.h--;
         if (this.h <= 0) {
            this.ao();
            return;
         }
      }

      ews $$0 = cmu.a(this, brv::bI, this.ag_());
      this.a($$0);
      ewu $$1 = this.ds();
      ewu $$2 = this.dx();
      ewu $$3 = $$1.e($$2);
      ewu $$4 = $$1.e($$2.a(0.5));
      float $$5 = this.y();
      if (this.al.i() < $$5 / 2.0F) {
         this.dU().a(lb.M, $$3.c, $$3.d, $$3.e, 0.0, 0.0, 0.0);
      }

      if (this.al.i() < $$5 / 2.0F) {
         this.dU().a(new kx(lb.Q, e), $$4.c, $$4.d, $$4.e, 0.0, 0.0, 0.0);
      }

      this.a_($$3.c, $$3.d, $$3.e);
   }

   @Override
   protected void a(ews $$0) {
      ews.a $$1 = $$0.c();
      if ($$1 == ews.a.c) {
         brv $$2 = ((ewr)$$0).a();
         $$2.a(this.dU().aj().q(), this.y());
      } else if ($$1 == ews.a.b) {
         this.ao();
      }
   }
}
