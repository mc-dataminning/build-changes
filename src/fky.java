public class fky extends fka {
   private final fjl a;
   private final xd b;
   private final xd c;

   public fky(int $$0, int $$1, int $$2, int $$3, xd $$4, fka.c $$5, fjl $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xg.a($$4.f(), ya.a.c(true));
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      xd $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | azc.f(this.l * 255.0F) << 24);
   }
}
