public class fqc extends fra {
   private static final int a = 8;
   private static final int b = 210;
   private static final xi c = xi.c("credits_and_attribution.screen.title");
   private static final xi d = xi.c("credits_and_attribution.button.credits");
   private static final xi s = xi.c("credits_and_attribution.button.attribution");
   private static final xi u = xi.c("credits_and_attribution.button.licenses");
   private final fra v;
   private final fow w = new fow(this);

   public fqc(fra $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aR_() {
      this.w.a(c, this.p);
      fpa $$0 = this.w.c(fpa.d()).a(8);
      $$0.c().b();
      $$0.a(flh.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(flh.a(s, fpx.b(this, ayg.d)).a(210).a());
      $$0.a(flh.a(u, fpx.b(this, ayg.e)).a(210).a());
      this.w.b(flh.a(xh.d, $$0x -> this.d()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new frd(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
