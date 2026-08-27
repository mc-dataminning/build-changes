import javax.annotation.Nullable;

public class cda extends cct {
   private static final bqo bY = bqr.w.n().a(0.5F).b(0.665F);

   public cda(bqr<? extends cda> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new byu(this, 2.0));
      this.bS.a(2, new bxn(this, 1.0));
      this.bS.a(3, new bzj(this, 1.25, cwd.a(csg.pw), false));
      this.bS.a(4, new bya(this, 1.25));
      this.bS.a(5, new bzo(this, 1.0));
      this.bS.a(6, new byj(this, ckl.class, 6.0F));
      this.bS.a(7, new byw(this));
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 10.0).a(bsl.r, 0.2F);
   }

   @Override
   protected auy v() {
      return auz.fW;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.fY;
   }

   @Override
   protected auy o_() {
      return auz.fX;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.ga, 0.15F, 1.0F);
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(csg.qy) && !this.p_()) {
         $$0.a(auz.fZ, 1.0F, 1.0F);
         csd $$3 = csf.a($$2, $$0, csg.qE.x());
         $$0.a($$1, $$3);
         return boq.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cda b(aqe $$0, bqf $$1) {
      return bqr.w.a((czu)$$0);
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
