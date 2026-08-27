public class exr extends eya {
   private static final int a = 1426063360;
   private static final int b = 4;
   private final boolean c;

   public exr(int $$0, vf $$1, ews $$2) {
      this($$0, $$1, $$2, true);
   }

   public exr(int $$0, vf $$1, ews $$2, boolean $$3) {
      super($$1, $$2);
      this.c($$0);
      this.b(true);
      this.j = true;
      this.c = $$3;
   }

   @Override
   protected void a(faz $$0) {
      $$0.a(fay.a, this.x());
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      if (this.aI_() || this.c) {
         int $$4 = this.B() - 4;
         int $$5 = this.C() - 4;
         int $$6 = this.w() + 8;
         int $$7 = this.u() + 8;
         int $$8 = this.c ? (this.aI_() ? -1 : -6250336) : -1;
         $$0.a($$4 + 1, $$5, $$4 + $$6, $$5 + $$7, 1426063360);
         $$0.b($$4, $$5, $$6, $$7, $$8);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(gje $$0) {
   }
}
