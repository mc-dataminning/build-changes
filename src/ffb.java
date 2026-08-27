import java.util.UUID;

public class ffb extends fex<fmm.a> {
   private static final int r = 120;
   private static final uv t = uv.c("gui.abuseReport.name.title");
   private final eys u = eys.d().a(8);
   private evw v;
   private eve w;

   private ffb(faz $$0, fmr $$1, fmm.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public ffb(faz $$0, fmr $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fmm.a($$2, $$3, $$1.a().b()));
   }

   public ffb(faz $$0, fmr $$1, fmm $$2) {
      this($$0, $$1, new fmm.a($$2, $$1.a().b()));
   }

   @Override
   protected void aQ_() {
      this.u.c().b();
      this.u.a(new ewl(this.e, this.i));
      uv $$0 = uv.b(this.q.e().a()).a(n.o);
      this.u.a(new ewl(uv.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.u.a(eyk.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      eys $$1 = this.u.a(eys.e().a(8));
      $$1.a(eve.a(uu.k, $$0x -> this.aG_()).a(120).a());
      this.w = $$1.a(eve.a(a, $$0x -> this.l()).a(120).a());
      this.C();
      this.u.a($$1x -> {
         evc var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      eym.a(this.u, this.s());
   }

   private void C() {
      fmn.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, fmn.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
