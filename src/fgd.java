public class fgd extends fhh {
   private static final int a = 8;
   private static final int b = 210;
   private static final vu c = vu.c("credits_and_attribution.screen.title");
   private static final vu k = vu.c("credits_and_attribution.button.credits");
   private static final vu l = vu.c("credits_and_attribution.button.attribution");
   private static final vu m = vu.c("credits_and_attribution.button.licenses");
   private final fhh n;
   private final fev o = new fev(this);

   public fgd(fhh $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aO_() {
      this.o.a(new fcp(this.p(), this.i));
      fez $$0 = this.o.c(fez.d()).a(8);
      $$0.c().b();
      $$0.a(fbi.a(k, $$0x -> this.o()).a(210).a());
      $$0.a(fbi.a(l, ffy.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fbi.a(m, ffy.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(fbi.a(vt.d, $$0x -> this.d()).a());
      this.o.a();
      this.o.a(this::c);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void o() {
      this.f.a(new fhp(false, () -> this.f.a(this)));
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
