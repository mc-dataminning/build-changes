import java.util.UUID;

public class fhc extends fgy<fop.a> {
   private static final int r = 120;
   private static final vf t = vf.c("gui.abuseReport.name.title");
   private final fat u = fat.d().a(8);
   private exx v;
   private exf w;

   private fhc(fda $$0, fov $$1, fop.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fhc(fda $$0, fov $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fop.a($$2, $$3, $$1.a().b()));
   }

   public fhc(fda $$0, fov $$1, fop $$2) {
      this($$0, $$1, new fop.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.u.c().b();
      this.u.a(new eym(this.e, this.i));
      vf $$0 = vf.b(this.q.e().a()).a(n.o);
      this.u.a(new eym(vf.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.u.a(fal.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      fat $$1 = this.u.a(fat.e().a(8));
      $$1.a(exf.a(ve.k, $$0x -> this.aE_()).a(120).a());
      this.w = $$1.a(exf.a(a, $$0x -> this.n()).a(120).a());
      this.D();
      this.u.a($$1x -> {
         exd var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fan.a(this.u, this.F());
   }

   private void D() {
      foq.b $$0 = this.q.c();
      this.w.j = $$0 == null;
      this.w.a(x.a($$0, foq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
