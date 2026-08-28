import java.util.UUID;

public class frd extends fqz<fyx.a> {
   private static final int y = 120;
   private static final xo z = xo.c("gui.abuseReport.name.title");
   private final fku A = fku.d().a(8);
   private fhv B;
   private fhd C;

   private frd(fnc $$0, fzc $$1, fyx.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frd(fnc $$0, fzc $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fyx.a($$2, $$3, $$1.a().b()));
   }

   public frd(fnc $$0, fzc $$1, fyx $$2) {
      this($$0, $$1, new fyx.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.A.c().b();
      this.A.a(new fik(this.l, this.p));
      xo $$0 = xo.b(this.x.e().a()).a(n.o);
      this.A.a(new fik(xo.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      this.A.a(fkm.a(this.p, this.B, d, $$0x -> $$0x.e(12)));
      fku $$1 = this.A.a(fku.e().a(8));
      $$1.a(fhd.a(xn.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fhd.a(a, $$0x -> this.m()).a(120).a());
      this.E();
      this.A.a($$1x -> {
         fhb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fko.a(this.A, this.G());
   }

   private void E() {
      fyy.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fyy.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
