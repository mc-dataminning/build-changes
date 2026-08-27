import javax.annotation.Nullable;

public class bre extends brf {
   public bre(bjf $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected ehf h() {
      ehf $$0 = this.b.f(0.0F);
      int $$1 = 8;
      ehf $$2 = btp.a(this.b, 8, 7, $$0.c, $$0.e, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : btl.a(this.b, 8, 4, -2, $$0.c, $$0.e, (float) (Math.PI / 2));
   }
}
