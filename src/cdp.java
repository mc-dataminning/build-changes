import javax.annotation.Nullable;

public class cdp extends ceb {
   private static final int i = 10;
   private static final int j = 7;

   public cdp(bwo $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      ash $$0 = (ash)this.b.dW();
      jh $$1 = this.b.dw();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected fby h() {
      ash $$0 = (ash)this.b.dW();
      jh $$1 = this.b.dw();
      kj $$2 = kj.a($$1);
      kj $$3 = byb.a($$0, $$2, 2);
      return $$3 != $$2 ? chb.a(this.b, 10, 7, fby.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
