import javax.annotation.Nullable;

public class bqm extends bqy {
   private static final int i = 10;
   private static final int j = 7;

   public bqm(bjp $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      akq $$0 = (akq)this.b.dL();
      gw $$1 = this.b.dl();
      return $$0.b($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ehn h() {
      akq $$0 = (akq)this.b.dL();
      gw $$1 = this.b.dl();
      hw $$2 = hw.a($$1);
      hw $$3 = bkz.a($$0, $$2, 2);
      return $$3 != $$2 ? btw.a(this.b, 10, 7, ehn.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
