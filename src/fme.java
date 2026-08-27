public class fme extends fkv<cop> {
   private static final ajv A = new ajv("textures/gui/container/shulker_box.png");

   public fme(cop $$0, cjz $$1, wi $$2) {
      super($$0, $$1, $$2);
      this.d++;
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fdl $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.d);
   }
}
