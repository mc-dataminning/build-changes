public class fei extends ffl {
   private static final int a = 8;
   private static final int b = 210;
   private static final vq c = vq.c("credits_and_attribution.screen.title");
   private static final vq k = vq.c("credits_and_attribution.button.credits");
   private static final vq l = vq.c("credits_and_attribution.button.attribution");
   private static final vq m = vq.c("credits_and_attribution.button.licenses");
   private final ffl n;
   private final fda o = new fda(this);

   public fei(ffl $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aQ_() {
      this.o.a(new fav(this.p(), this.i));
      fde $$0 = this.o.c(fde.d()).a(8);
      $$0.c().b();
      $$0.a(ezo.a(k, $$0x -> this.o()).a(210).a());
      $$0.a(ezo.a(l, fed.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(ezo.a(m, fed.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(ezo.a(vp.d, $$0x -> this.d()).a());
      this.o.a();
      this.o.a(this::c);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void o() {
      this.f.a(new fft(false, () -> this.f.a(this)));
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
