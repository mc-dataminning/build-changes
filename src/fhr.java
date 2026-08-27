import java.util.UUID;
import java.util.function.Supplier;

public class fhr extends fhk<fpj.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vg v = vg.c("gui.abuseReport.skin.title");
   private final fbf w = fbf.d().a(8);
   private eyj x;
   private exr y;
   private exr z;

   private fhr(fdm $$0, fpi $$1, fpj.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fhr(fdm $$0, fpi $$1, UUID $$2, Supplier<gga> $$3) {
      this($$0, $$1, new fpj.a($$2, $$3, $$1.a().b()));
   }

   public fhr(fdm $$0, fpi $$1, fpj $$2) {
      this($$0, $$1, new fpj.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.w.c().b();
      this.w.a(new eyy(this.e, this.i));
      fbf $$0 = this.w.a(fbf.e().a(8));
      $$0.c().e();
      $$0.a(new eyr(85, 120, this.f.aP(), this.q.e().a()));
      fbf $$1 = $$0.a(fbf.d().a(8));
      this.z = exr.a(c, $$0x -> this.f.a(new fhq(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fax.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      $$1.a(fax.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      fbf $$2 = this.w.a(fbf.e().a(8));
      $$2.a(exr.a(vf.k, $$0x -> this.d()).a(120).a());
      this.y = $$2.a(exr.a(a, $$0x -> this.o()).a(120).a());
      this.w.a($$1x -> {
         exp var10000 = this.d($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.w.a();
      faz.a(this.w, this.F());
   }

   private void E() {
      fpg $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fpe.b $$1 = this.q.c();
      this.y.j = $$1 == null;
      this.y.a(x.a($$1, fpe.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
