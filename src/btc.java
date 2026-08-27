import javax.annotation.Nullable;

public class btc extends bto {
   private static final int i = 10;
   private static final int j = 7;

   public btc(bme $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      amp $$0 = (amp)this.b.dM();
      hv $$1 = this.b.dm();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected elb h() {
      amp $$0 = (amp)this.b.dM();
      hv $$1 = this.b.dm();
      ix $$2 = ix.a($$1);
      ix $$3 = bno.a($$0, $$2, 2);
      return $$3 != $$2 ? bwn.a(this.b, 10, 7, elb.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
