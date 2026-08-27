public class fkv extends flz {
   private static final int a = 8;
   private static final int b = 210;
   private static final wx c = wx.c("credits_and_attribution.screen.title");
   private static final wx d = wx.c("credits_and_attribution.button.credits");
   private static final wx r = wx.c("credits_and_attribution.button.attribution");
   private static final wx s = wx.c("credits_and_attribution.button.licenses");
   private final flz u;
   private final fjn v = new fjn(this);

   public fkv(flz $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aN_() {
      this.v.a(c, this.p);
      fjr $$0 = this.v.c(fjr.d()).a(8);
      $$0.c().b();
      $$0.a(fga.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fga.a(r, fkq.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fga.a(s, fkq.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(fga.a(ww.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.m.a(new fmh(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
