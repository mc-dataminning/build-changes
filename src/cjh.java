import javax.annotation.Nullable;

public class cjh extends cjb {
   public cjh(bus<? extends cjh> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected awm t() {
      return awn.pw;
   }

   @Override
   protected awm gN() {
      return awn.px;
   }

   @Override
   protected awm n_() {
      return awn.pz;
   }

   @Nullable
   @Override
   protected awm go() {
      return awn.pA;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.pB;
   }

   @Override
   protected void gU() {
      this.a(awn.pC, 0.4F, 1.0F);
   }

   @Override
   protected void v() {
      this.a(awn.py, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      return bus.aE.a($$0, bur.e);
   }
}
