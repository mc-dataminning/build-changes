import javax.annotation.Nullable;

public class bqe extends bqq {
   private static final int i = 10;
   private static final int j = 7;

   public bqe(bjh $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      akk $$0 = (akk)this.b.dK();
      gu $$1 = this.b.dk();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ehd h() {
      akk $$0 = (akk)this.b.dK();
      gu $$1 = this.b.dk();
      hx $$2 = hx.a($$1);
      hx $$3 = bkr.a($$0, $$2, 2);
      return $$3 != $$2 ? bto.a(this.b, 10, 7, ehd.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
