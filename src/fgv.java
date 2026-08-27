import java.util.UUID;

public class fgv extends fgr<foi.a> {
   private static final int r = 120;
   private static final vd t = vd.c("gui.abuseReport.name.title");
   private final fam u = fam.d().a(8);
   private exq v;
   private ewy w;

   private fgv(fct $$0, fon $$1, foi.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fgv(fct $$0, fon $$1, UUID $$2, String $$3) {
      this($$0, $$1, new foi.a($$2, $$3, $$1.a().b()));
   }

   public fgv(fct $$0, fon $$1, foi $$2) {
      this($$0, $$1, new foi.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.u.c().b();
      this.u.a(new eyf(this.e, this.i));
      vd $$0 = vd.b(this.q.e().a()).a(n.o);
      this.u.a(new eyf(vd.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.u.a(fae.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      fam $$1 = this.u.a(fam.e().a(8));
      $$1.a(ewy.a(vc.k, $$0x -> this.aE_()).a(120).a());
      this.w = $$1.a(ewy.a(a, $$0x -> this.n()).a(120).a());
      this.C();
      this.u.a($$1x -> {
         eww var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fag.a(this.u, this.F());
   }

   private void C() {
      foj.b $$0 = this.q.c();
      this.w.j = $$0 == null;
      this.w.a(x.a($$0, foj.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
