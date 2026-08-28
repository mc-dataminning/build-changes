import javax.annotation.Nullable;

public class cmo extends cme {
   private static final bxh bI = bxn.bQ.n().a(bxg.a().a(bxf.a, 0.0F, bxn.bQ.m() - 0.03125F, 0.0F)).a(0.5F);

   public cmo(bxn<? extends cmo> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public static bzk.a m() {
      return gV().a(bzl.s, 15.0).a(bzl.v, 0.2F);
   }

   public static boolean c(bxn<? extends cjv> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return !bxm.a($$2) ? cjv.b($$0, $$1, $$2, $$3, $$4) : bxm.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(bai $$0) {
      this.g(bzl.o).a(a($$0::j));
   }

   @Override
   protected awx s() {
      return awy.Ey;
   }

   @Override
   protected awx j_() {
      return awy.Ez;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.EA;
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      return bxn.bQ.a($$0, bxm.e);
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      return (bvc)(!this.gL() ? bvc.e : super.b($$0, $$1));
   }

   @Override
   protected void gM() {
   }

   @Override
   public bxh e(byr $$0) {
      return this.e_() ? bI : super.e($$0);
   }
}
