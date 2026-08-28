public class cpy extends cpu {
   public cpy(bus<? extends cpy> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpy(dfm $$0, bvh $$1, cwm $$2) {
      super(bus.T, $$1, $$0, $$2);
   }

   public cpy(dfm $$0, double $$1, double $$2, double $$3, cwm $$4) {
      super(bus.T, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwi l() {
      return cwq.un;
   }

   @Override
   protected double bd() {
      return 0.07;
   }

   @Override
   protected void a(ezw $$0) {
      super.a($$0);
      if (this.dV() instanceof arp) {
         this.dV().c(2002, this.dv(), cyl.c(cym.a));
         int $$1 = 3 + this.dV().A.a(5) + this.dV().A.a(5);
         bux.a((arp)this.dV(), this.dt(), $$1);
         this.at();
      }
   }
}
