public class fik extends fjo {
   private static final int a = 8;
   private static final int b = 210;
   private static final wg c = wg.c("credits_and_attribution.screen.title");
   private static final wg d = wg.c("credits_and_attribution.button.credits");
   private static final wg o = wg.c("credits_and_attribution.button.attribution");
   private static final wg p = wg.c("credits_and_attribution.button.licenses");
   private final fjo q;
   private final fhc r = new fhc(this);

   public fik(fjo $$0) {
      super(c);
      this.q = $$0;
   }

   @Override
   protected void aN_() {
      this.r.a(c, this.m);
      fhg $$0 = this.r.c(fhg.d()).a(8);
      $$0.c().b();
      $$0.a(fdp.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fdp.a(o, fif.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fdp.a(p, fif.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.r.b(fdp.a(wf.d, $$0x -> this.d()).a(200).a());
      this.r.a();
      this.r.a(this::c);
   }

   @Override
   protected void c() {
      this.r.a();
   }

   private void m() {
      this.j.a(new fjw(false, () -> this.j.a(this)));
   }

   @Override
   public void d() {
      this.j.a(this.q);
   }
}
