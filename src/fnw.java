import javax.annotation.Nullable;

public class fnw extends fmx {
   private static final xp a = xp.c("controls.title");
   @Nullable
   private fid r;

   private static ffk<?>[] a(ffl $$0) {
      return new ffk[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fnw(fnf $$0, ffl $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fid(this.m, this.n, this.o, this));
      this.r
         .a(
            fhg.a(xp.c("options.mouse_settings"), $$0 -> this.m.a(new fmt(this, this.c))).a(),
            fhg.a(xp.c("controls.keybinds"), $$0 -> this.m.a(new fny(this, this.c))).a()
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
