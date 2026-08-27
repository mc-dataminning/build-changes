public class bld extends bxv {
   private static final afs<Integer> bX = afv.a(bld.class, afu.b);

   public bld(bkz<? extends bld> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected ju u() {
      return jw.aK;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, 0);
   }

   @Override
   protected aqu w() {
      return aqv.jW;
   }

   @Override
   protected aqu y() {
      return aqv.jT;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.jV;
   }

   @Override
   protected aqu n_() {
      return aqv.jU;
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.A());
   }

   @Override
   public void a(sd $$0) {
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

      this.dN().a(jw.aL, this.d(0.6), this.dv(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
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

   public static boolean a(bkz<? extends bll> $$0, csu $$1, blp $$2, hx $$3, atw $$4) {
      return $$3.v() <= $$1.A_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cvh.G);
   }
}
