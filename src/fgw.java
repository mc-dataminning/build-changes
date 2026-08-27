public class fgw extends fct {
   private static final vd a = vd.c("gui.abuseReport.title");
   private static final vd b = vd.c("gui.abuseReport.message");
   private static final vd c = vd.c("gui.abuseReport.type.chat");
   private static final vd k = vd.c("gui.abuseReport.type.skin");
   private static final vd l = vd.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fct n;
   private final fon o;
   private final fha p;
   private final fam q = fam.d().a(6);

   public fgw(fct $$0, fon $$1, fha $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public vd h() {
      return vc.a(super.h(), b);
   }

   @Override
   protected void aN_() {
      this.q.c().b();
      this.q.a(new eyf(this.e, this.i), this.q.b().e(6));
      this.q.a(new exs(b, this.i).b(true), this.q.b().e(6));
      ewy $$0 = this.q.a(ewy.a(c, $$0x -> this.f.a(new fgs(this.n, this.o, this.p.c()))).a());
      if (!this.p.j()) {
         $$0.j = false;
         $$0.a(eyj.a(vd.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.i()) {
         $$0.j = false;
         $$0.a(eyj.a(vd.a("gui.socialInteractions.tooltip.report.no_messages", this.p.b())));
      }

      this.q.a(ewy.a(k, $$0x -> this.f.a(new fgy(this.n, this.o, this.p.c(), this.p.d()))).a());
      this.q.a(ewy.a(l, $$0x -> this.f.a(new fgv(this.n, this.o, this.p.c(), this.p.b()))).a());
      this.q.a(fan.b(20));
      this.q.a(ewy.a(vc.e, $$0x -> this.aE_()).a());
      this.q.a($$1 -> {
         eww var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      fag.a(this.q, this.F());
   }

   @Override
   public void aE_() {
      this.f.a(this.n);
   }
}
