import java.util.UUID;

public class fny extends fnu<fvt.a> {
   private static final int v = 120;
   private static final wi w = wi.c("gui.abuseReport.name.title");
   private final fhp x = fhp.d().a(8);
   private feq y;
   private fdy z;

   private fny(fjx $$0, fvy $$1, fvt.a $$2) {
      super(w, $$0, $$1, $$2);
   }

   public fny(fjx $$0, fvy $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fvt.a($$2, $$3, $$1.a().b()));
   }

   public fny(fjx $$0, fvy $$1, fvt $$2) {
      this($$0, $$1, new fvt.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.x.c().b();
      this.x.a(new fff(this.i, this.m));
      wi $$0 = wi.b(this.u.e().a()).a(n.o);
      this.x.a(new fff(wi.a("gui.abuseReport.name.reporting", $$0), this.m), $$0x -> $$0x.a().a(0, 8));
      this.y = this.a(280, 9 * 8, $$0x -> {
         this.u.a($$0x);
         this.C();
      });
      this.x.a(fhh.a(this.m, this.y, d, $$0x -> $$0x.e(12)));
      fhp $$1 = this.x.a(fhp.e().a(8));
      $$1.a(fdy.a(wh.k, $$0x -> this.d()).a(120).a());
      this.z = $$1.a(fdy.a(a, $$0x -> this.m()).a(120).a());
      this.C();
      this.x.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fhj.a(this.x, this.G());
   }

   private void C() {
      fvu.b $$0 = this.u.c();
      this.z.j = $$0 == null;
      this.z.a(x.a($$0, fvu.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.y.b($$0, $$1, $$2);
   }
}
