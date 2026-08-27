public class bsi extends cff {
   private static final ajs<Integer> cc = ajw.a(bsi.class, aju.b);

   public bsi(bsc<? extends bsi> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected kw s() {
      return ky.aP;
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   protected avh u() {
      return avi.kJ;
   }

   @Override
   protected avh v() {
      return avi.kG;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.kI;
   }

   @Override
   protected avh o_() {
      return avi.kH;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(ud $$0) {
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

      this.dP().a(ky.aQ, this.d(0.6), this.dx(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
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

   public static boolean a(bsc<? extends bsq> $$0, dbo $$1, bsu $$2, io $$3, aym $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dec.G);
   }
}
