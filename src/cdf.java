import javax.annotation.Nullable;

public class cdf extends cdg {
   public cdf(bvd $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected ezh h() {
      ezh $$0 = this.b.g(0.0F);
      int $$1 = 8;
      ezh $$2 = cfs.a(this.b, 8, 7, $$0.d, $$0.f, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : cfo.a(this.b, 8, 4, -2, $$0.d, $$0.f, (float) (Math.PI / 2));
   }
}
