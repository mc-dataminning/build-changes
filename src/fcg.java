public class fcg extends eye {
   private static final tl a = tl.c("gui.abuseReport.title");
   private static final tl b = tl.c("gui.abuseReport.message");
   private static final tl c = tl.c("gui.abuseReport.type.chat");
   private static final tl k = tl.c("gui.abuseReport.type.skin");
   private static final tl l = tl.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final eye n;
   private final fjv o;
   private final fck p;
   private final evy q = evy.d().a(6);

   public fcg(eye $$0, fjv $$1, fck $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public tl g() {
      return tk.a(super.g(), b);
   }

   @Override
   protected void aH_() {
      this.q.c().b();
      this.q.a(new etr(this.e, this.i), this.q.b().e(6));
      this.q.a(new ete(b, this.i).b(true), this.q.b().e(6));
      esk $$0 = this.q.a(esk.a(c, $$0x -> this.f.a(new fcc(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(etv.a(tl.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(etv.a(tl.a("gui.socialInteractions.tooltip.report.no_messages", this.p.d())));
      }

      this.q.a(esk.a(k, $$0x -> this.f.a(new fci(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(esk.a(l, $$0x -> this.f.a(new fcf(this.n, this.o, this.p.e(), this.p.d()))).a());
      this.q.a(evz.b(20));
      this.q.a(esk.a(tk.e, $$0x -> this.az_()).a());
      this.q.a($$1 -> {
         esi var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.q.a();
      evs.a(this.q, this.s());
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }
}
