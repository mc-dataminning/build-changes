public class eto extends euq {
   private static final int a = 8;
   private static final int b = 210;
   private static final sw c = sw.c("credits_and_attribution.screen.title");
   private static final sw k = sw.c("credits_and_attribution.button.credits");
   private static final sw l = sw.c("credits_and_attribution.button.attribution");
   private static final sw m = sw.c("credits_and_attribution.button.licenses");
   private final euq n;
   private final esg o = new esg(this);

   public eto(euq $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void b() {
      this.o.a(new eqk(this.m(), this.i));
      esf $$0 = this.o.c(new esf()).c(8);
      $$0.b().b();
      esf.b $$1 = $$0.d(1);
      $$1.a(epi.a(k, $$0x -> this.l()).a(210).a());
      $$1.a(epi.a(l, etj.b("https://aka.ms/MinecraftJavaAttribution", this, true)).a(210).a());
      $$1.a(epi.a(m, etj.b("https://aka.ms/MinecraftJavaLicenses", this, true)).a(210).a());
      this.o.b(epi.a(sv.d, $$0x -> this.aw_()).a());
      this.o.c();
      this.o.a(this::d);
   }

   @Override
   protected void aG_() {
      this.o.c();
   }

   private void l() {
      this.f.a(new euy(false, () -> this.f.a(this)));
   }

   @Override
   public void aw_() {
      this.f.a(this.n);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
   }
}
