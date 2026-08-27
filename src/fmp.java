import javax.annotation.Nullable;

public class fmp extends flq {
   private static final wx a = wx.c("controls.title");
   @Nullable
   private fgw r;

   private static fec<?>[] a(fed $$0) {
      return new fec[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public fmp(fly $$0, fed $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fgw(this.m, this.n, this.o, this));
      this.r
         .a(
            ffz.a(wx.c("options.mouse_settings"), $$0 -> this.m.a(new flm(this, this.c))).a(),
            ffz.a(wx.c("controls.keybinds"), $$0 -> this.m.a(new fmr(this, this.c))).a()
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
