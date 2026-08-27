public class exc extends eyf {
   private static final int a = 8;
   private static final int b = 210;
   private static final ti c = ti.c("credits_and_attribution.screen.title");
   private static final ti k = ti.c("credits_and_attribution.button.credits");
   private static final ti l = ti.c("credits_and_attribution.button.attribution");
   private static final ti m = ti.c("credits_and_attribution.button.licenses");
   private final eyf n;
   private final evu o = new evu(this);

   public exc(eyf $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aD_() {
      this.o.a(new etr(this.m(), this.i));
      evy $$0 = this.o.c(evy.d()).a(8);
      $$0.c().b();
      $$0.a(esl.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(esl.a(l, ewx.b("https://aka.ms/MinecraftJavaAttribution", this, true)).a(210).a());
      $$0.a(esl.a(m, ewx.b("https://aka.ms/MinecraftJavaLicenses", this, true)).a(210).a());
      this.o.b(esl.a(th.d, $$0x -> this.au_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
   }

   private void l() {
      this.f.a(new eym(false, () -> this.f.a(this)));
   }

   @Override
   public void au_() {
      this.f.a(this.n);
   }
}
