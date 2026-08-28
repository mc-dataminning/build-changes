public class fqr extends frp {
   private static final int a = 8;
   private static final int b = 210;
   private static final xl c = xl.c("credits_and_attribution.screen.title");
   private static final xl d = xl.c("credits_and_attribution.button.credits");
   private static final xl s = xl.c("credits_and_attribution.button.attribution");
   private static final xl u = xl.c("credits_and_attribution.button.licenses");
   private final frp v;
   private final fpl w = new fpl(this);

   public fqr(frp $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aS_() {
      this.w.a(c, this.p);
      fpp $$0 = this.w.c(fpp.d()).a(8);
      $$0.c().b();
      $$0.a(flw.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(flw.a(s, fqm.b(this, ayj.d)).a(210).a());
      $$0.a(flw.a(u, fqm.b(this, ayj.e)).a(210).a());
      this.w.b(flw.a(xk.d, $$0x -> this.aP_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new frs(false, () -> this.m.a(this)));
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
