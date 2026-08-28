public class fem extends gwo {
   private static final int a = 212;
   private static final wz b = wz.c("mco.configure.world.name");
   private static final wz c = wz.c("mco.configure.world.description");
   private final fdv B;
   private final fcn C;
   private fit D;
   private fit E;

   public fem(fdv $$0, fcn $$1) {
      super(wz.c("mco.configure.world.settings.title"));
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aT_() {
      int $$0 = this.m / 2 - 106;
      String $$1 = this.C.e == fcn.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fik $$2 = fik.a(wz.c($$1), $$0x -> {
         if (this.C.e == fcn.c.b) {
            this.l.a(feh.a(this, wz.c("mco.configure.world.close.question.line1"), $$0xx -> this.B.b()));
         } else {
            this.B.b(false);
         }
      }).a(this.m / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.E = new fit(this.l.h, $$0, g(4), 212, 20, wz.c("mco.configure.world.name"));
      this.E.f(32);
      this.E.a(this.C.b());
      this.c(this.E);
      this.D = new fit(this.l.h, $$0, g(8), 212, 20, wz.c("mco.configure.world.description"));
      this.D.f(32);
      this.D.a(this.C.a());
      this.c(this.D);
      fik $$3 = this.c(fik.a(wz.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.E.b($$1x -> $$3.j = !azl.h($$1x));
      this.c(fik.a(wy.e, $$0x -> this.d()).a(this.m / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aI_() {
      this.b(this.E);
   }

   @Override
   public void d() {
      this.l.a(this.B);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, -1);
      $$0.a(this.o, b, this.m / 2 - 106, g(3), -1, false);
      $$0.a(this.o, c, this.m / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.B.a(this.E.a(), this.D.a());
   }
}
