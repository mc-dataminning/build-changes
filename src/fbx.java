public class fbx extends fda {
   private static final int a = 8;
   private static final int b = 210;
   private static final vf c = vf.c("credits_and_attribution.screen.title");
   private static final vf k = vf.c("credits_and_attribution.button.credits");
   private static final vf l = vf.c("credits_and_attribution.button.attribution");
   private static final vf m = vf.c("credits_and_attribution.button.licenses");
   private final fda n;
   private final fap o = new fap(this);

   public fbx(fda $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aN_() {
      this.o.a(new eym(this.o(), this.i));
      fat $$0 = this.o.c(fat.d()).a(8);
      $$0.c().b();
      $$0.a(exf.a(k, $$0x -> this.n()).a(210).a());
      $$0.a(exf.a(l, fbs.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(exf.a(m, fbs.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(exf.a(ve.d, $$0x -> this.aE_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void n() {
      this.f.a(new fdi(false, () -> this.f.a(this)));
   }

   @Override
   public void aE_() {
      this.f.a(this.n);
   }
}
