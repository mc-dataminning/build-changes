public class flg extends fkv<cnd> implements fma<cnd> {
   private static final ajv A = new ajv("textures/gui/container/generic_54.png");
   private final int B;

   public flg(cnd $$0, cjz $$1, wi $$2) {
      super($$0, $$1, $$2);
      int $$3 = 222;
      int $$4 = 114;
      this.B = $$0.m();
      this.d = 114 + this.B * 18;
      this.r = this.d - 94;
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
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.B * 18 + 17);
      $$0.a(A, $$4, $$5 + this.B * 18 + 17, 0, 126, this.c, 96);
   }
}
