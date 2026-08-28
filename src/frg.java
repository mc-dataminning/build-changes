import java.util.UUID;
import java.util.function.Supplier;

public class frg extends fqz<fzd.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final xo B = xo.c("gui.abuseReport.skin.title");
   private final fku C = fku.d().a(8);
   private fhv D;
   private fhd E;
   private fhd F;

   private frg(fnc $$0, fzc $$1, fzd.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public frg(fnc $$0, fzc $$1, UUID $$2, Supplier<gpy> $$3) {
      this($$0, $$1, new fzd.a($$2, $$3, $$1.a().b()));
   }

   public frg(fnc $$0, fzc $$1, fzd $$2) {
      this($$0, $$1, new fzd.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.C.c().b();
      this.C.a(new fik(this.l, this.p));
      fku $$0 = this.C.a(fku.e().a(8));
      $$0.c().e();
      $$0.a(new fid(85, 120, this.m.aR(), this.x.e().a()));
      fku $$1 = $$0.a(fku.d().a(8));
      this.F = fhd.a(c, $$0x -> this.m.a(new frf(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fkm.a(this.p, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      $$1.a(fkm.a(this.p, this.D, d, $$0x -> $$0x.e(12)));
      fku $$2 = this.C.a(fku.e().a(8));
      $$2.a(fhd.a(xn.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fhd.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fhb var10000 = this.c($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.C.a();
      fko.a(this.C, this.G());
   }

   private void E() {
      fza $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fyy.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fyy.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
