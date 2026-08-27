public class fex extends fau {
   private static final ur a = ur.c("gui.abuseReport.title");
   private static final ur b = ur.c("gui.abuseReport.message");
   private static final ur c = ur.c("gui.abuseReport.type.chat");
   private static final ur k = ur.c("gui.abuseReport.type.skin");
   private static final ur l = ur.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fau n;
   private final fmm o;
   private final ffb p;
   private final eyn q = eyn.d().a(6);

   public fex(fau $$0, fmm $$1, ffb $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public ur h() {
      return uq.a(super.h(), b);
   }

   @Override
   protected void aP_() {
      this.q.c().b();
      this.q.a(new ewg(this.e, this.i), this.q.b().e(6));
      this.q.a(new evt(b, this.i).b(true), this.q.b().e(6));
      euz $$0 = this.q.a(euz.a(c, $$0x -> this.f.a(new fet(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(ewk.a(ur.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(ewk.a(ur.a("gui.socialInteractions.tooltip.report.no_messages", this.p.c())));
      }

      this.q.a(euz.a(k, $$0x -> this.f.a(new fez(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(euz.a(l, $$0x -> this.f.a(new few(this.n, this.o, this.p.e(), this.p.c()))).a());
      this.q.a(eyo.b(20));
      this.q.a(euz.a(uq.e, $$0x -> this.aF_()).a());
      this.q.a($$1 -> {
         eux var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      eyh.a(this.q, this.s());
   }

   @Override
   public void aF_() {
      this.f.a(this.n);
   }
}
