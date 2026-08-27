import javax.annotation.Nullable;

public class fmq extends flr {
   private static final wx a = wx.c("controls.title");
   @Nullable
   private fgx r;

   private static fee<?>[] a(fef $$0) {
      return new fee[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fmq(flz $$0, fef $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.r = this.c(new fgx(this.m, this.n, this.o, this));
      this.r
         .a(
            fga.a(wx.c("options.mouse_settings"), $$0 -> this.m.a(new fln(this, this.c))).a(),
            fga.a(wx.c("controls.keybinds"), $$0 -> this.m.a(new fms(this, this.c))).a()
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
