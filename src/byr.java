import javax.annotation.Nullable;

public class byr extends byp {
   public byr(bku<? extends byr> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected aqq y() {
      return aqr.gt;
   }

   @Override
   protected aqq gE() {
      return aqr.gu;
   }

   @Override
   protected aqq m_() {
      return aqr.gw;
   }

   @Nullable
   @Override
   protected aqq gm() {
      return aqr.gx;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.gy;
   }

   @Override
   public boolean a(bwr $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof byr) && !($$0 instanceof bys) ? false : this.gN() && ((byq)$$0).gN();
      }
   }

   @Nullable
   @Override
   public bkl a(ame $$0, bkl $$1) {
      bku<? extends byq> $$2 = $$1 instanceof bys ? bku.ap : bku.w;
      byq $$3 = $$2.a((csa)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
