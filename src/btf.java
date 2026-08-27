import javax.annotation.Nullable;

public class btf extends btg {
   public btf(blh $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected eji h() {
      eji $$0 = this.b.f(0.0F);
      int $$1 = 8;
      eji $$2 = bvq.a(this.b, 8, 7, $$0.c, $$0.e, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : bvm.a(this.b, 8, 4, -2, $$0.c, $$0.e, (float) (Math.PI / 2));
   }
}
