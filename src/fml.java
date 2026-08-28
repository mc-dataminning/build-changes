public class fml extends fnj {
   private static final int a = 8;
   private static final int b = 210;
   private static final wu c = wu.c("credits_and_attribution.screen.title");
   private static final wu q = wu.c("credits_and_attribution.button.credits");
   private static final wu r = wu.c("credits_and_attribution.button.attribution");
   private static final wu s = wu.c("credits_and_attribution.button.licenses");
   private final fnj u;
   private final flf v = new flf(this);

   public fml(fnj $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aP_() {
      this.v.a(c, this.o);
      flj $$0 = this.v.c(flj.d()).a(8);
      $$0.c().b();
      $$0.a(fhs.a(q, $$0x -> this.m()).a(210).a());
      $$0.a(fhs.a(r, fmg.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fhs.a(s, fmg.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(fhs.a(wt.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.l.a(new fnm(false, () -> this.l.a(this)));
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }
}
