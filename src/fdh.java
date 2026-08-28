public class fdh extends gvh {
   private static final int a = 212;
   private static final xp b = xp.c("mco.configure.world.name");
   private static final xp c = xp.c("mco.configure.world.description");
   private final fcp B;
   private final fbg C;
   private fho D;
   private fho E;

   public fdh(fcp $$0, fbg $$1) {
      super(xp.c("mco.configure.world.settings.title"));
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aM_() {
      int $$0 = this.n / 2 - 106;
      String $$1 = this.C.e == fbg.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fhf $$2 = fhf.a(xp.c($$1), $$0x -> {
         if (this.C.e == fbg.c.b) {
            xp $$1x = xp.c("mco.configure.world.close.question.line1");
            xp $$2x = xp.c("mco.configure.world.close.question.line2");
            this.m.a(new fcv($$0xx -> {
               if ($$0xx) {
                  this.B.a(this);
               } else {
                  this.m.a(this);
               }
            }, fcv.a.b, $$1x, $$2x, true));
         } else {
            this.B.a(false, this);
         }
      }).a(this.n / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.E = new fho(this.m.h, $$0, g(4), 212, 20, xp.c("mco.configure.world.name"));
      this.E.f(32);
      this.E.a(this.C.b());
      this.c(this.E);
      this.D = new fho(this.m.h, $$0, g(8), 212, 20, xp.c("mco.configure.world.description"));
      this.D.f(32);
      this.D.a(this.C.a());
      this.c(this.D);
      fhf $$3 = this.c(fhf.a(xp.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.E.b($$1x -> $$3.j = !azv.h($$1x));
      this.c(fhf.a(xo.e, $$0x -> this.d()).a(this.n / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aB_() {
      this.b(this.E);
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, b, this.n / 2 - 106, g(3), -1, false);
      $$0.a(this.p, c, this.n / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.B.a(this.E.a(), this.D.a());
   }
}
