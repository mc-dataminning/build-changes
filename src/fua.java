public class fua extends ftv {
   private static final xh a = xh.c("controls.title");

   private static fjd<?>[] a(fje $$0) {
      return new fjd[]{$$0.ae(), $$0.af(), $$0.I(), $$0.K()};
   }

   public fua(fqs $$0, fje $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fkz.a(xh.c("options.mouse_settings"), $$0 -> this.m.a(new fts(this, this.c))).a(),
            fkz.a(xh.c("controls.keybinds"), $$0 -> this.m.a(new fuc(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
