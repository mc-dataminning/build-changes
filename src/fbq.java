public class fbq extends fct {
   private static final int a = 8;
   private static final int b = 210;
   private static final vd c = vd.c("credits_and_attribution.screen.title");
   private static final vd k = vd.c("credits_and_attribution.button.credits");
   private static final vd l = vd.c("credits_and_attribution.button.attribution");
   private static final vd m = vd.c("credits_and_attribution.button.licenses");
   private final fct n;
   private final fai o = new fai(this);

   public fbq(fct $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aN_() {
      this.o.a(new eyf(this.o(), this.i));
      fam $$0 = this.o.c(fam.d()).a(8);
      $$0.c().b();
      $$0.a(ewy.a(k, $$0x -> this.n()).a(210).a());
      $$0.a(ewy.a(l, fbl.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(ewy.a(m, fbl.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(ewy.a(vc.d, $$0x -> this.aE_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void n() {
      this.f.a(new fdb(false, () -> this.f.a(this)));
   }

   @Override
   public void aE_() {
      this.f.a(this.n);
   }
}
