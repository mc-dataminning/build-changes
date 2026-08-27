import javax.annotation.Nullable;

public class bng extends bns {
   private static final int i = 10;
   private static final int j = 7;

   public bng(bgi $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aif $$0 = (aif)this.b.dI();
      gu $$1 = this.b.di();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected eei h() {
      aif $$0 = (aif)this.b.dI();
      gu $$1 = this.b.di();
      hx $$2 = hx.a($$1);
      hx $$3 = bht.a($$0, $$2, 2);
      return $$3 != $$2 ? bqq.a(this.b, 10, 7, eei.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
