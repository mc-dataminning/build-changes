import java.util.UUID;

public class fst extends fsp<gaq.a> {
   private static final int y = 120;
   private static final xe z = xe.c("gui.abuseReport.name.title");
   private final fme A = fme.d().a(8);
   private fjf B;
   private fin C;

   private fst(fon $$0, gav $$1, gaq.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fst(fon $$0, gav $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gaq.a($$2, $$3, $$1.a().b()));
   }

   public fst(fon $$0, gav $$1, gaq $$2) {
      this($$0, $$1, new gaq.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.A.c().b();
      this.A.a(new fju(this.l, this.p));
      xe $$0 = xe.b(this.x.e().a()).a(n.o);
      this.A.a(new fju(xe.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.A.a(flw.a(this.p, this.B, d, $$0x -> $$0x.e(12)));
      fme $$1 = this.A.a(fme.e().a(8));
      $$1.a(fin.a(xd.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fin.a(a, $$0x -> this.B()).a(120).a());
      this.C();
      this.A.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fly.a(this.A, this.G());
   }

   private void C() {
      gar.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(y.a($$0, gar.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
