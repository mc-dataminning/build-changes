public class flx extends fkz {
   private final fkk a;
   private final xh b;
   private final xh c;

   public flx(int $$0, int $$1, int $$2, int $$3, xh $$4, fkz.c $$5, fkk $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xk.a($$4.f(), ye.a.c(true));
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      xh $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | azj.f(this.l * 255.0F) << 24);
   }
}
