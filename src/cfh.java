import javax.annotation.Nullable;

public class cfh extends cex {
   private static final bqo bY = bqr.bu.n().a(bqn.a().a(bqm.a, 0.0F, bqr.bu.l() - 0.03125F, 0.0F)).a(0.5F);

   public cfh(bqr<? extends cfh> $$0, czu $$1) {
      super($$0, $$1);
   }

   public static bsk.a r() {
      return gO().a(bsl.q, 15.0).a(bsl.r, 0.2F);
   }

   public static boolean c(bqr<? extends cct> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return !bri.a($$2) ? cct.b($$0, $$1, $$2, $$3, $$4) : bri.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayd $$0) {
      this.f(bsl.m).a(a($$0::j));
   }

   @Override
   protected auy v() {
      return auz.Dk;
   }

   @Override
   protected auy o_() {
      return auz.Dl;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.Dm;
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      return bqr.bu.a((czu)$$0);
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      return !this.gE() ? boq.d : super.b($$0, $$1);
   }

   @Override
   protected void gF() {
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
