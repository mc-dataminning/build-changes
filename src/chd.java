import javax.annotation.Nullable;

public class chd extends cgy {
   private static final buo cg = bus.z.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float ca;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.ae.a(6000) + 6000;
   public boolean cf;

   public chd(bus<? extends chd> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new ccy(this, 1.4));
      this.bS.a(2, new cbr(this, 1.0));
      this.bS.a(3, new cdn(this, 1.0, $$0 -> $$0.a(axl.ao), false));
      this.bS.a(4, new cce(this, 1.1));
      this.bS.a(5, new cds(this, 1.0));
      this.bS.a(6, new ccn(this, cou.class, 6.0F));
      this.bS.a(7, new cda(this));
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? cg : super.e($$0);
   }

   public static bwo.a n() {
      return cgy.gr().a(bwp.s, 4.0).a(bwp.v, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.cc = this.bY;
      this.ca = this.bZ;
      this.bZ = this.bZ + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = azm.a(this.bZ, 0.0F, 1.0F);
      if (!this.aJ() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      ezy $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (this.dV() instanceof arp $$1 && this.bL() && !this.e_() && !this.q() && --this.ce <= 0) {
         if (this.a($$1, euj.aI, this::a)) {
            this.a(awn.eU, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ear.t);
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
   protected awm t() {
      return awn.eS;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.eV;
   }

   @Override
   protected awm n_() {
      return awn.eT;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.eW, 0.15F, 1.0F);
   }

   @Nullable
   public chd b(arp $$0, buc $$1) {
      return bus.z.a($$0, bur.e);
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.ao);
   }

   @Override
   protected int e(arp $$0) {
      return this.q() ? 10 : super.e($$0);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.q();
   }

   @Override
   protected void a(bul $$0, bul.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bvh) {
         ((bvh)$$0).aW = this.aW;
      }
   }

   public boolean q() {
      return this.cf;
   }

   public void x(boolean $$0) {
      this.cf = $$0;
   }
}
