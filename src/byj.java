import javax.annotation.Nullable;

public class byj extends byh {
   public byj(bkm<? extends byj> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected aqm w() {
      return aqn.gd;
   }

   @Override
   protected aqm gD() {
      return aqn.ge;
   }

   @Override
   protected aqm m_() {
      return aqn.gg;
   }

   @Nullable
   @Override
   protected aqm gl() {
      return aqn.gh;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.gi;
   }

   @Override
   public boolean a(bwj $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof byj) && !($$0 instanceof byk) ? false : this.gM() && ((byi)$$0).gM();
      }
   }

   @Nullable
   @Override
   public bkd a(ama $$0, bkd $$1) {
      bkm<? extends byi> $$2 = $$1 instanceof byk ? bkm.ap : bkm.w;
      byi $$3 = $$2.a((crs)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
