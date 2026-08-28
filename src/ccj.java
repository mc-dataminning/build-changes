import javax.annotation.Nullable;

public class ccj extends ccv {
   private static final int i = 10;
   private static final int j = 7;

   public ccj(bvi $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      arn $$0 = (arn)this.b.dX();
      jh $$1 = this.b.dx();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected ezn h() {
      arn $$0 = (arn)this.b.dX();
      jh $$1 = this.b.dx();
      kj $$2 = kj.a($$1);
      kj $$3 = bwv.a($$0, $$2, 2);
      return $$3 != $$2 ? cfv.a(this.b, 10, 7, ezn.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
