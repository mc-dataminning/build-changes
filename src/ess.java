public class ess extends etb {
   private static final int a = 1426063360;
   private static final int b = 4;
   private final boolean c;

   public ess(int $$0, tf $$1, eru $$2) {
      this($$0, $$1, $$2, true);
   }

   public ess(int $$0, tf $$1, eru $$2, boolean $$3) {
      super($$1, $$2);
      this.i($$0);
      this.b(true);
      this.i = true;
      this.c = $$3;
   }

   @Override
   protected void a(evx $$0) {
      $$0.a(evw.a, this.l());
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      if (this.ax_() || this.c) {
         int $$4 = this.p() - 4;
         int $$5 = this.r() - 4;
         int $$6 = this.k() + 8;
         int $$7 = this.h() + 8;
         int $$8 = this.c ? (this.ax_() ? -1 : -6250336) : -1;
         $$0.a($$4 + 1, $$5, $$4 + $$6, $$5 + $$7, 1426063360);
         $$0.b($$4, $$5, $$6, $$7, $$8);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(gcx $$0) {
   }
}
