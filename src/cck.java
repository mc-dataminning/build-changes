import javax.annotation.Nullable;

public class cck extends ccd {
   private static final bpy bX = bqb.w.n().a(0.5F).b(0.665F);

   public cck(bqb<? extends cck> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new bye(this, 2.0));
      this.bR.a(2, new bwx(this, 1.0));
      this.bR.a(3, new byt(this, 1.25, cvg.a(crm.pv), false));
      this.bR.a(4, new bxk(this, 1.25));
      this.bR.a(5, new byy(this, 1.0));
      this.bR.a(6, new bxt(this, cjt.class, 6.0F));
      this.bR.a(7, new byg(this));
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 10.0).a(brv.r, 0.2F);
   }

   @Override
   protected aul v() {
      return aum.fW;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.fY;
   }

   @Override
   protected aul o_() {
      return aum.fX;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.ga, 0.15F, 1.0F);
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.qx) && !this.p_()) {
         $$0.a(aum.fZ, 1.0F, 1.0F);
         crj $$3 = crl.a($$2, $$0, crm.qD.x());
         $$0.a($$1, $$3);
         return boa.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cck b(aps $$0, bpp $$1) {
      return bqb.w.a((cyx)$$0);
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? bX : super.e($$0);
   }
}
