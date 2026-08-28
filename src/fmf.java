public class fmf extends fnd {
   private static final int a = 8;
   private static final int b = 210;
   private static final wu c = wu.c("credits_and_attribution.screen.title");
   private static final wu q = wu.c("credits_and_attribution.button.credits");
   private static final wu r = wu.c("credits_and_attribution.button.attribution");
   private static final wu s = wu.c("credits_and_attribution.button.licenses");
   private final fnd u;
   private final fkz v = new fkz(this);

   public fmf(fnd $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aO_() {
      this.v.a(c, this.o);
      fld $$0 = this.v.c(fld.d()).a(8);
      $$0.c().b();
      $$0.a(fhm.a(q, $$0x -> this.m()).a(210).a());
      $$0.a(fhm.a(r, fma.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fhm.a(s, fma.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(fhm.a(wt.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.l.a(new fng(false, () -> this.l.a(this)));
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }
}
