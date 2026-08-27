import java.util.UUID;
import java.util.function.Supplier;

public class fsw extends fsp<gaw.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final xe B = xe.c("gui.abuseReport.skin.title");
   private final fme C = fme.d().a(8);
   private fjf D;
   private fin E;
   private fin F;

   private fsw(fon $$0, gav $$1, gaw.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public fsw(fon $$0, gav $$1, UUID $$2, Supplier<gry> $$3) {
      this($$0, $$1, new gaw.a($$2, $$3, $$1.a().b()));
   }

   public fsw(fon $$0, gav $$1, gaw $$2) {
      this($$0, $$1, new gaw.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.C.c().b();
      this.C.a(new fju(this.l, this.p));
      fme $$0 = this.C.a(fme.e().a(8));
      $$0.c().e();
      $$0.a(new fjn(85, 120, this.m.aS(), this.x.e().a()));
      fme $$1 = $$0.a(fme.d().a(8));
      this.F = fin.a(c, $$0x -> this.m.a(new fsv(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(flw.a(this.p, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      $$1.a(flw.a(this.p, this.D, d, $$0x -> $$0x.e(12)));
      fme $$2 = this.C.a(fme.e().a(8));
      $$2.a(fin.a(xd.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fin.a(a, $$0x -> this.B()).a(120).a());
      this.C.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.C.a();
      fly.a(this.C, this.G());
   }

   private void C() {
      gat $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      gar.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(y.a($$1, gar.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
