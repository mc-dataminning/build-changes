public class ftl extends ftg {
   private static final xd a = xd.c("controls.title");

   private static fio<?>[] a(fip $$0) {
      return new fio[]{$$0.ae(), $$0.af(), $$0.I(), $$0.K()};
   }

   public ftl(fqd $$0, fip $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fkk.a(xd.c("options.mouse_settings"), $$0 -> this.m.a(new ftd(this, this.c))).a(),
            fkk.a(xd.c("controls.keybinds"), $$0 -> this.m.a(new ftn(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
