public class frm extends frh {
   private static final wz a = wz.c("controls.title");

   private static fgr<?>[] a(fgs $$0) {
      return new fgr[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public frm(fod $$0, fgs $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.r
         .a(
            fim.a(wz.c("options.mouse_settings"), $$0 -> this.l.a(new fre(this, this.c))).a(),
            fim.a(wz.c("controls.keybinds"), $$0 -> this.l.a(new fro(this, this.c))).a()
         );
      this.r.a(a(this.c));
   }
}
