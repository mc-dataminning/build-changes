public class bkq extends bxi {
   private static final afm<Integer> bX = afp.a(bkq.class, afo.b);

   public bkq(bkm<? extends bkq> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected jq s() {
      return js.aK;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bX, 0);
   }

   @Override
   protected aqm t() {
      return aqn.jG;
   }

   @Override
   protected aqm w() {
      return aqn.jD;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.jF;
   }

   @Override
   protected aqm m_() {
      return aqn.jE;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void c_() {
      super.c_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dL().a(js.aL, this.d(0.6), this.dt(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.an.b(bX, $$0);
   }

   public int y() {
      return this.an.b(bX);
   }

   public static boolean a(bkm<? extends bky> $$0, csh $$1, blc $$2, ht $$3, ato $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cuv.G);
   }
}
