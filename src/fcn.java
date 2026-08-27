public class fcn extends eym {
   private static final tn a = tn.c("gui.abuseReport.title");
   private static final tn b = tn.c("gui.abuseReport.message");
   private static final tn c = tn.c("gui.abuseReport.type.chat");
   private static final tn k = tn.c("gui.abuseReport.type.skin");
   private static final tn l = tn.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final eym n;
   private final fkb o;
   private final fcr p;
   private final ewf q = ewf.d().a(6);

   public fcn(eym $$0, fkb $$1, fcr $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public tn g() {
      return tm.a(super.g(), b);
   }

   @Override
   protected void aH_() {
      this.q.c().b();
      this.q.a(new ety(this.e, this.i), this.q.b().e(6));
      this.q.a(new etm(b, this.i).b(true), this.q.b().e(6));
      ess $$0 = this.q.a(ess.a(c, $$0x -> this.f.a(new fcj(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(euc.a(tn.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(euc.a(tn.a("gui.socialInteractions.tooltip.report.no_messages", this.p.d())));
      }

      this.q.a(ess.a(k, $$0x -> this.f.a(new fcp(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(ess.a(l, $$0x -> this.f.a(new fcm(this.n, this.o, this.p.e(), this.p.d()))).a());
      this.q.a(ewg.b(20));
      this.q.a(ess.a(tm.e, $$0x -> this.az_()).a());
      this.q.a($$1 -> {
         esq var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.q.a();
      evz.a(this.q, this.s());
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }
}
