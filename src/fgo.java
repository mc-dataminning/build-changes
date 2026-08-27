public class fgo extends fgd<cki> implements fhi<cki> {
   private static final aiy x = new aiy("textures/gui/container/generic_54.png");
   private final int y;

   public fgo(cki $$0, chg $$1, vq $$2) {
      super($$0, $$1, $$2);
      int $$3 = 222;
      int $$4 = 114;
      this.y = $$0.m();
      this.k = 114 + this.y * 18;
      this.o = this.k - 94;
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eyu $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.y * 18 + 17);
      $$0.a(x, $$4, $$5 + this.y * 18 + 17, 0, 126, this.c, 96);
   }
}
