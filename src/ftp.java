public class ftp extends ftk {
   private static final xe a = xe.c("controls.title");

   private static fis<?>[] a(fit $$0) {
      return new fis[]{$$0.ae(), $$0.af(), $$0.I(), $$0.K()};
   }

   public ftp(fqh $$0, fit $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fko.a(xe.c("options.mouse_settings"), $$0 -> this.m.a(new fth(this, this.c))).a(),
            fko.a(xe.c("controls.keybinds"), $$0 -> this.m.a(new ftr(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
