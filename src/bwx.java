import javax.annotation.Nullable;

public class bwx extends bxj {
   private static final int i = 10;
   private static final int j = 7;

   public bwx(bpx $$0, double $$1, boolean $$2) {
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
   protected ept h() {
      apf $$0 = (apf)this.b.dM();
      ib $$1 = this.b.dm();
      je $$2 = je.a($$1);
      je $$3 = brj.a($$0, $$2, 2);
      return $$3 != $$2 ? caj.a(this.b, 10, 7, ept.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
