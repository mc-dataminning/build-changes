public class fni extends fon {
   private static final int a = 8;
   private static final int b = 210;
   private static final xe c = xe.c("credits_and_attribution.screen.title");
   private static final xe d = xe.c("credits_and_attribution.button.credits");
   private static final xe r = xe.c("credits_and_attribution.button.attribution");
   private static final xe s = xe.c("credits_and_attribution.button.licenses");
   private final fon u;
   private final fma v = new fma(this);

   public fni(fon $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aN_() {
      this.v.a(c, this.p);
      fme $$0 = this.v.c(fme.d()).a(8);
      $$0.c().b();
      $$0.a(fin.a(d, $$0x -> this.B()).a(210).a());
      $$0.a(fin.a(r, fnd.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fin.a(s, fnd.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(fin.a(xd.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void B() {
      this.m.a(new fox(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
