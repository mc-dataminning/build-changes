import java.util.UUID;

public class fqa extends fpw<fxu.a> {
   private static final int y = 120;
   private static final wx z = wx.c("gui.abuseReport.name.title");
   private final fjr A = fjr.d().a(8);
   private fgs B;
   private fga C;

   private fqa(flz $$0, fxz $$1, fxu.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fqa(flz $$0, fxz $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fxu.a($$2, $$3, $$1.a().b()));
   }

   public fqa(flz $$0, fxz $$1, fxu $$2) {
      this($$0, $$1, new fxu.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.A.c().b();
      this.A.a(new fhh(this.l, this.p));
      wx $$0 = wx.b(this.x.e().a()).a(n.o);
      this.A.a(new fhh(wx.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.A.a(fjj.a(this.p, this.B, d, $$0x -> $$0x.e(12)));
      fjr $$1 = this.A.a(fjr.e().a(8));
      $$1.a(fga.a(ww.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fga.a(a, $$0x -> this.m()).a(120).a());
      this.C();
      this.A.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fjl.a(this.A, this.G());
   }

   private void C() {
      fxv.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fxv.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
