public class fox extends fny {
   private final fnj a;
   private final xk b;
   private final xk c;

   public fox(int $$0, int $$1, int $$2, int $$3, xk $$4, fny.c $$5, fnj $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xn.a($$4.f(), yh.a.c(true));
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      xk $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | azu.f(this.l * 255.0F) << 24);
   }
}
