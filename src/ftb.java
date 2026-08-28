public class ftb extends fsw {
   private static final xd a = xd.c("controls.title");

   private static fie<?>[] a(fif $$0) {
      return new fie[]{$$0.ae(), $$0.af(), $$0.I(), $$0.K()};
   }

   public ftb(fpt $$0, fif $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fka.a(xd.c("options.mouse_settings"), $$0 -> this.m.a(new fst(this, this.c))).a(),
            fka.a(xd.c("controls.keybinds"), $$0 -> this.m.a(new ftd(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
