public class ftk extends fui {
   private static final int a = 8;
   private static final int b = 210;
   private static final wo c = wo.c("credits_and_attribution.screen.title");
   private static final wo d = wo.c("credits_and_attribution.button.credits");
   private static final wo s = wo.c("credits_and_attribution.button.attribution");
   private static final wo u = wo.c("credits_and_attribution.button.licenses");
   private final fui v;
   private final fse w = new fse(this);

   public ftk(fui $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aR_() {
      this.w.a(c, this.p);
      fsi $$0 = this.w.c(fsi.d()).a(8);
      $$0.c().b();
      $$0.a(fop.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fop.a(s, ftf.b(this, axu.d)).a(210).a());
      $$0.a(fop.a(u, ftf.b(this, axu.e)).a(210).a());
      this.w.b(fop.a(wn.d, $$0x -> this.aO_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new ful(false, () -> this.m.a(this)));
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }
}
