public class etb extends etk {
   private static final int a = 1426063360;
   private static final int b = 4;
   private final boolean c;

   public etb(int $$0, tm $$1, esd $$2) {
      this($$0, $$1, $$2, true);
   }

   public etb(int $$0, tm $$1, esd $$2, boolean $$3) {
      super($$1, $$2);
      this.j($$0);
      this.b(true);
      this.i = true;
      this.c = $$3;
   }

   @Override
   protected void a(ewi $$0) {
      $$0.a(ewh.a, this.m());
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      if (this.aD_() || this.c) {
         int $$4 = this.r() - 4;
         int $$5 = this.t() - 4;
         int $$6 = this.l() + 8;
         int $$7 = this.i() + 8;
         int $$8 = this.c ? (this.aD_() ? -1 : -6250336) : -1;
         $$0.a($$4 + 1, $$5, $$4 + $$6, $$5 + $$7, 1426063360);
         $$0.b($$4, $$5, $$6, $$7, $$8);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(gdq $$0) {
   }
}
