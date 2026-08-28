public class fmz extends fnx {
   private static final int a = 8;
   private static final int b = 210;
   private static final wy c = wy.c("credits_and_attribution.screen.title");
   private static final wy q = wy.c("credits_and_attribution.button.credits");
   private static final wy r = wy.c("credits_and_attribution.button.attribution");
   private static final wy s = wy.c("credits_and_attribution.button.licenses");
   private final fnx u;
   private final flt v = new flt(this);

   public fmz(fnx $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aP_() {
      this.v.a(c, this.o);
      flx $$0 = this.v.c(flx.d()).a(8);
      $$0.c().b();
      $$0.a(fig.a(q, $$0x -> this.m()).a(210).a());
      $$0.a(fig.a(r, fmu.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fig.a(s, fmu.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(fig.a(wx.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.l.a(new foa(false, () -> this.l.a(this)));
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }
}
