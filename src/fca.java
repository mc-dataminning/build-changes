public class fca extends gty {
   private static final int a = 212;
   private static final wx b = wx.c("mco.configure.world.name");
   private static final wx c = wx.c("mco.configure.world.description");
   private final fbi B;
   private final ezz C;
   private fgi D;
   private fgi E;

   public fca(fbi $$0, ezz $$1) {
      super(wx.c("mco.configure.world.settings.title"));
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aM_() {
      int $$0 = this.n / 2 - 106;
      String $$1 = this.C.e == ezz.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      ffz $$2 = ffz.a(wx.c($$1), $$0x -> {
         if (this.C.e == ezz.c.b) {
            wx $$1x = wx.c("mco.configure.world.close.question.line1");
            wx $$2x = wx.c("mco.configure.world.close.question.line2");
            this.m.a(new fbo($$0xx -> {
               if ($$0xx) {
                  this.B.a(this);
               } else {
                  this.m.a(this);
               }
            }, fbo.a.b, $$1x, $$2x, true));
         } else {
            this.B.a(false, this);
         }
      }).a(this.n / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.E = new fgi(this.m.h, $$0, g(4), 212, 20, wx.c("mco.configure.world.name"));
      this.E.f(32);
      this.E.a(this.C.b());
      this.c(this.E);
      this.D = new fgi(this.m.h, $$0, g(8), 212, 20, wx.c("mco.configure.world.description"));
      this.D.f(32);
      this.D.a(this.C.a());
      this.c(this.D);
      ffz $$3 = this.c(ffz.a(wx.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.E.b($$1x -> $$3.j = !ayy.h($$1x));
      this.c(ffz.a(ww.e, $$0x -> this.d()).a(this.n / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, b, this.n / 2 - 106, g(3), -1, false);
      $$0.a(this.p, c, this.n / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.B.a(this.E.a(), this.D.a());
   }
}
