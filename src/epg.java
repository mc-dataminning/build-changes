public class epg extends eqa {
   private static final int a = -1;
   private static final int b = -6250336;
   private static final int c = 1426063360;
   private static final int d = 3;
   private static final int e = 1;

   public epg(eov $$0, sw $$1, int $$2) {
      super($$1, $$0);
      this.i($$2);
      this.b(true);
      this.r = true;
   }

   @Override
   protected void a(esp $$0) {
      $$0.a(eso.a, this.l());
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.p() - 3;
      int $$5 = this.r() - 3;
      int $$6 = this.p() + this.k() + 3;
      int $$7 = this.r() + this.h() + 3;
      int $$8 = this.aB_() ? -1 : -6250336;
      $$0.a($$4 - 1, $$5 - 1, $$4, $$7 + 1, $$8);
      $$0.a($$6, $$5 - 1, $$6 + 1, $$7 + 1, $$8);
      $$0.a($$4, $$5, $$6, $$5 - 1, $$8);
      $$0.a($$4, $$7, $$6, $$7 + 1, $$8);
      $$0.a($$4, $$5, $$6, $$7, 1426063360);
      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fzc $$0) {
   }
}
