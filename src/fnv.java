import javax.annotation.Nullable;

public class fnv extends fmw {
   private static final xp a = xp.c("controls.title");
   @Nullable
   private fic r;

   private static ffj<?>[] a(ffk $$0) {
      return new ffj[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fnv(fne $$0, ffk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fic(this.m, this.n, this.o, this));
      this.r
         .a(
            fhf.a(xp.c("options.mouse_settings"), $$0 -> this.m.a(new fms(this, this.c))).a(),
            fhf.a(xp.c("controls.keybinds"), $$0 -> this.m.a(new fnx(this, this.c))).a()
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
