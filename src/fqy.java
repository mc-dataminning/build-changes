public class fqy extends frw {
   private static final int a = 8;
   private static final int b = 210;
   private static final xj c = xj.c("credits_and_attribution.screen.title");
   private static final xj d = xj.c("credits_and_attribution.button.credits");
   private static final xj s = xj.c("credits_and_attribution.button.attribution");
   private static final xj u = xj.c("credits_and_attribution.button.licenses");
   private final frw v;
   private final fps w = new fps(this);

   public fqy(frw $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aR_() {
      this.w.a(c, this.p);
      fpw $$0 = this.w.c(fpw.d()).a(8);
      $$0.c().b();
      $$0.a(fmd.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fmd.a(s, fqt.b(this, ayi.d)).a(210).a());
      $$0.a(fmd.a(u, fqt.b(this, ayi.e)).a(210).a());
      this.w.b(fmd.a(xi.d, $$0x -> this.aO_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new frz(false, () -> this.m.a(this)));
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }
}
