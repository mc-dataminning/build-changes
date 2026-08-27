import javax.annotation.Nullable;

public class bws extends bwi {
   public bws(bim<? extends bws> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public static bkd.a p() {
      return gA().a(bke.a, 15.0).a(bke.d, 0.2F);
   }

   @Override
   protected void a(aru $$0) {
      this.a(bke.n).a(a($$0::j));
   }

   @Override
   public bjd eQ() {
      return bjd.b;
   }

   @Override
   protected aov r() {
      return aow.Bh;
   }

   @Override
   protected aov h_() {
      return aow.Bi;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.Bj;
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      return bim.bq.a((cpl)$$0);
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      return !this.gp() ? bgq.d : super.b($$0, $$1);
   }

   @Override
   protected void gq() {
   }

   @Override
   protected float a(bij $$0, float $$1) {
      return $$0.b - (this.i_() ? 0.03125F : 0.28125F) * $$1;
   }
}
