public class frv extends fnl {
   private static final wu a = wu.c("gui.abuseReport.title");
   private static final wu b = wu.c("gui.abuseReport.message");
   private static final wu c = wu.c("gui.abuseReport.type.chat");
   private static final wu q = wu.c("gui.abuseReport.type.skin");
   private static final wu r = wu.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fnl u;
   private final fzu v;
   private final frz w;
   private final fll x = fll.d().a(6);

   public frv(fnl $$0, fzu $$1, frz $$2) {
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
   protected void aP_() {
      this.x.c().b();
      this.x.a(new fjb(this.k, this.o), this.x.b().e(6));
      this.x.a(new fio(b, this.o).b(true), this.x.b().e(6));
      fhu $$0 = this.x.a(fhu.a(c, $$0x -> this.l.a(new frr(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fjf.a(wu.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fjf.a(wu.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fhu.a(q, $$0x -> this.l.a(new frx(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(fhu.a(r, $$0x -> this.l.a(new fru(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(flm.b(20));
      this.x.a(fhu.a(wt.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         fhs var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      flf.a(this.x, this.H());
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }
}
