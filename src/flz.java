public class flz extends fnd {
   private static final int a = 8;
   private static final int b = 210;
   private static final xp c = xp.c("credits_and_attribution.screen.title");
   private static final xp d = xp.c("credits_and_attribution.button.credits");
   private static final xp r = xp.c("credits_and_attribution.button.attribution");
   private static final xp s = xp.c("credits_and_attribution.button.licenses");
   private final fnd u;
   private final fkr v = new fkr(this);

   public flz(fnd $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aM_() {
      this.v.a(c, this.p);
      fkv $$0 = this.v.c(fkv.d()).a(8);
      $$0.c().b();
      $$0.a(fhe.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fhe.a(r, flu.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fhe.a(s, flu.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(fhe.a(xo.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.m.a(new fnl(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
