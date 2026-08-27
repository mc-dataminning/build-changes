import javax.annotation.Nullable;

public class bwr extends bwh {
   public bwr(bik<? extends bwr> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public static bkc.a p() {
      return gz().a(bkd.a, 15.0).a(bkd.d, 0.2F);
   }

   @Override
   protected void a(art $$0) {
      this.a(bkd.n).a(a($$0::j));
   }

   @Override
   public bjb eQ() {
      return bjb.b;
   }

   @Override
   protected aot r() {
      return aou.AX;
   }

   @Override
   protected aot h_() {
      return aou.AY;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.AZ;
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      return bik.bq.a((cpk)$$0);
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      return !this.go() ? bgo.d : super.b($$0, $$1);
   }

   @Override
   protected void gp() {
   }

   @Override
   protected float a(bih $$0, float $$1) {
      return $$0.b - (this.i_() ? 0.03125F : 0.28125F) * $$1;
   }
}
