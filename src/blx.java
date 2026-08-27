public class blx extends byr {
   private static final agj<Integer> bX = agm.a(blx.class, agl.b);

   public blx(blt<? extends blx> $$0, cti $$1) {
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
   protected arl w() {
      return arm.kf;
   }

   @Override
   protected arl y() {
      return arm.kc;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.ke;
   }

   @Override
   protected arl n_() {
      return arm.kd;
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.A());
   }

   @Override
   public void a(sl $$0) {
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
   public boolean a(bkn $$0, float $$1) {
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

   public static boolean a(blt<? extends bmf> $$0, ctx $$1, bmj $$2, hx $$3, aup $$4) {
      return $$3.v() <= $$1.A_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cwl.G);
   }
}
