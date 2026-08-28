import javax.annotation.Nullable;

public class fns extends fmt {
   private static final xo a = xo.c("controls.title");
   @Nullable
   private fhz r;

   private static ffg<?>[] a(ffh $$0) {
      return new ffg[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fns(fnb $$0, ffh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fhz(this.m, this.n, this.o, this));
      this.r
         .a(
            fhc.a(xo.c("options.mouse_settings"), $$0 -> this.m.a(new fmp(this, this.c))).a(),
            fhc.a(xo.c("controls.keybinds"), $$0 -> this.m.a(new fnu(this, this.c))).a()
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
