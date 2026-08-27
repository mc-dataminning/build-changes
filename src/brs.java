public class brs extends ceo {
   private static final ajm<Integer> cc = ajq.a(brs.class, ajo.b);

   public brs(brn<? extends brs> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected kv r() {
      return kx.aM;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   protected avb u() {
      return avc.kE;
   }

   @Override
   protected avb v() {
      return avc.kB;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.kD;
   }

   @Override
   protected avb o_() {
      return avc.kC;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(ua $$0) {
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

      this.dN().a(kx.aN, this.d(0.6), this.dv(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
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

   public static boolean a(brn<? extends bsa> $$0, das $$1, bse $$2, in $$3, ayg $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(ddg.G);
   }
}
