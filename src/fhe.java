public class fhe extends fdb {
   private static final vf a = vf.c("gui.abuseReport.title");
   private static final vf b = vf.c("gui.abuseReport.message");
   private static final vf c = vf.c("gui.abuseReport.type.chat");
   private static final vf k = vf.c("gui.abuseReport.type.skin");
   private static final vf l = vf.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fdb n;
   private final fow o;
   private final fhi p;
   private final fau q = fau.d().a(6);

   public fhe(fdb $$0, fow $$1, fhi $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public vf h() {
      return ve.a(super.h(), b);
   }

   @Override
   protected void aN_() {
      this.q.c().b();
      this.q.a(new eyn(this.e, this.i), this.q.b().e(6));
      this.q.a(new eya(b, this.i).b(true), this.q.b().e(6));
      exg $$0 = this.q.a(exg.a(c, $$0x -> this.f.a(new fha(this.n, this.o, this.p.c()))).a());
      if (!this.p.j()) {
         $$0.j = false;
         $$0.a(eyr.a(vf.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.i()) {
         $$0.j = false;
         $$0.a(eyr.a(vf.a("gui.socialInteractions.tooltip.report.no_messages", this.p.b())));
      }

      this.q.a(exg.a(k, $$0x -> this.f.a(new fhg(this.n, this.o, this.p.c(), this.p.d()))).a());
      this.q.a(exg.a(l, $$0x -> this.f.a(new fhd(this.n, this.o, this.p.c(), this.p.b()))).a());
      this.q.a(fav.b(20));
      this.q.a(exg.a(ve.e, $$0x -> this.aE_()).a());
      this.q.a($$1 -> {
         exe var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      fao.a(this.q, this.F());
   }

   @Override
   public void aE_() {
      this.f.a(this.n);
   }
}
