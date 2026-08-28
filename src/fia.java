public class fia extends fhc {
   private final fgn a;
   private final xo b;
   private final xo c;

   public fia(int $$0, int $$1, int $$2, int $$3, xo $$4, fhc.c $$5, fgn $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xr.a($$4.f(), yl.a.c(true));
   }

   @Override
   public void b(fgp $$0, int $$1, int $$2, float $$3) {
      xo $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | ayx.f(this.l * 255.0F) << 24);
   }
}
