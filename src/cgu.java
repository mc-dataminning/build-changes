import javax.annotation.Nullable;

public class cgu extends cgk {
   private static final brz bY = bsc.bv.n().a(bry.a().a(brx.a, 0.0F, bsc.bv.m() - 0.03125F, 0.0F)).a(0.5F);

   public cgu(bsc<? extends cgu> $$0, daz $$1) {
      super($$0, $$1);
   }

   public static btx.a s() {
      return gO().a(bty.q, 15.0).a(bty.r, 0.2F);
   }

   public static boolean c(bsc<? extends ceg> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return !bsu.a($$2) ? ceg.b($$0, $$1, $$2, $$3, $$4) : bsu.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(aym $$0) {
      this.f(bty.m).a(a($$0::j));
   }

   @Override
   protected avh v() {
      return avi.Dw;
   }

   @Override
   protected avh o_() {
      return avi.Dx;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.Dy;
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      return bsc.bv.a((daz)$$0);
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      return !this.gE() ? bpw.d : super.b($$0, $$1);
   }

   @Override
   protected void gF() {
   }

   @Override
   public brz e(btc $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
