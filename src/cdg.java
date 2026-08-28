import javax.annotation.Nullable;

public class cdg extends cds {
   private static final int i = 10;
   private static final int j = 7;

   public cdg(bwf $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      arx $$0 = (arx)this.b.dW();
      jh $$1 = this.b.dw();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected fbr h() {
      arx $$0 = (arx)this.b.dW();
      jh $$1 = this.b.dw();
      kj $$2 = kj.a($$1);
      kj $$3 = bxs.a($$0, $$2, 2);
      return $$3 != $$2 ? cgs.a(this.b, 10, 7, fbr.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
