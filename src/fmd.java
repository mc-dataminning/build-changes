import java.util.Arrays;

public class fmd extends flr {
   private static final wx a = wx.c("options.sounds.title");
   private fgx r;

   private static fee<?>[] a(fef $$0) {
      return new fee[]{$$0.W(), $$0.X()};
   }

   public fmd(flz $$0, fef $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.r = this.c(new fgx(this.m, this.n, this.o, this));
      this.r.a(this.c.b(avj.a));
      this.r.a(this.C());
      this.r.a(this.c.at());
      this.r.a(a(this.c));
      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.r.a(this.n, this.d);
   }

   private fee<?>[] C() {
      return Arrays.stream(avj.values()).filter($$0 -> $$0 != avj.a).map($$0 -> this.c.b($$0)).toArray(fee[]::new);
   }
}
