public class fta extends fty {
   private static final int a = 8;
   private static final int b = 210;
   private static final xv c = xv.c("credits_and_attribution.screen.title");
   private static final xv d = xv.c("credits_and_attribution.button.credits");
   private static final xv s = xv.c("credits_and_attribution.button.attribution");
   private static final xv u = xv.c("credits_and_attribution.button.licenses");
   private final fty v;
   private final fru w = new fru(this);

   public fta(fty $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aT_() {
      this.w.a(c, this.p);
      fry $$0 = this.w.c(fry.d()).a(8);
      $$0.c().b();
      $$0.a(fof.a(d, $$0x -> this.l()).a(210).a());
      $$0.a(fof.a(s, fsv.b(this, aza.d)).a(210).a());
      $$0.a(fof.a(u, fsv.b(this, aza.e)).a(210).a());
      this.w.b(fof.a(xu.d, $$0x -> this.aP_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void l() {
      this.m.a(new fub(false, () -> this.m.a(this)));
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
