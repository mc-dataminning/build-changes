public class fni extends fmx<cpc> implements foc<cpc> {
   private static final akn D = new akn("textures/gui/container/generic_54.png");
   private final int E;

   public fni(cpc $$0, clx $$1, wx $$2) {
      super($$0, $$1, $$2);
      int $$3 = 222;
      int $$4 = 114;
      this.E = $$0.m();
      this.d = 114 + this.E * 18;
      this.v = this.d - 94;
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ffn $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.E * 18 + 17);
      $$0.a(D, $$4, $$5 + this.E * 18 + 17, 0, 126, this.c, 96);
   }
}
