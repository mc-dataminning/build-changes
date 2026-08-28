public class cny extends cnu {
   public cny(bsw<? extends cny> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cny(dcu $$0, btl $$1) {
      super(bsw.L, $$1, $$0);
   }

   public cny(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.L, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuj t() {
      return cur.tW;
   }

   @Override
   protected double aZ() {
      return 0.07;
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      if (this.dQ() instanceof aqt) {
         this.dQ().c(2002, this.dq(), cws.c(cwt.a));
         int $$1 = 3 + this.dQ().z.a(5) + this.dQ().z.a(5);
         btb.a((aqt)this.dQ(), this.do(), $$1);
         this.aq();
      }
   }
}
