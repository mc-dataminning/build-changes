public abstract class cgt extends chz implements cgz {
   private static final ajy<Boolean> a = akc.a(cgt.class, aka.k);

   public cgt(bur<? extends cgt> $$0, dgh $$1) {
      super($$0, $$1);
      this.bP = new cgt.a(this);
   }

   public static bwn.a m() {
      return bvi.F().a(bwo.s, 3.0);
   }

   @Override
   public boolean aa() {
      return super.aa() || this.p();
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && !this.l_();
   }

   @Override
   public int aj() {
      return 8;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean p() {
      return this.al.a(a);
   }

   @Override
   public void x(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.p());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new ccx(this, 1.25));
      this.bS.a(2, new cbl<>(this, cow.class, 8.0F, 1.6, 1.4, bup.f::test));
      this.bS.a(4, new cgt.b(this));
   }

   @Override
   protected ces b(dgh $$0) {
      return new ceu(this, $$0);
   }

   @Override
   public void a_(faz $$0) {
      if (this.dh() && this.bj()) {
         this.a(0.01F, $$0);
         this.a(bvk.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.O_() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.bj() && this.aJ() && this.Q) {
         this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.gs());
      }

      super.d_();
   }

   @Override
   protected bsj b(cow $$0, bsi $$1) {
      return cgz.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cwo $$0) {
      cgz.a(this, $$0);
   }

   @Override
   public void h(tq $$0) {
      cgz.a(this, $$0);
   }

   @Override
   public avz t() {
      return awa.dl;
   }

   protected boolean x() {
      return true;
   }

   protected abstract avz gs();

   @Override
   protected avz aV() {
      return awa.jv;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
   }

   static class a extends cbh {
      private final cgt l;

      a(cgt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awv.a)) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
         }

         if (this.k == cbh.a.b && !this.l.P().k()) {
            float $$0 = (float)(this.h * this.l.h(bwo.v));
            this.l.C(ayz.h(0.125F, this.l.fp(), $$0));
            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dy().b(0.0, (double)this.l.fp() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dL(), $$5, 90.0F));
               this.l.aX = this.l.dL();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cdc {
      private final cgt i;

      public b(cgt $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.x() && super.b();
      }
   }
}
