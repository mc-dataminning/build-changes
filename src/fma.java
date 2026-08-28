public class fma extends fne {
   private static final int a = 8;
   private static final int b = 210;
   private static final xp c = xp.c("credits_and_attribution.screen.title");
   private static final xp d = xp.c("credits_and_attribution.button.credits");
   private static final xp r = xp.c("credits_and_attribution.button.attribution");
   private static final xp s = xp.c("credits_and_attribution.button.licenses");
   private final fne u;
   private final fks v = new fks(this);

   public fma(fne $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aM_() {
      this.v.a(c, this.p);
      fkw $$0 = this.v.c(fkw.d()).a(8);
      $$0.c().b();
      $$0.a(fhf.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fhf.a(r, flv.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fhf.a(s, flv.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(fhf.a(xo.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.m.a(new fnm(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
