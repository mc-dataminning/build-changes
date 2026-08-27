import javax.annotation.Nullable;

public class bse extends bsq {
   private static final int i = 10;
   private static final int j = 7;

   public bse(blh $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      ama $$0 = (ama)this.b.dL();
      ht $$1 = this.b.dl();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected eji h() {
      ama $$0 = (ama)this.b.dL();
      ht $$1 = this.b.dl();
      iu $$2 = iu.a($$1);
      iu $$3 = bmr.a($$0, $$2, 2);
      return $$3 != $$2 ? bvo.a(this.b, 10, 7, eji.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
