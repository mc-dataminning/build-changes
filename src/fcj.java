public class fcj extends fdm {
   private static final int a = 8;
   private static final int b = 210;
   private static final vg c = vg.c("credits_and_attribution.screen.title");
   private static final vg k = vg.c("credits_and_attribution.button.credits");
   private static final vg l = vg.c("credits_and_attribution.button.attribution");
   private static final vg m = vg.c("credits_and_attribution.button.licenses");
   private final fdm n;
   private final fbb o = new fbb(this);

   public fcj(fdm $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aP_() {
      this.o.a(new eyy(this.p(), this.i));
      fbf $$0 = this.o.c(fbf.d()).a(8);
      $$0.c().b();
      $$0.a(exr.a(k, $$0x -> this.o()).a(210).a());
      $$0.a(exr.a(l, fce.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(exr.a(m, fce.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(exr.a(vf.d, $$0x -> this.d()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void o() {
      this.f.a(new fdu(false, () -> this.f.a(this)));
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
