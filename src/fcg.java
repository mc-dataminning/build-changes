public class fcg extends eyf {
   private static final ti a = ti.c("gui.abuseReport.title");
   private static final ti b = ti.c("gui.abuseReport.message");
   private static final ti c = ti.c("gui.abuseReport.type.chat");
   private static final ti k = ti.c("gui.abuseReport.type.skin");
   private static final ti l = ti.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final eyf n;
   private final fju o;
   private final fck p;
   private final evy q = evy.d().a(6);

   public fcg(eyf $$0, fju $$1, fck $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public ti g() {
      return th.a(super.g(), b);
   }

   @Override
   protected void aD_() {
      this.q.c().b();
      this.q.a(new etr(this.e, this.i), this.q.b().e(6));
      this.q.a(new etf(b, this.i).b(true), this.q.b().e(6));
      esl $$0 = this.q.a(esl.a(c, $$0x -> this.f.a(new fcc(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(etv.a(ti.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(etv.a(ti.a("gui.socialInteractions.tooltip.report.no_messages", this.p.d())));
      }

      this.q.a(esl.a(k, $$0x -> this.f.a(new fci(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(esl.a(l, $$0x -> this.f.a(new fcf(this.n, this.o, this.p.e(), this.p.d()))).a());
      this.q.a(evz.b(20));
      this.q.a(esl.a(th.e, $$0x -> this.au_()).a());
      this.q.a($$1 -> {
         esj var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.q.a();
      evs.a(this.q, this.s());
   }

   @Override
   public void au_() {
      this.f.a(this.n);
   }
}
