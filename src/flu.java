public class flu extends fmy {
   private static final int a = 8;
   private static final int b = 210;
   private static final xl c = xl.c("credits_and_attribution.screen.title");
   private static final xl d = xl.c("credits_and_attribution.button.credits");
   private static final xl r = xl.c("credits_and_attribution.button.attribution");
   private static final xl s = xl.c("credits_and_attribution.button.licenses");
   private final fmy u;
   private final fkm v = new fkm(this);

   public flu(fmy $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aN_() {
      this.v.a(c, this.p);
      fkq $$0 = this.v.c(fkq.d()).a(8);
      $$0.c().b();
      $$0.a(fgz.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fgz.a(r, flp.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fgz.a(s, flp.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(fgz.a(xk.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.m.a(new fng(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
