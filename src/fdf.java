public class fdf extends ezd {
   private static final ui a = ui.c("gui.abuseReport.title");
   private static final ui b = ui.c("gui.abuseReport.message");
   private static final ui c = ui.c("gui.abuseReport.type.chat");
   private static final ui k = ui.c("gui.abuseReport.type.skin");
   private static final ui l = ui.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final ezd n;
   private final fku o;
   private final fdj p;
   private final ewx q = ewx.d().a(6);

   public fdf(ezd $$0, fku $$1, fdj $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public ui h() {
      return uh.a(super.h(), b);
   }

   @Override
   protected void aM_() {
      this.q.c().b();
      this.q.a(new euq(this.e, this.i), this.q.b().e(6));
      this.q.a(new eud(b, this.i).b(true), this.q.b().e(6));
      etj $$0 = this.q.a(etj.a(c, $$0x -> this.f.a(new fdb(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(euu.a(ui.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(euu.a(ui.a("gui.socialInteractions.tooltip.report.no_messages", this.p.c())));
      }

      this.q.a(etj.a(k, $$0x -> this.f.a(new fdh(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(etj.a(l, $$0x -> this.f.a(new fde(this.n, this.o, this.p.e(), this.p.c()))).a());
      this.q.a(ewy.b(20));
      this.q.a(etj.a(uh.e, $$0x -> this.aC_()).a());
      this.q.a($$1 -> {
         eth var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      ewr.a(this.q, this.s());
   }

   @Override
   public void aC_() {
      this.f.a(this.n);
   }
}
