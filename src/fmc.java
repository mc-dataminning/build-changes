import java.util.Arrays;

public class fmc extends flq {
   private static final wx a = wx.c("options.sounds.title");
   private fgw r;

   private static fec<?>[] a(fed $$0) {
      return new fec[]{$$0.W(), $$0.X()};
   }

   public fmc(fly $$0, fed $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fgw(this.m, this.n, this.o, this));
      this.r.a(this.c.b(avi.a));
      this.r.a(this.C());
      this.r.a(this.c.at());
      this.r.a(a(this.c));
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.r.a(this.n, this.d);
   }

   private fec<?>[] C() {
      return Arrays.stream(avi.values()).filter($$0 -> $$0 != avi.a).map($$0 -> this.c.b($$0)).toArray(fec[]::new);
   }
}
