import javax.annotation.Nullable;

public class bqd extends bqp {
   private static final int i = 10;
   private static final int j = 7;

   public bqd(bjf $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aki $$0 = (aki)this.b.dK();
      gv $$1 = this.b.dk();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ehf h() {
      aki $$0 = (aki)this.b.dK();
      gv $$1 = this.b.dk();
      hy $$2 = hy.a($$1);
      hy $$3 = bkq.a($$0, $$2, 2);
      return $$3 != $$2 ? btn.a(this.b, 10, 7, ehf.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
