import java.util.UUID;

public class fhb extends fgx<foo.a> {
   private static final int r = 120;
   private static final vf t = vf.c("gui.abuseReport.name.title");
   private final fas u = fas.d().a(8);
   private exw v;
   private exe w;

   private fhb(fcz $$0, fou $$1, foo.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fhb(fcz $$0, fou $$1, UUID $$2, String $$3) {
      this($$0, $$1, new foo.a($$2, $$3, $$1.a().b()));
   }

   public fhb(fcz $$0, fou $$1, foo $$2) {
      this($$0, $$1, new foo.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.u.c().b();
      this.u.a(new eyl(this.e, this.i));
      vf $$0 = vf.b(this.q.e().a()).a(n.o);
      this.u.a(new eyl(vf.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.u.a(fak.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      fas $$1 = this.u.a(fas.e().a(8));
      $$1.a(exe.a(ve.k, $$0x -> this.aE_()).a(120).a());
      this.w = $$1.a(exe.a(a, $$0x -> this.n()).a(120).a());
      this.C();
      this.u.a($$1x -> {
         exc var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fam.a(this.u, this.F());
   }

   private void C() {
      fop.b $$0 = this.q.c();
      this.w.j = $$0 == null;
      this.w.a(x.a($$0, fop.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
