import javax.annotation.Nullable;

public class chf extends chd {
   public chf(bsv<? extends chf> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected avv v() {
      return avw.hf;
   }

   @Override
   protected avv gO() {
      return avw.hg;
   }

   @Override
   protected avv o_() {
      return avw.hi;
   }

   @Nullable
   @Override
   protected avv gx() {
      return avw.hj;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.hk;
   }

   @Override
   public boolean a(cfa $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chf) && !($$0 instanceof chg) ? false : this.gX() && ((che)$$0).gX();
      }
   }

   @Override
   protected void gW() {
      this.a(avw.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bsj a(arb $$0, bsj $$1) {
      bsv<? extends che> $$2 = $$1 instanceof chg ? bsv.at : bsv.z;
      che $$3 = $$2.a((dbt)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
