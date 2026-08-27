import java.util.UUID;

public class few extends fes<fmh.a> {
   private static final int r = 120;
   private static final ur t = ur.c("gui.abuseReport.name.title");
   private final eyn u = eyn.d().a(8);
   private evr v;
   private euz w;

   private few(fau $$0, fmm $$1, fmh.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public few(fau $$0, fmm $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fmh.a($$2, $$3, $$1.a().b()));
   }

   public few(fau $$0, fmm $$1, fmh $$2) {
      this($$0, $$1, new fmh.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.u.c().b();
      this.u.a(new ewg(this.e, this.i));
      ur $$0 = ur.b(this.q.e().a()).a(n.o);
      this.u.a(new ewg(ur.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.u.a(eyf.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      eyn $$1 = this.u.a(eyn.e().a(8));
      $$1.a(euz.a(uq.k, $$0x -> this.aF_()).a(120).a());
      this.w = $$1.a(euz.a(a, $$0x -> this.l()).a(120).a());
      this.C();
      this.u.a($$1x -> {
         eux var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      eyh.a(this.u, this.s());
   }

   private void C() {
      fmi.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, fmi.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
