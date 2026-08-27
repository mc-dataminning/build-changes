public class bmd extends byx {
   private static final agm<Integer> bX = agp.a(bmd.class, ago.b);

   public bmd(blz<? extends bmd> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected jv u() {
      return jx.aM;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, 0);
   }

   @Override
   protected arr w() {
      return ars.kf;
   }

   @Override
   protected arr y() {
      return ars.kc;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.ke;
   }

   @Override
   protected arr n_() {
      return ars.kd;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.A());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void d_() {
      super.d_();
      int $$0 = this.A();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dM().a(jx.aN, this.d(0.6), this.du(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.an.b(bX, $$0);
   }

   public int A() {
      return this.an.b(bX);
   }

   public static boolean a(blz<? extends bml> $$0, cue $$1, bmp $$2, hx $$3, auv $$4) {
      return $$3.v() <= $$1.A_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cws.G);
   }
}
