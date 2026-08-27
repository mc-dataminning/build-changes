public class fkk extends fgh {
   private static final vs a = vs.c("gui.abuseReport.title");
   private static final vs b = vs.c("gui.abuseReport.message");
   private static final vs c = vs.c("gui.abuseReport.type.chat");
   private static final vs k = vs.c("gui.abuseReport.type.skin");
   private static final vs l = vs.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fgh n;
   private final fsg o;
   private final fko p;
   private final fea q = fea.d().a(6);

   public fkk(fgh $$0, fsg $$1, fko $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public vs i() {
      return vr.a(super.i(), b);
   }

   @Override
   protected void aP_() {
      this.q.c().b();
      this.q.a(new fbr(this.e, this.i), this.q.b().e(6));
      this.q.a(new fbe(b, this.i).b(true), this.q.b().e(6));
      fak $$0 = this.q.a(fak.a(c, $$0x -> this.f.a(new fkg(this.n, this.o, this.p.c()))).a());
      if (!this.p.j()) {
         $$0.j = false;
         $$0.a(fbv.a(vs.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.i()) {
         $$0.j = false;
         $$0.a(fbv.a(vs.a("gui.socialInteractions.tooltip.report.no_messages", this.p.b())));
      }

      this.q.a(fak.a(k, $$0x -> this.f.a(new fkm(this.n, this.o, this.p.c(), this.p.d()))).a());
      this.q.a(fak.a(l, $$0x -> this.f.a(new fkj(this.n, this.o, this.p.c(), this.p.b()))).a());
      this.q.a(feb.b(20));
      this.q.a(fak.a(vr.e, $$0x -> this.d()).a());
      this.q.a($$1 -> {
         fai var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      fdu.a(this.q, this.F());
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
