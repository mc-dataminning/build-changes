import javax.annotation.Nullable;

public class cgw extends cgr {
   private static final buh cg = bul.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float ca;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.af.a(6000) + 6000;
   public boolean cf;

   public cgw(bul<? extends cgw> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new ccr(this, 1.4));
      this.bS.a(2, new cbk(this, 1.0));
      this.bS.a(3, new cdg(this, 1.0, $$0 -> $$0.a(axj.an), false));
      this.bS.a(4, new cbx(this, 1.1));
      this.bS.a(5, new cdl(this, 1.0));
      this.bS.a(6, new ccg(this, com.class, 6.0F));
      this.bS.a(7, new cct(this));
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static bwh.a q() {
      return cgr.gz().a(bwi.s, 4.0).a(bwi.v, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.ca = this.bZ;
      this.bZ = this.bZ + (this.aK() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = azk.a(this.bZ, 0.0F, 1.0F);
      if (!this.aK() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      ezn $$0 = this.dA();
      if (!this.aK() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dX().C && this.bM() && !this.p_() && !this.t() && --this.ce <= 0) {
         if (this.a(ety.aI, this::b)) {
            this.a(awl.eU, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            this.a(eag.t);
         }

         this.ce = this.af.a(6000) + 6000;
      }
   }

   @Override
   protected boolean bb() {
      return this.Z > this.ch;
   }

   @Override
   protected void ba() {
      this.ch = this.Z + this.bZ / 2.0F;
   }

   @Override
   protected awk w() {
      return awl.eS;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.eV;
   }

   @Override
   protected awk o_() {
      return awl.eT;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.eW, 0.15F, 1.0F);
   }

   @Nullable
   public cgw b(arn $$0, btv $$1) {
      return bul.t.a($$0, buk.e);
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.an);
   }

   @Override
   protected int eq() {
      return this.t() ? 10 : super.eq();
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bue $$0, bue.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bva) {
         ((bva)$$0).aX = this.aX;
      }
   }

   public boolean t() {
      return this.cf;
   }

   public void x(boolean $$0) {
      this.cf = $$0;
   }
}
