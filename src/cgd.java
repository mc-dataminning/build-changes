import javax.annotation.Nullable;

public class cgd extends cft {
   private static final brk bY = brn.bu.n().a(brj.a().a(bri.a, 0.0F, brn.bu.l() - 0.03125F, 0.0F)).a(0.5F);

   public cgd(brn<? extends cgd> $$0, dad $$1) {
      super($$0, $$1);
   }

   public static btg.a r() {
      return gO().a(bth.q, 15.0).a(bth.r, 0.2F);
   }

   public static boolean c(brn<? extends cdp> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return !bse.a($$2) ? cdp.b($$0, $$1, $$2, $$3, $$4) : bse.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayg $$0) {
      this.f(bth.m).a(a($$0::j));
   }

   @Override
   protected avb v() {
      return avc.Dl;
   }

   @Override
   protected avb o_() {
      return avc.Dm;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Dn;
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      return brn.bu.a((dad)$$0);
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      return !this.gE() ? bpm.d : super.b($$0, $$1);
   }

   @Override
   protected void gF() {
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
