public class fqy extends fpn<cqv> {
   private static final akt D = new akt("textures/gui/container/potato_refinery.png");
   private static final akt E = new akt("container/potato_refinery/lit_progress");
   private static final akt F = new akt("container/potato_refinery/burn_progress");
   private boolean G;
   private final akt H;
   private final akt I;
   private final akt J;

   public fqy(cqv $$0, clx $$1, xe $$2) {
      super($$0, $$1, $$2);
      this.d += 20;
      this.v += 20;
      this.H = D;
      this.I = E;
      this.J = F;
   }

   @Override
   public void aN_() {
      super.aN_();
      this.G = this.n < 379;
      this.r = (this.c - this.p.a(this.l)) / 2;
   }

   @Override
   public void C() {
      super.C();
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fia $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      $$0.a(this.H, $$4, $$5, 0, 0, this.c, this.d);
      if (this.w.s()) {
         int $$6 = 17;
         int $$7 = 12;
         int $$8 = aym.f(this.w.r() * 11.0F) + 1;
         $$0.a(this.I, 17, 12, 0, 12 - $$8, $$4 + 51, $$5 + 54 + 12 - $$8, 17, $$8);
      }

      int $$9 = 46;
      int $$10 = aym.f(this.w.q() * 46.0F);
      $$0.a(this.J, 46, 16, 0, 0, $$4 + 69, $$5 + 18, $$10, 16);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void a(cre $$0, int $$1, int $$2, cpp $$3) {
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return super.a($$0, $$1);
   }
}
