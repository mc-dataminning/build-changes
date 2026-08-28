import javax.annotation.Nullable;

public class cjd extends cjb {
   public cjd(bus<? extends cjd> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected awm t() {
      return awn.hg;
   }

   @Override
   protected awm gN() {
      return awn.hh;
   }

   @Override
   protected awm n_() {
      return awn.hj;
   }

   @Nullable
   @Override
   protected awm go() {
      return awn.hk;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.hl;
   }

   @Override
   public boolean a(cgy $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjd) && !($$0 instanceof cje) ? false : this.gV() && ((cjc)$$0).gV();
      }
   }

   @Override
   protected void gU() {
      this.a(awn.hm, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      bus<? extends cjc> $$2 = $$1 instanceof cje ? bus.aE : bus.H;
      cjc $$3 = $$2.a($$0, bur.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
