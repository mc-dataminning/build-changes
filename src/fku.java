public class fku extends fly {
   private static final int a = 8;
   private static final int b = 210;
   private static final wx c = wx.c("credits_and_attribution.screen.title");
   private static final wx d = wx.c("credits_and_attribution.button.credits");
   private static final wx r = wx.c("credits_and_attribution.button.attribution");
   private static final wx s = wx.c("credits_and_attribution.button.licenses");
   private final fly u;
   private final fjm v = new fjm(this);

   public fku(fly $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aM_() {
      this.v.a(c, this.p);
      fjq $$0 = this.v.c(fjq.d()).a(8);
      $$0.c().b();
      $$0.a(ffz.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(ffz.a(r, fkp.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(ffz.a(s, fkp.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(ffz.a(ww.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.m.a(new fmg(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
