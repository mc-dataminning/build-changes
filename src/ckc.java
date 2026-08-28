import javax.annotation.Nullable;

public class ckc extends cjs {
   private static final bve bZ = bvi.bP.n().a(bvd.a().a(bvc.a, 0.0F, bvi.bP.m() - 0.03125F, 0.0F)).a(0.5F);

   public ckc(bvi<? extends ckc> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static bxe.a p() {
      return gQ().a(bxf.s, 15.0).a(bxf.v, 0.2F);
   }

   public static boolean c(bvi<? extends cho> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return !bvh.a($$2) ? cho.b($$0, $$1, $$2, $$3, $$4) : bvh.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(bac $$0) {
      this.g(bxf.o).a(a($$0::j));
   }

   @Override
   protected awu u() {
      return awv.Ep;
   }

   @Override
   protected awu o_() {
      return awv.Eq;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Er;
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      return bvi.bP.a($$0, bvh.e);
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      return (bta)(!this.gF() ? bta.e : super.b($$0, $$1));
   }

   @Override
   protected void gG() {
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? bZ : super.e($$0);
   }
}
