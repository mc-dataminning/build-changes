public class ffc extends faz {
   private static final uv a = uv.c("gui.abuseReport.title");
   private static final uv b = uv.c("gui.abuseReport.message");
   private static final uv c = uv.c("gui.abuseReport.type.chat");
   private static final uv k = uv.c("gui.abuseReport.type.skin");
   private static final uv l = uv.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final faz n;
   private final fmr o;
   private final ffg p;
   private final eys q = eys.d().a(6);

   public ffc(faz $$0, fmr $$1, ffg $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public uv h() {
      return uu.a(super.h(), b);
   }

   @Override
   protected void aQ_() {
      this.q.c().b();
      this.q.a(new ewl(this.e, this.i), this.q.b().e(6));
      this.q.a(new evy(b, this.i).b(true), this.q.b().e(6));
      eve $$0 = this.q.a(eve.a(c, $$0x -> this.f.a(new fey(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(ewp.a(uv.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(ewp.a(uv.a("gui.socialInteractions.tooltip.report.no_messages", this.p.c())));
      }

      this.q.a(eve.a(k, $$0x -> this.f.a(new ffe(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(eve.a(l, $$0x -> this.f.a(new ffb(this.n, this.o, this.p.e(), this.p.c()))).a());
      this.q.a(eyt.b(20));
      this.q.a(eve.a(uu.e, $$0x -> this.aG_()).a());
      this.q.a($$1 -> {
         evc var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      eym.a(this.q, this.s());
   }

   @Override
   public void aG_() {
      this.f.a(this.n);
   }
}
