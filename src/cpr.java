public class cpr extends cpn {
   public cpr(bul<? extends cpr> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpr(dfb $$0, bva $$1, cwb $$2) {
      super(bul.L, $$1, $$0, $$2);
   }

   public cpr(dfb $$0, double $$1, double $$2, double $$3, cwb $$4) {
      super(bul.L, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvx o() {
      return cwf.tX;
   }

   @Override
   protected double be() {
      return 0.07;
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);
      if (this.dX() instanceof arn) {
         this.dX().c(2002, this.dx(), cya.c(cyb.a));
         int $$1 = 3 + this.dX().A.a(5) + this.dX().A.a(5);
         buq.a((arn)this.dX(), this.dv(), $$1);
         this.av();
      }
   }
}
