import javax.annotation.Nullable;

public class ceg extends cee {
   public ceg(bqb<? extends ceg> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected aul v() {
      return aum.ha;
   }

   @Override
   protected aul gL() {
      return aum.hb;
   }

   @Override
   protected aul o_() {
      return aum.hd;
   }

   @Nullable
   @Override
   protected aul gu() {
      return aum.he;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.hf;
   }

   @Override
   public boolean a(ccd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ceg) && !($$0 instanceof ceh) ? false : this.gU() && ((cef)$$0).gU();
      }
   }

   @Override
   protected void gT() {
      this.a(aum.hg, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      bqb<? extends cef> $$2 = $$1 instanceof ceh ? bqb.as : bqb.z;
      cef $$3 = $$2.a((cyx)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
