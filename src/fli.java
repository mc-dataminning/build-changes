public class fli extends fkm<cnn> {
   private static final ajt A = new ajt("container/grindstone/error");
   private static final ajt B = new ajt("textures/gui/container/grindstone.png");

   public fli(cnn $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(B, $$4, $$5, 0, 0, this.c, this.d);
      if ((this.s.b(0).h() || this.s.b(1).h()) && !this.s.b(2).h()) {
         $$0.a(A, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}
