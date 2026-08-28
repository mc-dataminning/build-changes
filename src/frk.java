public class frk extends frf {
   private static final wz a = wz.c("controls.title");

   private static fgp<?>[] a(fgq $$0) {
      return new fgp[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public frk(fob $$0, fgq $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.r
         .a(
            fik.a(wz.c("options.mouse_settings"), $$0 -> this.l.a(new frc(this, this.c))).a(),
            fik.a(wz.c("controls.keybinds"), $$0 -> this.l.a(new frm(this, this.c))).a()
         );
      this.r.a(a(this.c));
   }
}
