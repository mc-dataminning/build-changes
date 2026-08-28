public class btc extends cfz {
   private static final akg<Integer> cc = akk.a(btc.class, aki.b);

   public btc(bsv<? extends btc> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected lh s() {
      return lj.aP;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   protected avv u() {
      return avw.kJ;
   }

   @Override
   protected avv v() {
      return avw.kG;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.kI;
   }

   @Override
   protected avv o_() {
      return avw.kH;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(ur $$0) {
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
   public boolean a(bri $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.ao.a(cc, $$0);
   }

   public int y() {
      return this.ao.a(cc);
   }

   public static boolean a(bsv<? extends btk> $$0, dci $$1, bto $$2, iz $$3, azc $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dew.G);
   }
}
