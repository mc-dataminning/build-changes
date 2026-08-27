public class bkb extends bwt {
   private static final afc<Integer> bX = aff.a(bkb.class, afe.b);

   public bkb(bjx<? extends bkb> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected jq s() {
      return js.aJ;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bX, 0);
   }

   @Override
   protected aqc t() {
      return aqd.jE;
   }

   @Override
   protected aqc w() {
      return aqd.jB;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.jD;
   }

   @Override
   protected aqc m_() {
      return aqd.jC;
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(rt $$0) {
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

      this.dL().a(js.aK, this.d(0.6), this.dt(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bir $$0, float $$1) {
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

   public static boolean a(bjx<? extends bkj> $$0, cro $$1, bkn $$2, ht $$3, ate $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cuc.G);
   }
}
