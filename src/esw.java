public class esw extends etf {
   private static final int a = 1426063360;
   private static final int b = 4;
   private final boolean c;

   public esw(int $$0, ti $$1, ery $$2) {
      this($$0, $$1, $$2, true);
   }

   public esw(int $$0, ti $$1, ery $$2, boolean $$3) {
      super($$1, $$2);
      this.j($$0);
      this.b(true);
      this.i = true;
      this.c = $$3;
   }

   @Override
   protected void a(ewd $$0) {
      $$0.a(ewc.a, this.m());
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      if (this.ay_() || this.c) {
         int $$4 = this.r() - 4;
         int $$5 = this.t() - 4;
         int $$6 = this.l() + 8;
         int $$7 = this.i() + 8;
         int $$8 = this.c ? (this.ay_() ? -1 : -6250336) : -1;
         $$0.a($$4 + 1, $$5, $$4 + $$6, $$5 + $$7, 1426063360);
         $$0.b($$4, $$5, $$6, $$7, $$8);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(gdl $$0) {
   }
}
