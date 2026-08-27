import java.util.UUID;
import java.util.function.Supplier;

public class fhg extends fgz<fox.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vf v = vf.c("gui.abuseReport.skin.title");
   private final fau w = fau.d().a(8);
   private exy x;
   private exg y;
   private exg z;

   private fhg(fdb $$0, fow $$1, fox.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fhg(fdb $$0, fow $$1, UUID $$2, Supplier<gfm> $$3) {
      this($$0, $$1, new fox.a($$2, $$3, $$1.a().b()));
   }

   public fhg(fdb $$0, fow $$1, fox $$2) {
      this($$0, $$1, new fox.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.w.c().b();
      this.w.a(new eyn(this.e, this.i));
      fau $$0 = this.w.a(fau.e().a(8));
      $$0.c().e();
      $$0.a(new eyg(85, 120, this.f.aP(), this.q.e().a()));
      fau $$1 = $$0.a(fau.d().a(8));
      this.z = exg.a(c, $$0x -> this.f.a(new fhf(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.D();
         }))).a(178).a();
      $$1.a(fam.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      $$1.a(fam.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      fau $$2 = this.w.a(fau.e().a(8));
      $$2.a(exg.a(ve.k, $$0x -> this.aE_()).a(120).a());
      this.y = $$2.a(exg.a(a, $$0x -> this.n()).a(120).a());
      this.w.a($$1x -> {
         exe var10000 = this.d($$1x);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.w.a();
      fao.a(this.w, this.F());
   }

   private void D() {
      fou $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fos.b $$1 = this.q.c();
      this.y.j = $$1 == null;
      this.y.a(x.a($$1, fos.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
