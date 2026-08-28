public class frg extends frb {
   private static final wy a = wy.c("controls.title");

   private static fgl<?>[] a(fgm $$0) {
      return new fgl[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public frg(fnx $$0, fgm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.q
         .a(
            fig.a(wy.c("options.mouse_settings"), $$0 -> this.l.a(new fqy(this, this.c))).a(),
            fig.a(wy.c("controls.keybinds"), $$0 -> this.l.a(new fri(this, this.c))).a()
         );
      this.q.a(a(this.c));
   }
}
