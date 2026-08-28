import javax.annotation.Nullable;

public class ccq extends cdc {
   private static final int i = 10;
   private static final int j = 7;

   public ccq(bvp $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      ard $$0 = (ard)this.b.dV();
      ji $$1 = this.b.dv();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected fba h() {
      ard $$0 = (ard)this.b.dV();
      ji $$1 = this.b.dv();
      kk $$2 = kk.a($$1);
      kk $$3 = bxc.a($$0, $$2, 2);
      return $$3 != $$2 ? cgc.a(this.b, 10, 7, fba.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
