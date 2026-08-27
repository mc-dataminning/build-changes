public class ews extends exb {
   private static final int a = 1426063360;
   private static final int b = 4;
   private final boolean c;

   public ews(int $$0, vb $$1, evu $$2) {
      this($$0, $$1, $$2, true);
   }

   public ews(int $$0, vb $$1, evu $$2, boolean $$3) {
      super($$1, $$2);
      this.j($$0);
      this.b(true);
      this.i = true;
      this.c = $$3;
   }

   @Override
   protected void a(faa $$0) {
      $$0.a(ezz.a, this.l());
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      if (this.aJ_() || this.c) {
         int $$4 = this.p() - 4;
         int $$5 = this.r() - 4;
         int $$6 = this.k() + 8;
         int $$7 = this.i() + 8;
         int $$8 = this.c ? (this.aJ_() ? -1 : -6250336) : -1;
         $$0.a($$4 + 1, $$5, $$4 + $$6, $$5 + $$7, 1426063360);
         $$0.b($$4, $$5, $$6, $$7, $$8);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(gia $$0) {
   }
}
