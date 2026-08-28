import javax.annotation.Nullable;

public class cjk extends cja {
   private static final bum bY = buq.bO.n().a(bul.a().a(buk.a, 0.0F, buq.bO.m() - 0.03125F, 0.0F)).a(0.5F);

   public cjk(buq<? extends cjk> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public static bwm.a p() {
      return gR().a(bwn.s, 15.0).a(bwn.v, 0.2F);
   }

   public static boolean c(buq<? extends cgw> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return !bup.a($$2) ? cgw.b($$0, $$1, $$2, $$3, $$4) : bup.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azg $$0) {
      this.g(bwn.o).a(a($$0::j));
   }

   @Override
   protected avy u() {
      return avz.Eo;
   }

   @Override
   protected avy o_() {
      return avz.Ep;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.Eq;
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      return buq.bO.a($$0, bup.e);
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      return (bsi)(!this.gG() ? bsi.e : super.b($$0, $$1));
   }

   @Override
   protected void gH() {
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? bY : super.e($$0);
   }
}
