public class fkf extends fjg {
   private static final wg a = wg.c("controls.title");

   public fkf(fjo $$0, fbt $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      fhb $$0 = new fhb();
      $$0.c().f(5).e(4).b();
      fhb.b $$1 = $$0.d(2);
      $$1.a(fdp.a(wg.c("options.mouse_settings"), $$0x -> this.j.a(new fjc(this, this.c))).a());
      $$1.a(fdp.a(wg.c("controls.keybinds"), $$0x -> this.j.a(new fkh(this, this.c))).a());
      $$1.a(this.c.ac().a(this.c));
      $$1.a(this.c.ad().a(this.c));
      $$1.a(this.c.H().a(this.c));
      $$1.a(this.c.I().a(this.c));
      this.d.c($$0);
      super.aN_();
   }
}
