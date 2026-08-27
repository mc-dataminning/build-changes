import java.util.UUID;

public class fhd extends fgz<foq.a> {
   private static final int r = 120;
   private static final vf t = vf.c("gui.abuseReport.name.title");
   private final fau u = fau.d().a(8);
   private exy v;
   private exg w;

   private fhd(fdb $$0, fow $$1, foq.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fhd(fdb $$0, fow $$1, UUID $$2, String $$3) {
      this($$0, $$1, new foq.a($$2, $$3, $$1.a().b()));
   }

   public fhd(fdb $$0, fow $$1, foq $$2) {
      this($$0, $$1, new foq.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.u.c().b();
      this.u.a(new eyn(this.e, this.i));
      vf $$0 = vf.b(this.q.e().a()).a(n.o);
      this.u.a(new eyn(vf.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.u.a(fam.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      fau $$1 = this.u.a(fau.e().a(8));
      $$1.a(exg.a(ve.k, $$0x -> this.aE_()).a(120).a());
      this.w = $$1.a(exg.a(a, $$0x -> this.n()).a(120).a());
      this.D();
      this.u.a($$1x -> {
         exe var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fao.a(this.u, this.F());
   }

   private void D() {
      fos.b $$0 = this.q.c();
      this.w.j = $$0 == null;
      this.w.a(x.a($$0, fos.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
