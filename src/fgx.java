public class fgx extends ffz {
   private final ffk a;
   private final wx b;
   private final wx c;

   public fgx(int $$0, int $$1, int $$2, int $$3, wx $$4, ffz.c $$5, ffk $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xa.a($$4.f(), xu.a.c(true));
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      wx $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | ayd.f(this.l * 255.0F) << 24);
   }
}
