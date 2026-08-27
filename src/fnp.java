import java.util.UUID;

public class fnp extends fnl<fvk.a> {
   private static final int v = 120;
   private static final wg w = wg.c("gui.abuseReport.name.title");
   private final fhg x = fhg.d().a(8);
   private feh y;
   private fdp z;

   private fnp(fjo $$0, fvp $$1, fvk.a $$2) {
      super(w, $$0, $$1, $$2);
   }

   public fnp(fjo $$0, fvp $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fvk.a($$2, $$3, $$1.a().b()));
   }

   public fnp(fjo $$0, fvp $$1, fvk $$2) {
      this($$0, $$1, new fvk.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.x.c().b();
      this.x.a(new few(this.i, this.m));
      wg $$0 = wg.b(this.u.e().a()).a(n.o);
      this.x.a(new few(wg.a("gui.abuseReport.name.reporting", $$0), this.m), $$0x -> $$0x.a().a(0, 8));
      this.y = this.a(280, 9 * 8, $$0x -> {
         this.u.a($$0x);
         this.C();
      });
      this.x.a(fgy.a(this.m, this.y, d, $$0x -> $$0x.e(12)));
      fhg $$1 = this.x.a(fhg.e().a(8));
      $$1.a(fdp.a(wf.k, $$0x -> this.d()).a(120).a());
      this.z = $$1.a(fdp.a(a, $$0x -> this.m()).a(120).a());
      this.C();
      this.x.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fha.a(this.x, this.G());
   }

   private void C() {
      fvl.b $$0 = this.u.c();
      this.z.j = $$0 == null;
      this.z.a(x.a($$0, fvl.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.y.b($$0, $$1, $$2);
   }
}
