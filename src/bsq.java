public class bsq extends cfn {
   private static final ajp<Integer> ce = ajt.a(bsq.class, ajr.b);

   public bsq(bsj<? extends bsq> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected lh s() {
      return lj.aP;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
   }

   @Override
   protected ave u() {
      return avf.kJ;
   }

   @Override
   protected ave v() {
      return avf.kG;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.kI;
   }

   @Override
   protected ave o_() {
      return avf.kH;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void n_() {
      super.n_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dP().a(lj.aQ, this.d(0.6), this.dx(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.ao.a(ce, $$0);
   }

   public int y() {
      return this.ao.a(ce);
   }

   public static boolean a(bsj<? extends bsy> $$0, dcs $$1, btc $$2, ja $$3, aym $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dfh.G);
   }
}
