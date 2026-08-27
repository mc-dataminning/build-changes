public class fpg extends fld {
   private static final wu a = wu.c("gui.abuseReport.title");
   private static final wu b = wu.c("gui.abuseReport.message");
   private static final wu c = wu.c("gui.abuseReport.type.chat");
   private static final wu d = wu.c("gui.abuseReport.type.skin");
   private static final wu r = wu.c("gui.abuseReport.type.name");
   private static final int s = 6;
   private final fld u;
   private final fxe v;
   private final fpk w;
   private final fiv x = fiv.d().a(6);

   public fpg(fld $$0, fxe $$1, fpk $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public wu i() {
      return wt.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      this.x.c().b();
      this.x.a(new fgl(this.l, this.p), this.x.b().e(6));
      this.x.a(new ffy(b, this.p).b(true), this.x.b().e(6));
      ffe $$0 = this.x.a(ffe.a(c, $$0x -> this.m.a(new fpc(this.u, this.v, this.w.d()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fgp.a(wu.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fgp.a(wu.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(ffe.a(d, $$0x -> this.m.a(new fpi(this.u, this.v, this.w.d(), this.w.h()))).a());
      this.x.a(ffe.a(r, $$0x -> this.m.a(new fpf(this.u, this.v, this.w.d(), this.w.c()))).a());
      this.x.a(fiw.b(20));
      this.x.a(ffe.a(wt.e, $$0x -> this.d()).a());
      this.x.a($$1 -> {
         ffc var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      fip.a(this.x, this.G());
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
