public class fqk extends fqf {
   private static final wu a = wu.c("controls.title");

   private static ffq<?>[] a(ffr $$0) {
      return new ffq[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fqk(fnd $$0, ffr $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.q
         .a(
            fhm.a(wu.c("options.mouse_settings"), $$0 -> this.l.a(new fqc(this, this.c))).a(),
            fhm.a(wu.c("controls.keybinds"), $$0 -> this.l.a(new fqm(this, this.c))).a()
         );
      this.q.a(a(this.c));
   }
}
