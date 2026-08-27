import javax.annotation.Nullable;

public class brf extends brg {
   public brf(bjh $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected ehd h() {
      ehd $$0 = this.b.f(0.0F);
      int $$1 = 8;
      ehd $$2 = btq.a(this.b, 8, 7, $$0.c, $$0.e, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : btm.a(this.b, 8, 4, -2, $$0.c, $$0.e, (float) (Math.PI / 2));
   }
}
