public class feb extends ffe {
   private static final int a = 8;
   private static final int b = 210;
   private static final vq c = vq.c("credits_and_attribution.screen.title");
   private static final vq k = vq.c("credits_and_attribution.button.credits");
   private static final vq l = vq.c("credits_and_attribution.button.attribution");
   private static final vq m = vq.c("credits_and_attribution.button.licenses");
   private final ffe n;
   private final fct o = new fct(this);

   public feb(ffe $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aQ_() {
      this.o.a(new fao(this.p(), this.i));
      fcx $$0 = this.o.c(fcx.d()).a(8);
      $$0.c().b();
      $$0.a(ezh.a(k, $$0x -> this.o()).a(210).a());
      $$0.a(ezh.a(l, fdw.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(ezh.a(m, fdw.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(ezh.a(vp.d, $$0x -> this.d()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void o() {
      this.f.a(new ffm(false, () -> this.f.a(this)));
   }

   @Override
   public void d() {
      this.f.a(this.n);
   }
}
