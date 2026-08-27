public class bja extends bvs {
   private static final aeg<Integer> bX = aej.a(bja.class, aei.b);

   public bja(biw<? extends bja> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected iv s() {
      return ix.aJ;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
   }

   @Override
   protected ape t() {
      return apf.jC;
   }

   @Override
   protected ape w() {
      return apf.jz;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.jB;
   }

   @Override
   protected ape l_() {
      return apf.jA;
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void b_() {
      super.b_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dL().a(ix.aK, this.d(0.6), this.dt(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
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

   public static boolean a(biw<? extends bji> $$0, cqm $$1, bjm $$2, gw $$3, ase $$4) {
      return $$3.v() <= $$1.y_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(csy.G);
   }
}
