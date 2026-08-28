public class fpf extends fqd {
   private static final int a = 8;
   private static final int b = 210;
   private static final xd c = xd.c("credits_and_attribution.screen.title");
   private static final xd d = xd.c("credits_and_attribution.button.credits");
   private static final xd s = xd.c("credits_and_attribution.button.attribution");
   private static final xd u = xd.c("credits_and_attribution.button.licenses");
   private final fqd v;
   private final fny w = new fny(this);

   public fpf(fqd $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aR_() {
      this.w.a(c, this.p);
      foc $$0 = this.w.c(foc.d()).a(8);
      $$0.c().b();
      $$0.a(fkk.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fkk.a(s, fpa.b(this, axz.d)).a(210).a());
      $$0.a(fkk.a(u, fpa.b(this, axz.e)).a(210).a());
      this.w.b(fkk.a(xc.d, $$0x -> this.d()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fqg(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
