import javax.annotation.Nullable;

public class bxu extends bxs {
   public bxu(bjx<? extends bxu> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected aqc w() {
      return aqd.gb;
   }

   @Override
   protected aqc gD() {
      return aqd.gc;
   }

   @Override
   protected aqc m_() {
      return aqd.ge;
   }

   @Nullable
   @Override
   protected aqc gl() {
      return aqd.gf;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.gg;
   }

   @Override
   public boolean a(bvu $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bxu) && !($$0 instanceof bxv) ? false : this.gM() && ((bxt)$$0).gM();
      }
   }

   @Nullable
   @Override
   public bjo a(alq $$0, bjo $$1) {
      bjx<? extends bxt> $$2 = $$1 instanceof bxv ? bjx.ap : bjx.w;
      bxt $$3 = $$2.a((cqz)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
