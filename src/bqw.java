public class bqw extends cds {
   private static final ajk<Integer> cc = ajo.a(bqw.class, ajm.b);

   public bqw(bqr<? extends bqw> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected ku r() {
      return kw.aM;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   protected auy u() {
      return auz.kE;
   }

   @Override
   protected auy v() {
      return auz.kB;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.kD;
   }

   @Override
   protected auy o_() {
      return auz.kC;
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(ty $$0) {
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

      this.dN().a(kw.aN, this.d(0.6), this.dv(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
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

   public static boolean a(bqr<? extends bre> $$0, daj $$1, bri $$2, im $$3, ayd $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dcx.G);
   }
}
