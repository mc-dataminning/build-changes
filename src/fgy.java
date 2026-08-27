public class fgy extends fga {
   private final ffl a;
   private final wx b;
   private final wx c;

   public fgy(int $$0, int $$1, int $$2, int $$3, wx $$4, fga.c $$5, ffl $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xa.a($$4.f(), xu.a.c(true));
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      wx $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | ayf.f(this.l * 255.0F) << 24);
   }
}
