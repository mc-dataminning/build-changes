public class ezw extends faz {
   private static final int a = 8;
   private static final int b = 210;
   private static final uv c = uv.c("credits_and_attribution.screen.title");
   private static final uv k = uv.c("credits_and_attribution.button.credits");
   private static final uv l = uv.c("credits_and_attribution.button.attribution");
   private static final uv m = uv.c("credits_and_attribution.button.licenses");
   private final faz n;
   private final eyo o = new eyo(this);

   public ezw(faz $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aQ_() {
      this.o.a(new ewl(this.m(), this.i));
      eys $$0 = this.o.c(eys.d()).a(8);
      $$0.c().b();
      $$0.a(eve.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(eve.a(l, ezr.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(eve.a(m, ezr.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.o.b(eve.a(uu.d, $$0x -> this.aG_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void l() {
      this.f.a(new fbh(false, () -> this.f.a(this)));
   }

   @Override
   public void aG_() {
      this.f.a(this.n);
   }
}
