public class fqu extends frb {
   public static final wy a = wy.c("options.accessibility.title");

   private static fgl<?>[] a(fgm $$0) {
      return new fgl[]{
         $$0.as(),
         $$0.W(),
         $$0.t(),
         $$0.H(),
         $$0.p(),
         $$0.r(),
         $$0.Y(),
         $$0.n(),
         $$0.o(),
         $$0.A(),
         $$0.B(),
         $$0.ac(),
         $$0.ad(),
         $$0.aj(),
         $$0.ak(),
         $$0.al(),
         $$0.ao(),
         $$0.am(),
         $$0.an(),
         $$0.b(),
         $$0.a(),
         $$0.s(),
         $$0.c(),
         $$0.u()
      };
   }

   public fqu(fnx $$0, fgm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aP_() {
      super.aP_();
      fie $$0 = this.q.b(this.c.t());
      if ($$0 != null && !this.l.ac().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fjr.a(wy.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void m() {
      this.q.a(a(this.c));
   }

   @Override
   protected void D() {
      flx $$0 = this.r.b(flx.e().a(8));
      $$0.a(fig.a(wy.c("options.accessibility.link"), fmu.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a());
      $$0.a(fig.a(wx.d, $$0x -> this.l.a(this.b)).a());
   }
}
