public class fix extends fjg {
   private static final int a = 4;
   private final boolean b;
   private final int c;

   public fix(int $$0, wz $$1, fhx $$2) {
      this($$0, $$1, $$2, 4);
   }

   public fix(int $$0, wz $$1, fhx $$2, int $$3) {
      this($$0, $$1, $$2, true, $$3);
   }

   public fix(int $$0, wz $$1, fhx $$2, boolean $$3, int $$4) {
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
   protected void a(fmi $$0) {
      $$0.a(fmh.a, this.z());
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      if (this.aO_() || this.b) {
         int $$4 = this.D() - this.c;
         int $$5 = this.E() - this.c;
         int $$6 = this.y() + this.c * 2;
         int $$7 = this.w() + this.c * 2;
         int $$8 = this.b ? (this.aO_() ? -1 : -6250336) : -1;
         $$0.a($$4 + 1, $$5, $$4 + $$6, $$5 + $$7, -16777216);
         $$0.b($$4, $$5, $$6, $$7, $$8);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(gvf $$0) {
   }
}
