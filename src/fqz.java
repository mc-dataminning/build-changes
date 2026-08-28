import java.util.UUID;

public class fqz extends fqv<fyt.a> {
   private static final int y = 120;
   private static final xl z = xl.c("gui.abuseReport.name.title");
   private final fkq A = fkq.d().a(8);
   private fhr B;
   private fgz C;

   private fqz(fmy $$0, fyy $$1, fyt.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fqz(fmy $$0, fyy $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fyt.a($$2, $$3, $$1.a().b()));
   }

   public fqz(fmy $$0, fyy $$1, fyt $$2) {
      this($$0, $$1, new fyt.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.A.c().b();
      this.A.a(new fig(this.l, this.p));
      xl $$0 = xl.b(this.x.e().a()).a(n.o);
      this.A.a(new fig(xl.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.A.a(fki.a(this.p, this.B, d, $$0x -> $$0x.e(12)));
      fkq $$1 = this.A.a(fkq.e().a(8));
      $$1.a(fgz.a(xk.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fgz.a(a, $$0x -> this.m()).a(120).a());
      this.C();
      this.A.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fkk.a(this.A, this.G());
   }

   private void C() {
      fyu.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fyu.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
