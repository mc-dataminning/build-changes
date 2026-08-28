public class fqq extends fql {
   private static final wu a = wu.c("controls.title");

   private static ffw<?>[] a(ffx $$0) {
      return new ffw[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fqq(fnj $$0, ffx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.q
         .a(
            fhs.a(wu.c("options.mouse_settings"), $$0 -> this.l.a(new fqi(this, this.c))).a(),
            fhs.a(wu.c("controls.keybinds"), $$0 -> this.l.a(new fqs(this, this.c))).a()
         );
      this.q.a(a(this.c));
   }
}
