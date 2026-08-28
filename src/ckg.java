import javax.annotation.Nullable;

public class ckg extends cjw {
   private static final bvi bZ = bvm.bP.n().a(bvh.a().a(bvg.a, 0.0F, bvm.bP.m() - 0.03125F, 0.0F)).a(0.5F);

   public ckg(bvm<? extends ckg> $$0, dha $$1) {
      super($$0, $$1);
   }

   public static bxi.a p() {
      return gO().a(bxj.s, 15.0).a(bxj.v, 0.2F);
   }

   public static boolean c(bvm<? extends chs> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return !bvl.a($$2) ? chs.b($$0, $$1, $$2, $$3, $$4) : bvl.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(bam $$0) {
      this.g(bxj.o).a(a($$0::j));
   }

   @Override
   protected axe u() {
      return axf.DY;
   }

   @Override
   protected axe o_() {
      return axf.DZ;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.Ea;
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      return bvm.bP.a($$0, bvl.e);
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      return (bte)(!this.gD() ? bte.e : super.b($$0, $$1));
   }

   @Override
   protected void gE() {
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? bZ : super.e($$0);
   }
}
