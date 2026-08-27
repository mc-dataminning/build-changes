import java.util.UUID;
import java.util.function.Supplier;

public class fjj extends fjc<frc.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vq v = vq.c("gui.abuseReport.skin.title");
   private final fcx w = fcx.d().a(8);
   private ezz x;
   private ezh y;
   private ezh z;

   private fjj(ffe $$0, frb $$1, frc.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fjj(ffe $$0, frb $$1, UUID $$2, Supplier<ghs> $$3) {
      this($$0, $$1, new frc.a($$2, $$3, $$1.a().b()));
   }

   public fjj(ffe $$0, frb $$1, frc $$2) {
      this($$0, $$1, new frc.a($$2, $$1.a().b()));
   }

   @Override
   protected void aQ_() {
      this.w.c().b();
      this.w.a(new fao(this.e, this.i));
      fcx $$0 = this.w.a(fcx.e().a(8));
      $$0.c().e();
      $$0.a(new fah(85, 120, this.f.aP(), this.q.e().a()));
      fcx $$1 = $$0.a(fcx.d().a(8));
      this.z = ezh.a(c, $$0x -> this.f.a(new fji(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fcp.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      $$1.a(fcp.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      fcx $$2 = this.w.a(fcx.e().a(8));
      $$2.a(ezh.a(vp.k, $$0x -> this.d()).a(120).a());
      this.y = $$2.a(ezh.a(a, $$0x -> this.o()).a(120).a());
      this.w.a($$1x -> {
         ezf var10000 = this.d($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.w.a();
      fcr.a(this.w, this.F());
   }

   private void E() {
      fqz $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fqx.b $$1 = this.q.c();
      this.y.j = $$1 == null;
      this.y.a(x.a($$1, fqx.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
