public class foj extends fny<cpp> implements fpe<cpp> {
   private static final akk D = new akk("textures/gui/container/generic_54.png");
   private final int E;

   public foj(cpp $$0, cmj $$1, wu $$2) {
      super($$0, $$1, $$2);
      int $$3 = 222;
      int $$4 = 114;
      this.E = $$0.m();
      this.q = 114 + this.E * 18;
      this.v = this.q - 94;
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fhf $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.E * 18 + 17);
      $$0.a(D, $$4, $$5 + this.E * 18 + 17, 0, 126, this.c, 96);
   }
}
