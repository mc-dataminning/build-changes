import java.util.UUID;

public class frg extends frc<fza.a> {
   private static final int y = 120;
   private static final xp z = xp.c("gui.abuseReport.name.title");
   private final fkx A = fkx.d().a(8);
   private fhy B;
   private fhg C;

   private frg(fnf $$0, fzf $$1, fza.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frg(fnf $$0, fzf $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fza.a($$2, $$3, $$1.a().b()));
   }

   public frg(fnf $$0, fzf $$1, fza $$2) {
      this($$0, $$1, new fza.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.A.c().b();
      this.A.a(new fin(this.l, this.p));
      xp $$0 = xp.b(this.x.e().a()).a(n.o);
      this.A.a(new fin(xp.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      this.A.a(fkp.a(this.p, this.B, d, $$0x -> $$0x.e(12)));
      fkx $$1 = this.A.a(fkx.e().a(8));
      $$1.a(fhg.a(xo.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fhg.a(a, $$0x -> this.m()).a(120).a());
      this.E();
      this.A.a($$1x -> {
         fhe var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fkr.a(this.A, this.G());
   }

   private void E() {
      fzb.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fzb.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
