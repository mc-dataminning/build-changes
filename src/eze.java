public class eze extends fah {
   private static final int a = 8;
   private static final int b = 210;
   private static final ur c = ur.c("credits_and_attribution.screen.title");
   private static final ur k = ur.c("credits_and_attribution.button.credits");
   private static final ur l = ur.c("credits_and_attribution.button.attribution");
   private static final ur m = ur.c("credits_and_attribution.button.licenses");
   private final fah n;
   private final exw o = new exw(this);

   public eze(fah $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aO_() {
      this.o.a(new evt(this.m(), this.i));
      eya $$0 = this.o.c(eya.d()).a(8);
      $$0.c().b();
      $$0.a(eum.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(eum.a(l, eyz.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(eum.a(m, eyz.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(eum.a(uq.d, $$0x -> this.aE_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void l() {
      this.f.a(new fap(false, () -> this.f.a(this)));
   }

   @Override
   public void aE_() {
      this.f.a(this.n);
   }
}
