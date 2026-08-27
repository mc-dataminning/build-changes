public class ezr extends fau {
   private static final int a = 8;
   private static final int b = 210;
   private static final ur c = ur.c("credits_and_attribution.screen.title");
   private static final ur k = ur.c("credits_and_attribution.button.credits");
   private static final ur l = ur.c("credits_and_attribution.button.attribution");
   private static final ur m = ur.c("credits_and_attribution.button.licenses");
   private final fau n;
   private final eyj o = new eyj(this);

   public ezr(fau $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aP_() {
      this.o.a(new ewg(this.m(), this.i));
      eyn $$0 = this.o.c(eyn.d()).a(8);
      $$0.c().b();
      $$0.a(euz.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(euz.a(l, ezm.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(euz.a(m, ezm.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(euz.a(uq.d, $$0x -> this.aF_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void l() {
      this.f.a(new fbc(false, () -> this.f.a(this)));
   }

   @Override
   public void aF_() {
      this.f.a(this.n);
   }
}
