public class fto extends fum {
   private static final int a = 8;
   private static final int b = 210;
   private static final wp c = wp.c("credits_and_attribution.screen.title");
   private static final wp d = wp.c("credits_and_attribution.button.credits");
   private static final wp s = wp.c("credits_and_attribution.button.attribution");
   private static final wp u = wp.c("credits_and_attribution.button.licenses");
   private final fum v;
   private final fsi w = new fsi(this);

   public fto(fum $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aR_() {
      this.w.a(c, this.p);
      fsm $$0 = this.w.c(fsm.d()).a(8);
      $$0.c().b();
      $$0.a(fou.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fou.a(s, ftj.b(this, axv.d)).a(210).a());
      $$0.a(fou.a(u, ftj.b(this, axv.e)).a(210).a());
      this.w.b(fou.a(wo.d, $$0x -> this.aO_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fup(false, () -> this.m.a(this)));
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }
}
