import java.util.UUID;
import java.util.function.Supplier;

public class fhf extends fgy<fow.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vf v = vf.c("gui.abuseReport.skin.title");
   private final fat w = fat.d().a(8);
   private exx x;
   private exf y;
   private exf z;

   private fhf(fda $$0, fov $$1, fow.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fhf(fda $$0, fov $$1, UUID $$2, Supplier<gfl> $$3) {
      this($$0, $$1, new fow.a($$2, $$3, $$1.a().b()));
   }

   public fhf(fda $$0, fov $$1, fow $$2) {
      this($$0, $$1, new fow.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.w.c().b();
      this.w.a(new eym(this.e, this.i));
      fat $$0 = this.w.a(fat.e().a(8));
      $$0.c().e();
      $$0.a(new eyf(85, 120, this.f.aP(), this.q.e().a()));
      fat $$1 = $$0.a(fat.d().a(8));
      this.z = exf.a(c, $$0x -> this.f.a(new fhe(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.D();
         }))).a(178).a();
      $$1.a(fal.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      $$1.a(fal.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      fat $$2 = this.w.a(fat.e().a(8));
      $$2.a(exf.a(ve.k, $$0x -> this.aE_()).a(120).a());
      this.y = $$2.a(exf.a(a, $$0x -> this.n()).a(120).a());
      this.w.a($$1x -> {
         exd var10000 = this.d($$1x);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.w.a();
      fan.a(this.w, this.F());
   }

   private void D() {
      fot $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      foq.b $$1 = this.q.c();
      this.y.j = $$1 == null;
      this.y.a(x.a($$1, foq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
