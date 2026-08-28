public class fsz extends ftx {
   private static final int a = 8;
   private static final int b = 210;
   private static final xv c = xv.c("credits_and_attribution.screen.title");
   private static final xv d = xv.c("credits_and_attribution.button.credits");
   private static final xv s = xv.c("credits_and_attribution.button.attribution");
   private static final xv u = xv.c("credits_and_attribution.button.licenses");
   private final ftx v;
   private final frt w = new frt(this);

   public fsz(ftx $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aT_() {
      this.w.a(c, this.p);
      frx $$0 = this.w.c(frx.d()).a(8);
      $$0.c().b();
      $$0.a(foe.a(d, $$0x -> this.l()).a(210).a());
      $$0.a(foe.a(s, fsu.b(this, aza.d)).a(210).a());
      $$0.a(foe.a(u, fsu.b(this, aza.e)).a(210).a());
      this.w.b(foe.a(xu.d, $$0x -> this.aP_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void l() {
      this.m.a(new fua(false, () -> this.m.a(this)));
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
