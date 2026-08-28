import javax.annotation.Nullable;

public class fnt extends fmu {
   private static final xo a = xo.c("controls.title");
   @Nullable
   private fia r;

   private static ffh<?>[] a(ffi $$0) {
      return new ffh[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fnt(fnc $$0, ffi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fia(this.m, this.n, this.o, this));
      this.r
         .a(
            fhd.a(xo.c("options.mouse_settings"), $$0 -> this.m.a(new fmq(this, this.c))).a(),
            fhd.a(xo.c("controls.keybinds"), $$0 -> this.m.a(new fnv(this, this.c))).a()
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
