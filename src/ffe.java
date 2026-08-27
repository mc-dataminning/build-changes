public class ffe extends fgh {
   private static final int a = 8;
   private static final int b = 210;
   private static final vs c = vs.c("credits_and_attribution.screen.title");
   private static final vs k = vs.c("credits_and_attribution.button.credits");
   private static final vs l = vs.c("credits_and_attribution.button.attribution");
   private static final vs m = vs.c("credits_and_attribution.button.licenses");
   private final fgh n;
   private final fdw o = new fdw(this);

   public ffe(fgh $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aP_() {
      this.o.a(new fbr(this.p(), this.i));
      fea $$0 = this.o.c(fea.d()).a(8);
      $$0.c().b();
      $$0.a(fak.a(k, $$0x -> this.o()).a(210).a());
      $$0.a(fak.a(l, fez.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fak.a(m, fez.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(fak.a(vr.d, $$0x -> this.d()).a());
      this.o.a();
      this.o.a(this::c);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void o() {
      this.f.a(new fgp(false, () -> this.f.a(this)));
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
