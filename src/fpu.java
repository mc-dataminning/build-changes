public class fpu extends fqs {
   private static final int a = 8;
   private static final int b = 210;
   private static final xh c = xh.c("credits_and_attribution.screen.title");
   private static final xh d = xh.c("credits_and_attribution.button.credits");
   private static final xh s = xh.c("credits_and_attribution.button.attribution");
   private static final xh u = xh.c("credits_and_attribution.button.licenses");
   private final fqs v;
   private final fon w = new fon(this);

   public fpu(fqs $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aS_() {
      this.w.a(c, this.p);
      fos $$0 = this.w.c(fos.d()).a(8);
      $$0.c().b();
      $$0.a(fkz.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fkz.a(s, fpp.b(this, ayf.d)).a(210).a());
      $$0.a(fkz.a(u, fpp.b(this, ayf.e)).a(210).a());
      this.w.b(fkz.a(xg.d, $$0x -> this.d()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fqv(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
