import javax.annotation.Nullable;

public class bww extends bxi {
   private static final int i = 10;
   private static final int j = 7;

   public bww(bpw $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      apf $$0 = (apf)this.b.dM();
      ib $$1 = this.b.dm();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected epr h() {
      apf $$0 = (apf)this.b.dM();
      ib $$1 = this.b.dm();
      je $$2 = je.a($$1);
      je $$3 = bri.a($$0, $$2, 2);
      return $$3 != $$2 ? cai.a(this.b, 10, 7, epr.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
