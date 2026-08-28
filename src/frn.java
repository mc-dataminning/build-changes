public class frn extends fnd {
   private static final wu a = wu.c("gui.abuseReport.title");
   private static final wu b = wu.c("gui.abuseReport.message");
   private static final wu c = wu.c("gui.abuseReport.type.chat");
   private static final wu q = wu.c("gui.abuseReport.type.skin");
   private static final wu r = wu.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fnd u;
   private final fzm v;
   private final frr w;
   private final fld x = fld.d().a(6);

   public frn(fnd $$0, fzm $$1, frr $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public wu i() {
      return wt.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      this.x.c().b();
      this.x.a(new fit(this.k, this.o), this.x.b().e(6));
      this.x.a(new fig(b, this.o).b(true), this.x.b().e(6));
      fhm $$0 = this.x.a(fhm.a(c, $$0x -> this.l.a(new frj(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fix.a(wu.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fix.a(wu.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fhm.a(q, $$0x -> this.l.a(new frp(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fhm.a(r, $$0x -> this.l.a(new frm(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fle.b(20));
      this.x.a(fhm.a(wt.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fhk var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fkx.a(this.x, this.H());
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }
}
