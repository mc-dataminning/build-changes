import javax.annotation.Nullable;

public class clr extends clh {
   private static final bwi bG = bwo.bP.n().a(bwh.a().a(bwg.a, 0.0F, bwo.bP.m() - 0.03125F, 0.0F)).a(0.5F);

   public clr(bwo<? extends clr> $$0, dja $$1) {
      super($$0, $$1);
   }

   public static byj.a q() {
      return gS().a(byk.s, 15.0).a(byk.v, 0.2F);
   }

   public static boolean c(bwo<? extends ciu> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return !bwn.a($$2) ? ciu.b($$0, $$1, $$2, $$3, $$4) : bwn.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byk.o).a(a($$0::j));
   }

   @Override
   protected awm u() {
      return awn.EE;
   }

   @Override
   protected awm l_() {
      return awn.EF;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.EG;
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      return bwo.bP.a($$0, bwn.e);
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      return (bud)(!this.gI() ? bud.e : super.b($$0, $$1));
   }

   @Override
   protected void gJ() {
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bG : super.e($$0);
   }
}
