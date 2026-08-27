import javax.annotation.Nullable;

public class cew extends cem {
   private static final bqd bX = bqg.bu.n().a(bqc.a().a(bqb.a, 0.0F, bqg.bu.l() - 0.03125F, 0.0F)).a(0.5F);

   public cew(bqg<? extends cew> $$0, czg $$1) {
      super($$0, $$1);
   }

   public static brz.a r() {
      return gM().a(bsa.q, 15.0).a(bsa.r, 0.2F);
   }

   public static boolean c(bqg<? extends cci> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return !bqx.a($$2) ? cci.b($$0, $$1, $$2, $$3, $$4) : bqx.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(axt $$0) {
      this.f(bsa.m).a(a($$0::j));
   }

   @Override
   protected aun v() {
      return auo.Dd;
   }

   @Override
   protected aun o_() {
      return auo.De;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.Df;
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      return bqg.bu.a((czg)$$0);
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      return !this.gC() ? bof.d : super.b($$0, $$1);
   }

   @Override
   protected void gD() {
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? bX : super.e($$0);
   }
}
