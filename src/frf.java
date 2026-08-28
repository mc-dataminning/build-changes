import java.util.UUID;

public class frf extends frb<fyz.a> {
   private static final int y = 120;
   private static final xp z = xp.c("gui.abuseReport.name.title");
   private final fkw A = fkw.d().a(8);
   private fhx B;
   private fhf C;

   private frf(fne $$0, fze $$1, fyz.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frf(fne $$0, fze $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fyz.a($$2, $$3, $$1.a().b()));
   }

   public frf(fne $$0, fze $$1, fyz $$2) {
      this($$0, $$1, new fyz.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.A.c().b();
      this.A.a(new fim(this.l, this.p));
      xp $$0 = xp.b(this.x.e().a()).a(n.o);
      this.A.a(new fim(xp.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      this.A.a(fko.a(this.p, this.B, d, $$0x -> $$0x.e(12)));
      fkw $$1 = this.A.a(fkw.e().a(8));
      $$1.a(fhf.a(xo.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fhf.a(a, $$0x -> this.m()).a(120).a());
      this.E();
      this.A.a($$1x -> {
         fhd var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fkq.a(this.A, this.G());
   }

   private void E() {
      fza.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fza.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
