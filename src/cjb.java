import javax.annotation.Nullable;

public class cjb extends ciz {
   public cjb(buq<? extends cjb> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected avy u() {
      return avz.hA;
   }

   @Override
   protected avy gQ() {
      return avz.hB;
   }

   @Override
   protected avy o_() {
      return avz.hD;
   }

   @Nullable
   @Override
   protected avy gr() {
      return avz.hE;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.hF;
   }

   @Override
   public boolean a(cgw $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjb) && !($$0 instanceof cjc) ? false : this.gY() && ((cja)$$0).gY();
      }
   }

   @Override
   protected void gX() {
      this.a(avz.hG, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      buq<? extends cja> $$2 = $$1 instanceof cjc ? buq.aF : buq.I;
      cja $$3 = $$2.a($$0, bup.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
