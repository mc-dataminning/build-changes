import javax.annotation.Nullable;

public class bxg extends bww {
   public bxg(bja<? extends bxg> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public static bkr.a s() {
      return gE().a(bks.l, 15.0).a(bks.m, 0.2F);
   }

   @Override
   protected void a(ash $$0) {
      this.a(bks.h).a(a($$0::j));
   }

   @Override
   public bjr eR() {
      return bjr.b;
   }

   @Override
   protected apf w() {
      return apg.Bh;
   }

   @Override
   protected apf l_() {
      return apg.Bi;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.Bj;
   }

   @Nullable
   @Override
   public bir a(akt $$0, bir $$1) {
      return bja.bq.a((cqb)$$0);
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      return !this.gt() ? bhe.d : super.b($$0, $$1);
   }

   @Override
   protected void gu() {
   }

   @Override
   protected float a(bix $$0, float $$1) {
      return $$0.b - (this.m_() ? 0.03125F : 0.28125F) * $$1;
   }
}
