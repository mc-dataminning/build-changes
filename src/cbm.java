import javax.annotation.Nullable;

public class cbm extends cbn {
   public cbm(btl $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected ewh h() {
      ewh $$0 = this.b.g(0.0F);
      int $$1 = 8;
      ewh $$2 = cdz.a(this.b, 8, 7, $$0.c, $$0.e, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : cdv.a(this.b, 8, 4, -2, $$0.c, $$0.e, (float) (Math.PI / 2));
   }
}
