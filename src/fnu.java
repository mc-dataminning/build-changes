import javax.annotation.Nullable;

public class fnu extends fmv {
   private static final xp a = xp.c("controls.title");
   @Nullable
   private fib r;

   private static ffi<?>[] a(ffj $$0) {
      return new ffi[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fnu(fnd $$0, ffj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fib(this.m, this.n, this.o, this));
      this.r
         .a(
            fhe.a(xp.c("options.mouse_settings"), $$0 -> this.m.a(new fmr(this, this.c))).a(),
            fhe.a(xp.c("controls.keybinds"), $$0 -> this.m.a(new fnw(this, this.c))).a()
         );
      this.r.a(a(this.c));
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      if (this.r != null) {
         this.r.a(this.n, this.d);
      }
   }
}
