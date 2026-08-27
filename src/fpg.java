import javax.annotation.Nullable;

public class fpg extends foe {
   private static final xe a = xe.c("controls.title");
   @Nullable
   private fjk r;

   private static fgm<?>[] a(fgn $$0) {
      return new fgm[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fpg(fon $$0, fgn $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.r = this.c(new fjk(this.m, this.n, this.o, this));
      this.r
         .a(
            fin.a(xe.c("options.mouse_settings"), $$0 -> this.m.a(new foa(this, this.c))).a(),
            fin.a(xe.c("controls.keybinds"), $$0 -> this.m.a(new fpi(this, this.c))).a()
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
