public class fko extends fjp {
   private static final wi a = wi.c("controls.title");

   public fko(fjx $$0, fcc $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      fhk $$0 = new fhk();
      $$0.c().f(5).e(4).b();
      fhk.b $$1 = $$0.d(2);
      $$1.a(fdy.a(wi.c("options.mouse_settings"), $$0x -> this.j.a(new fjl(this, this.c))).a());
      $$1.a(fdy.a(wi.c("controls.keybinds"), $$0x -> this.j.a(new fkq(this, this.c))).a());
      $$1.a(this.c.ac().a(this.c));
      $$1.a(this.c.ad().a(this.c));
      $$1.a(this.c.H().a(this.c));
      $$1.a(this.c.I().a(this.c));
      this.d.c($$0);
      super.aM_();
   }
}
