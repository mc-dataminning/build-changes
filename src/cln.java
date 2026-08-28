import javax.annotation.Nullable;

public class cln extends cld {
   private static final bwg bF = bwm.bP.n().a(bwf.a().a(bwe.a, 0.0F, bwm.bP.m() - 0.03125F, 0.0F)).a(0.5F);

   public cln(bwm<? extends cln> $$0, div $$1) {
      super($$0, $$1);
   }

   public static byh.a q() {
      return gR().a(byi.s, 15.0).a(byi.v, 0.2F);
   }

   public static boolean c(bwm<? extends cis> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return !bwl.a($$2) ? cis.b($$0, $$1, $$2, $$3, $$4) : bwl.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byi.o).a(a($$0::j));
   }

   @Override
   protected awm u() {
      return awn.EB;
   }

   @Override
   protected awm l_() {
      return awn.EC;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.ED;
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      return bwm.bP.a($$0, bwl.e);
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      return (bub)(!this.gH() ? bub.e : super.b($$0, $$1));
   }

   @Override
   protected void gI() {
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? bF : super.e($$0);
   }
}
