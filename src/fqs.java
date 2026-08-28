public class fqs extends fqn {
   private static final wu a = wu.c("controls.title");

   private static ffz<?>[] a(fga $$0) {
      return new ffz[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fqs(fnl $$0, fga $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.q
         .a(
            fhu.a(wu.c("options.mouse_settings"), $$0 -> this.l.a(new fqk(this, this.c))).a(),
            fhu.a(wu.c("controls.keybinds"), $$0 -> this.l.a(new fqu(this, this.c))).a()
         );
      this.q.a(a(this.c));
   }
}
