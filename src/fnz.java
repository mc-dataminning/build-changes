public class fnz extends fjx {
   private static final wi a = wi.c("gui.abuseReport.title");
   private static final wi b = wi.c("gui.abuseReport.message");
   private static final wi c = wi.c("gui.abuseReport.type.chat");
   private static final wi d = wi.c("gui.abuseReport.type.skin");
   private static final wi o = wi.c("gui.abuseReport.type.name");
   private static final int p = 6;
   private final fjx q;
   private final fvy r;
   private final fod s;
   private final fhp u = fhp.d().a(6);

   public fnz(fjx $$0, fvy $$1, fod $$2) {
      super(a);
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   @Override
   public wi i() {
      return wh.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      this.u.c().b();
      this.u.a(new fff(this.i, this.m), this.u.b().e(6));
      this.u.a(new fes(b, this.m).b(true), this.u.b().e(6));
      fdy $$0 = this.u.a(fdy.a(c, $$0x -> this.j.a(new fnv(this.q, this.r, this.s.d()))).a());
      if (!this.s.k()) {
         $$0.j = false;
         $$0.a(ffj.a(wi.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.s.j()) {
         $$0.j = false;
         $$0.a(ffj.a(wi.a("gui.socialInteractions.tooltip.report.no_messages", this.s.c())));
      }

      this.u.a(fdy.a(d, $$0x -> this.j.a(new fob(this.q, this.r, this.s.d(), this.s.h()))).a());
      this.u.a(fdy.a(o, $$0x -> this.j.a(new fny(this.q, this.r, this.s.d(), this.s.c()))).a());
      this.u.a(fhq.b(20));
      this.u.a(fdy.a(wh.e, $$0x -> this.d()).a());
      this.u.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fhj.a(this.u, this.G());
   }

   @Override
   public void d() {
      this.j.a(this.q);
   }
}
