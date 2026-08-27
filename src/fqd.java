import java.util.UUID;
import java.util.function.Supplier;

public class fqd extends fpw<fya.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final wx B = wx.c("gui.abuseReport.skin.title");
   private final fjq C = fjq.d().a(8);
   private fgr D;
   private ffz E;
   private ffz F;

   private fqd(fly $$0, fxz $$1, fya.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public fqd(fly $$0, fxz $$1, UUID $$2, Supplier<gov> $$3) {
      this($$0, $$1, new fya.a($$2, $$3, $$1.a().b()));
   }

   public fqd(fly $$0, fxz $$1, fya $$2) {
      this($$0, $$1, new fya.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.C.c().b();
      this.C.a(new fhg(this.l, this.p));
      fjq $$0 = this.C.a(fjq.e().a(8));
      $$0.c().e();
      $$0.a(new fgz(85, 120, this.m.aS(), this.x.e().a()));
      fjq $$1 = $$0.a(fjq.d().a(8));
      this.F = ffz.a(c, $$0x -> this.m.a(new fqc(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(fji.a(this.p, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      $$1.a(fji.a(this.p, this.D, d, $$0x -> $$0x.e(12)));
      fjq $$2 = this.C.a(fjq.e().a(8));
      $$2.a(ffz.a(ww.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(ffz.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         ffx var10000 = this.c($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.C.a();
      fjk.a(this.C, this.G());
   }

   private void C() {
      fxx $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fxv.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fxv.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
