import javax.annotation.Nullable;

public class cdr extends cds {
   public cdr(bvp $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected ezy h() {
      ezy $$0 = this.b.g(0.0F);
      int $$1 = 8;
      ezy $$2 = cge.a(this.b, 8, 7, $$0.d, $$0.f, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : cga.a(this.b, 8, 4, -2, $$0.d, $$0.f, (float) (Math.PI / 2));
   }
}
