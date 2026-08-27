public class fek extends fah {
   private static final ur a = ur.c("gui.abuseReport.title");
   private static final ur b = ur.c("gui.abuseReport.message");
   private static final ur c = ur.c("gui.abuseReport.type.chat");
   private static final ur k = ur.c("gui.abuseReport.type.skin");
   private static final ur l = ur.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final fah n;
   private final flz o;
   private final feo p;
   private final eya q = eya.d().a(6);

   public fek(fah $$0, flz $$1, feo $$2) {
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
   protected void aO_() {
      this.q.c().b();
      this.q.a(new evt(this.e, this.i), this.q.b().e(6));
      this.q.a(new evg(b, this.i).b(true), this.q.b().e(6));
      eum $$0 = this.q.a(eum.a(c, $$0x -> this.f.a(new feg(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(evx.a(ur.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(evx.a(ur.a("gui.socialInteractions.tooltip.report.no_messages", this.p.c())));
      }

      this.q.a(eum.a(k, $$0x -> this.f.a(new fem(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(eum.a(l, $$0x -> this.f.a(new fej(this.n, this.o, this.p.e(), this.p.c()))).a());
      this.q.a(eyb.b(20));
      this.q.a(eum.a(uq.e, $$0x -> this.aE_()).a());
      this.q.a($$1 -> {
         euk var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
      exu.a(this.q, this.s());
   }

   @Override
   public void aE_() {
      this.f.a(this.n);
   }
}
