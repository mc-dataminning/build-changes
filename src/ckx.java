import javax.annotation.Nullable;

public class ckx extends ckn {
   private static final bvv bE = bwb.bO.n().a(bvu.a().a(bvt.a, 0.0F, bwb.bO.m() - 0.03125F, 0.0F)).a(0.5F);

   public ckx(bwb<? extends ckx> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public static bxw.a q() {
      return gR().a(bxx.s, 15.0).a(bxx.v, 0.2F);
   }

   public static boolean c(bwb<? extends cig> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return !bwa.a($$2) ? cig.b($$0, $$1, $$2, $$3, $$4) : bwa.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azs $$0) {
      this.g(bxx.o).a(a($$0::j));
   }

   @Override
   protected awj u() {
      return awk.Ey;
   }

   @Override
   protected awj l_() {
      return awk.Ez;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.EA;
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return bwb.bO.a($$0, bwa.e);
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      return (btq)(!this.gH() ? btq.e : super.b($$0, $$1));
   }

   @Override
   protected void gI() {
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bE : super.e($$0);
   }
}
