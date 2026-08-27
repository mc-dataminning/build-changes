public class fgf extends fcc {
   private static final vb a = vb.c("gui.abuseReport.title");
   private static final vb b = vb.c("gui.abuseReport.message");
   private static final vb c = vb.c("gui.abuseReport.type.chat");
   private static final vb k = vb.c("gui.abuseReport.type.skin");
   private static final vb l = vb.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fcc n;
   private final fnw o;
   private final fgj p;
   private final ezv q = ezv.d().a(6);

   public fgf(fcc $$0, fnw $$1, fgj $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public vb h() {
      return va.a(super.h(), b);
   }

   @Override
   protected void aP_() {
      this.q.c().b();
      this.q.a(new exo(this.e, this.i), this.q.b().e(6));
      this.q.a(new exb(b, this.i).b(true), this.q.b().e(6));
      ewh $$0 = this.q.a(ewh.a(c, $$0x -> this.f.a(new fgb(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(exs.a(vb.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(exs.a(vb.a("gui.socialInteractions.tooltip.report.no_messages", this.p.c())));
      }

      this.q.a(ewh.a(k, $$0x -> this.f.a(new fgh(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(ewh.a(l, $$0x -> this.f.a(new fge(this.n, this.o, this.p.e(), this.p.c()))).a());
      this.q.a(ezw.b(20));
      this.q.a(ewh.a(va.e, $$0x -> this.aF_()).a());
      this.q.a($$1 -> {
         ewf var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      ezp.a(this.q, this.s());
   }

   @Override
   public void aF_() {
      this.f.a(this.n);
   }
}
