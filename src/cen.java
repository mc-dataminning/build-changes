import javax.annotation.Nullable;

public class cen extends cel {
   public cen(bqg<? extends cen> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected aun v() {
      return auo.ha;
   }

   @Override
   protected aun gL() {
      return auo.hb;
   }

   @Override
   protected aun o_() {
      return auo.hd;
   }

   @Nullable
   @Override
   protected aun gu() {
      return auo.he;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.hf;
   }

   @Override
   public boolean a(cci $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cen) && !($$0 instanceof ceo) ? false : this.gU() && ((cem)$$0).gU();
      }
   }

   @Override
   protected void gT() {
      this.a(auo.hg, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      bqg<? extends cem> $$2 = $$1 instanceof ceo ? bqg.as : bqg.z;
      cem $$3 = $$2.a((czg)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
