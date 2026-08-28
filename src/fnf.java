public class fnf extends fod {
   private static final int a = 8;
   private static final int b = 210;
   private static final wz c = wz.c("credits_and_attribution.screen.title");
   private static final wz r = wz.c("credits_and_attribution.button.credits");
   private static final wz s = wz.c("credits_and_attribution.button.attribution");
   private static final wz u = wz.c("credits_and_attribution.button.licenses");
   private final fod v;
   private final flz w = new flz(this);

   public fnf(fod $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aT_() {
      this.w.a(c, this.o);
      fmd $$0 = this.w.c(fmd.d()).a(8);
      $$0.c().b();
      $$0.a(fim.a(r, $$0x -> this.m()).a(210).a());
      $$0.a(fim.a(s, fna.b(this, axj.d)).a(210).a());
      $$0.a(fim.a(u, fna.b(this, axj.e)).a(210).a());
      this.w.b(fim.a(wy.d, $$0x -> this.d()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.l.a(new fog(false, () -> this.l.a(this)));
   }

   @Override
   public void d() {
      this.l.a(this.v);
   }
}
