public class fov extends fpt {
   private static final int a = 8;
   private static final int b = 210;
   private static final xd c = xd.c("credits_and_attribution.screen.title");
   private static final xd d = xd.c("credits_and_attribution.button.credits");
   private static final xd s = xd.c("credits_and_attribution.button.attribution");
   private static final xd u = xd.c("credits_and_attribution.button.licenses");
   private final fpt v;
   private final fno w = new fno(this);

   public fov(fpt $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aT_() {
      this.w.a(c, this.p);
      fns $$0 = this.w.c(fns.d()).a(8);
      $$0.c().b();
      $$0.a(fka.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fka.a(s, fop.b(this, axy.d)).a(210).a());
      $$0.a(fka.a(u, fop.b(this, axy.e)).a(210).a());
      this.w.b(fka.a(xc.d, $$0x -> this.d()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fpw(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
