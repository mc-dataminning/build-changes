import javax.annotation.Nullable;

public class bwv extends bwl {
   public bwv(bip<? extends bwv> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public static bkg.a p() {
      return gA().a(bkh.a, 15.0).a(bkh.d, 0.2F);
   }

   @Override
   protected void a(arx $$0) {
      this.a(bkh.n).a(a($$0::j));
   }

   @Override
   public bjg eQ() {
      return bjg.b;
   }

   @Override
   protected aoy r() {
      return aoz.Bh;
   }

   @Override
   protected aoy h_() {
      return aoz.Bi;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.Bj;
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      return bip.bq.a((cpq)$$0);
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      return !this.gp() ? bgt.d : super.b($$0, $$1);
   }

   @Override
   protected void gq() {
   }

   @Override
   protected float a(bim $$0, float $$1) {
      return $$0.b - (this.i_() ? 0.03125F : 0.28125F) * $$1;
   }
}
