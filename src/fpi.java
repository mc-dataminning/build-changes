import java.util.UUID;
import java.util.function.Supplier;

public class fpi extends fpb<fxf.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final wu B = wu.c("gui.abuseReport.skin.title");
   private final fiv C = fiv.d().a(8);
   private ffw D;
   private ffe E;
   private ffe F;

   private fpi(fld $$0, fxe $$1, fxf.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public fpi(fld $$0, fxe $$1, UUID $$2, Supplier<gny> $$3) {
      this($$0, $$1, new fxf.a($$2, $$3, $$1.a().b()));
   }

   public fpi(fld $$0, fxe $$1, fxf $$2) {
      this($$0, $$1, new fxf.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.C.c().b();
      this.C.a(new fgl(this.l, this.p));
      fiv $$0 = this.C.a(fiv.e().a(8));
      $$0.c().e();
      $$0.a(new fge(85, 120, this.m.aS(), this.x.e().a()));
      fiv $$1 = $$0.a(fiv.d().a(8));
      this.F = ffe.a(c, $$0x -> this.m.a(new fph(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(fin.a(this.p, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      $$1.a(fin.a(this.p, this.D, d, $$0x -> $$0x.e(12)));
      fiv $$2 = this.C.a(fiv.e().a(8));
      $$2.a(ffe.a(wt.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(ffe.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.C.a();
      fip.a(this.C, this.G());
   }

   private void C() {
      fxc $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fxa.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fxa.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
