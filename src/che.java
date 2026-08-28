import javax.annotation.Nullable;

public class che extends cgz {
   private static final bup cg = but.z.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float ca;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.ae.a(6000) + 6000;
   public boolean cf;

   public che(but<? extends che> $$0, dgj $$1) {
      super($$0, $$1);
      this.a(etr.j, 0.0F);
   }

   @Override
   protected void E() {
      this.bS.a(0, new cca(this));
      this.bS.a(1, new ccz(this, 1.4));
      this.bS.a(2, new cbs(this, 1.0));
      this.bS.a(3, new cdo(this, 1.0, $$0 -> $$0.a(awy.an), false));
      this.bS.a(4, new ccf(this, 1.1));
      this.bS.a(5, new cdt(this, 1.0));
      this.bS.a(6, new cco(this, coy.class, 6.0F));
      this.bS.a(7, new cdb(this));
   }

   @Override
   public bup e(bvu $$0) {
      return this.e_() ? cg : super.e($$0);
   }

   public static bwp.a p() {
      return cgz.gx().a(bwq.s, 4.0).a(bwq.v, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.cc = this.bY;
      this.ca = this.bZ;
      this.bZ = this.bZ + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = ayz.a(this.bZ, 0.0F, 1.0F);
      if (!this.aJ() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      fbb $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (this.dV() instanceof ard $$1 && this.bL() && !this.e_() && !this.t() && --this.ce <= 0) {
         if (this.a($$1, evo.aI, this::a)) {
            this.a(awa.eV, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ebu.t);
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
   protected avz u() {
      return awa.eT;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.eW;
   }

   @Override
   protected avz o_() {
      return awa.eU;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.eX, 0.15F, 1.0F);
   }

   @Nullable
   public che b(ard $$0, bud $$1) {
      return but.z.a($$0, bus.e);
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.an);
   }

   @Override
   protected int e(ard $$0) {
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
   protected void a(bum $$0, bum.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bvi) {
         ((bvi)$$0).aX = this.aX;
      }
   }

   public boolean t() {
      return this.cf;
   }

   public void x(boolean $$0) {
      this.cf = $$0;
   }
}
