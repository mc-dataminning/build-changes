public class fff extends ffo {
   private static final int a = 4;
   private final boolean b;
   private final int c;

   public fff(int $$0, ws $$1, fef $$2) {
      this($$0, $$1, $$2, 4);
   }

   public fff(int $$0, ws $$1, fef $$2, int $$3) {
      this($$0, $$1, $$2, true, $$3);
   }

   public fff(int $$0, ws $$1, fef $$2, boolean $$3, int $$4) {
      super($$1, $$2);
      this.d($$0);
      this.b(true);
      this.j = true;
      this.b = $$3;
      this.c = $$4;
   }

   public void b(int $$0) {
      this.d($$0 - this.c * 4);
   }

   @Override
   protected void a(fiq $$0) {
      $$0.a(fip.a, this.y());
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      if (this.aI_() || this.b) {
         int $$4 = this.C() - this.c;
         int $$5 = this.D() - this.c;
         int $$6 = this.x() + this.c * 2;
         int $$7 = this.v() + this.c * 2;
         int $$8 = this.b ? (this.aI_() ? -1 : -6250336) : -1;
         $$0.a($$4 + 1, $$5, $$4 + $$6, $$5 + $$7, -16777216);
         $$0.b($$4, $$5, $$6, $$7, $$8);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(grf $$0) {
   }
}
