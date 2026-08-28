import javax.annotation.Nullable;

public class fnp extends fmq {
   private static final xl a = xl.c("controls.title");
   @Nullable
   private fhw r;

   private static ffd<?>[] a(ffe $$0) {
      return new ffd[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fnp(fmy $$0, ffe $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.r = this.c(new fhw(this.m, this.n, this.o, this));
      this.r
         .a(
            fgz.a(xl.c("options.mouse_settings"), $$0 -> this.m.a(new fmm(this, this.c))).a(),
            fgz.a(xl.c("controls.keybinds"), $$0 -> this.m.a(new fnr(this, this.c))).a()
         );
      this.r.a(a(this.c));
      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      if (this.r != null) {
         this.r.a(this.n, this.d);
      }
   }
}
