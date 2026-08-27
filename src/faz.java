public class faz extends fcc {
   private static final int a = 8;
   private static final int b = 210;
   private static final vb c = vb.c("credits_and_attribution.screen.title");
   private static final vb k = vb.c("credits_and_attribution.button.credits");
   private static final vb l = vb.c("credits_and_attribution.button.attribution");
   private static final vb m = vb.c("credits_and_attribution.button.licenses");
   private final fcc n;
   private final ezr o = new ezr(this);

   public faz(fcc $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aP_() {
      this.o.a(new exo(this.m(), this.i));
      ezv $$0 = this.o.c(ezv.d()).a(8);
      $$0.c().b();
      $$0.a(ewh.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(ewh.a(l, fau.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(ewh.a(m, fau.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(ewh.a(va.d, $$0x -> this.aF_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void l() {
      this.f.a(new fck(false, () -> this.f.a(this)));
   }

   @Override
   public void aF_() {
      this.f.a(this.n);
   }
}
