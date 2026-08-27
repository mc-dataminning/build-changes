import javax.annotation.Nullable;

public class cdw extends cdp {
   private static final brk bY = brn.w.n().a(0.5F).b(0.665F);

   public cdw(brn<? extends cdw> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new byr(this));
      this.bS.a(1, new bzq(this, 2.0));
      this.bS.a(2, new byj(this, 1.0));
      this.bS.a(3, new caf(this, 1.25, $$0 -> $$0.a(avz.aa), false));
      this.bS.a(4, new byw(this, 1.25));
      this.bS.a(5, new cak(this, 1.0));
      this.bS.a(6, new bzf(this, clh.class, 6.0F));
      this.bS.a(7, new bzs(this));
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.aa);
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 10.0).a(bth.r, 0.2F);
   }

   @Override
   protected avb v() {
      return avc.fW;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.fY;
   }

   @Override
   protected avb o_() {
      return avc.fX;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.ga, 0.15F, 1.0F);
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.qy) && !this.p_()) {
         $$0.a(avc.fZ, 1.0F, 1.0F);
         csz $$3 = ctb.a($$2, $$0, ctc.qE.v());
         $$0.a($$1, $$3);
         return bpm.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cdw b(aqh $$0, brb $$1) {
      return brn.w.a((dad)$$0);
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
