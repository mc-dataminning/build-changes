public class fnh extends fmw {
   private final dos s;
   private fgh<dos.a> u;
   private fgh<Boolean> v;
   private fgh<Boolean> w;
   private dos.a x = dos.a.c;
   private boolean y;
   private boolean z;

   public fnh(dos $$0) {
      this.s = $$0;
   }

   @Override
   daa m() {
      return this.s.b();
   }

   @Override
   int C() {
      return 135;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.u = this.c(fgh.<dos.a>a($$0 -> {
         return switch ($$0) {
            case a -> wx.c("advMode.mode.sequence");
            case b -> wx.c("advMode.mode.auto");
            case c -> wx.c("advMode.mode.redstone");
         };
      }).a(dos.a.values()).a().a(this.x).a(this.n / 2 - 50 - 100 - 4, 165, 100, 20, wx.c("advMode.mode"), ($$0, $$1) -> this.x = $$1));
      this.v = this.c(
         fgh.a(wx.c("advMode.mode.conditional"), wx.c("advMode.mode.unconditional"))
            .a()
            .a(this.y)
            .a(this.n / 2 - 50, 165, 100, 20, wx.c("advMode.type"), ($$0, $$1) -> this.y = $$1)
      );
      this.w = this.c(
         fgh.a(wx.c("advMode.mode.autoexec.bat"), wx.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(this.z)
            .a(this.n / 2 + 50 + 4, 165, 100, 20, wx.c("advMode.triggering"), ($$0, $$1) -> this.z = $$1)
      );
      this.e(false);
   }

   private void e(boolean $$0) {
      this.c.j = $$0;
      this.r.j = $$0;
      this.u.j = $$0;
      this.v.j = $$0;
      this.w.j = $$0;
   }

   public void E() {
      daa $$0 = this.s.b();
      this.a.a($$0.m());
      boolean $$1 = $$0.p();
      this.x = this.s.l();
      this.y = this.s.u();
      this.z = this.s.d();
      this.r.a($$1);
      this.u.a(this.x);
      this.v.a(this.y);
      this.w.a(this.z);
      this.c($$1);
      this.e(true);
   }

   @Override
   public void a(feb $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e(true);
   }

   @Override
   protected void a(daa $$0) {
      this.m.L().b(new ahs(io.a($$0.g()), this.a.a(), this.x, $$0.p(), this.y, this.z));
   }
}
