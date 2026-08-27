public class biy extends bvq {
   private static final aef<Integer> bX = aei.a(biy.class, aeh.b);

   public biy(biu<? extends biy> $$0, cpv $$1) {
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
   protected apd t() {
      return ape.jC;
   }

   @Override
   protected apd w() {
      return ape.jz;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.jB;
   }

   @Override
   protected apd l_() {
      return ape.jA;
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(qx $$0) {
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
   public boolean a(bho $$0, float $$1) {
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

   public static boolean a(biu<? extends bjg> $$0, cqk $$1, bjk $$2, gw $$3, asc $$4) {
      return $$3.v() <= $$1.y_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(csw.G);
   }
}
