import javax.annotation.Nullable;

public class bwt extends bwj {
   public bwt(bim<? extends bwt> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public static bke.a p() {
      return gz().a(bkf.a, 15.0).a(bkf.d, 0.2F);
   }

   @Override
   protected void a(aru $$0) {
      this.a(bkf.n).a(a($$0::j));
   }

   @Override
   public bjd eQ() {
      return bjd.b;
   }

   @Override
   protected aov r() {
      return aow.AX;
   }

   @Override
   protected aov h_() {
      return aow.AY;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.AZ;
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      return bim.bq.a((cpm)$$0);
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      return !this.go() ? bgq.d : super.b($$0, $$1);
   }

   @Override
   protected void gp() {
   }

   @Override
   protected float a(bij $$0, float $$1) {
      return $$0.b - (this.i_() ? 0.03125F : 0.28125F) * $$1;
   }
}
