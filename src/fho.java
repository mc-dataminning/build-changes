import java.util.UUID;

public class fho extends fhk<fpd.a> {
   private static final int r = 120;
   private static final vg t = vg.c("gui.abuseReport.name.title");
   private final fbf u = fbf.d().a(8);
   private eyj v;
   private exr w;

   private fho(fdm $$0, fpi $$1, fpd.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fho(fdm $$0, fpi $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fpd.a($$2, $$3, $$1.a().b()));
   }

   public fho(fdm $$0, fpi $$1, fpd $$2) {
      this($$0, $$1, new fpd.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.u.c().b();
      this.u.a(new eyy(this.e, this.i));
      vg $$0 = vg.b(this.q.e().a()).a(n.o);
      this.u.a(new eyy(vg.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.u.a(fax.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      fbf $$1 = this.u.a(fbf.e().a(8));
      $$1.a(exr.a(vf.k, $$0x -> this.d()).a(120).a());
      this.w = $$1.a(exr.a(a, $$0x -> this.o()).a(120).a());
      this.E();
      this.u.a($$1x -> {
         exp var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      faz.a(this.u, this.F());
   }

   private void E() {
      fpe.b $$0 = this.q.c();
      this.w.j = $$0 == null;
      this.w.a(x.a($$0, fpe.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
