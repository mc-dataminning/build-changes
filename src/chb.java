import javax.annotation.Nullable;

public class chb extends cgw {
   private static final bum cg = buq.z.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float ca;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.ae.a(6000) + 6000;
   public boolean cf;

   public chb(buq<? extends chb> $$0, dgg $$1) {
      super($$0, $$1);
      this.a(eto.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new ccw(this, 1.4));
      this.bS.a(2, new cbp(this, 1.0));
      this.bS.a(3, new cdl(this, 1.0, $$0 -> $$0.a(awx.an), false));
      this.bS.a(4, new ccc(this, 1.1));
      this.bS.a(5, new cdq(this, 1.0));
      this.bS.a(6, new ccl(this, cov.class, 6.0F));
      this.bS.a(7, new ccy(this));
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? cg : super.e($$0);
   }

   public static bwm.a p() {
      return cgw.gu().a(bwn.s, 4.0).a(bwn.v, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.cc = this.bY;
      this.ca = this.bZ;
      this.bZ = this.bZ + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = ayy.a(this.bZ, 0.0F, 1.0F);
      if (!this.aJ() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      fay $$0 = this.dz();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (this.dW() instanceof arc $$1 && this.bL() && !this.e_() && !this.t() && --this.ce <= 0) {
         if (this.a($$1, evl.aI, this::a)) {
            this.a(avz.eV, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ebr.t);
         }

         this.ce = this.ae.a(6000) + 6000;
      }
   }

   @Override
   protected boolean ba() {
      return this.Y > this.ch;
   }

   @Override
   protected void aZ() {
      this.ch = this.Y + this.bZ / 2.0F;
   }

   @Override
   protected avy u() {
      return avz.eT;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.eW;
   }

   @Override
   protected avy o_() {
      return avz.eU;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.eX, 0.15F, 1.0F);
   }

   @Nullable
   public chb b(arc $$0, bua $$1) {
      return buq.z.a($$0, bup.e);
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.an);
   }

   @Override
   protected int e(arc $$0) {
      return this.t() ? 10 : super.e($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(buj $$0, buj.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bvf) {
         ((bvf)$$0).aX = this.aX;
      }
   }

   public boolean t() {
      return this.cf;
   }

   public void x(boolean $$0) {
      this.cf = $$0;
   }
}
