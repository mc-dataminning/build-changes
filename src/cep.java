import javax.annotation.Nullable;

public class cep extends cef {
   private static final bpy bX = bqb.bu.n().a(bpx.a().a(bpw.a, 0.0F, bqb.bu.l() - 0.03125F, 0.0F)).a(0.5F);

   public cep(bqb<? extends cep> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public static bru.a r() {
      return gM().a(brv.q, 15.0).a(brv.r, 0.2F);
   }

   public static boolean c(bqb<? extends ccd> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return !bqs.a($$2) ? ccd.b($$0, $$1, $$2, $$3, $$4) : bqs.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(axr $$0) {
      this.f(brv.m).a(a($$0::j));
   }

   @Override
   protected aul v() {
      return aum.Dd;
   }

   @Override
   protected aul o_() {
      return aum.De;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.Df;
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      return bqb.bu.a((cyx)$$0);
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      return !this.gC() ? boa.d : super.b($$0, $$1);
   }

   @Override
   protected void gD() {
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? bX : super.e($$0);
   }
}
