public class ews extends exv {
   private static final int a = 8;
   private static final int b = 210;
   private static final te c = te.c("credits_and_attribution.screen.title");
   private static final te k = te.c("credits_and_attribution.button.credits");
   private static final te l = te.c("credits_and_attribution.button.attribution");
   private static final te m = te.c("credits_and_attribution.button.licenses");
   private final exv n;
   private final evk o = new evk(this);

   public ews(exv $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aE_() {
      this.o.a(new etn(this.m(), this.i));
      evo $$0 = this.o.c(evo.d()).a(8);
      $$0.c().b();
      $$0.a(esi.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(esi.a(l, ewn.b("https://aka.ms/MinecraftJavaAttribution", this, true)).a(210).a());
      $$0.a(esi.a(m, ewn.b("https://aka.ms/MinecraftJavaLicenses", this, true)).a(210).a());
      this.o.b(esi.a(td.d, $$0x -> this.au_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
   }

   private void l() {
      this.f.a(new eyc(false, () -> this.f.a(this)));
   }

   @Override
   public void au_() {
      this.f.a(this.n);
   }
}
