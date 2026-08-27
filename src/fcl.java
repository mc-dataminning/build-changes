public class fcl extends eyk {
   private static final tl a = tl.c("gui.abuseReport.title");
   private static final tl b = tl.c("gui.abuseReport.message");
   private static final tl c = tl.c("gui.abuseReport.type.chat");
   private static final tl k = tl.c("gui.abuseReport.type.skin");
   private static final tl l = tl.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final eyk n;
   private final fjz o;
   private final fcp p;
   private final ewd q = ewd.d().a(6);

   public fcl(eyk $$0, fjz $$1, fcp $$2) {
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
   protected void aI_() {
      this.q.c().b();
      this.q.a(new etw(this.e, this.i), this.q.b().e(6));
      this.q.a(new etk(b, this.i).b(true), this.q.b().e(6));
      esq $$0 = this.q.a(esq.a(c, $$0x -> this.f.a(new fch(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(eua.a(tl.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(eua.a(tl.a("gui.socialInteractions.tooltip.report.no_messages", this.p.d())));
      }

      this.q.a(esq.a(k, $$0x -> this.f.a(new fcn(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(esq.a(l, $$0x -> this.f.a(new fck(this.n, this.o, this.p.e(), this.p.d()))).a());
      this.q.a(ewe.b(20));
      this.q.a(esq.a(tk.e, $$0x -> this.az_()).a());
      this.q.a($$1 -> {
         eso var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.q.a();
      evx.a(this.q, this.s());
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }
}
