public class biy extends bvq {
   private static final aee<Integer> bX = aeh.a(biy.class, aeg.b);

   public biy(biu<? extends biy> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected it s() {
      return iv.aJ;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
   }

   @Override
   protected apc t() {
      return apd.jC;
   }

   @Override
   protected apc w() {
      return apd.jz;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.jB;
   }

   @Override
   protected apc l_() {
      return apd.jA;
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(qw $$0) {
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

      this.dL().a(iv.aK, this.d(0.6), this.dt(), this.g(0.6), 0.0, 0.0, 0.0);
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
