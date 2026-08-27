public class bit extends bvl {
   private static final aec<Integer> bX = aef.a(bit.class, aee.b);

   public bit(bip<? extends bit> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected iv p() {
      return ix.aJ;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
   }

   @Override
   protected aoy q() {
      return aoz.jC;
   }

   @Override
   protected aoy r() {
      return aoz.jz;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.jB;
   }

   @Override
   protected aoy h_() {
      return aoz.jA;
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.t());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void b_() {
      super.b_();
      int $$0 = this.t();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dK().a(ix.aK, this.d(0.6), this.ds(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.an.b(bX, $$0);
   }

   public int t() {
      return this.an.b(bX);
   }

   public static boolean a(bip<? extends bjb> $$0, cqf $$1, bjf $$2, gw $$3, arx $$4) {
      return $$3.v() <= $$1.t_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(csr.G);
   }
}
