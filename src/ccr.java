import javax.annotation.Nullable;

public class ccr extends cdd {
   private static final int i = 10;
   private static final int j = 7;

   public ccr(bvq $$0, double $$1, boolean $$2) {
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
   protected fbb h() {
      ard $$0 = (ard)this.b.dV();
      ji $$1 = this.b.dv();
      kk $$2 = kk.a($$1);
      kk $$3 = bxd.a($$0, $$2, 2);
      return $$3 != $$2 ? cgd.a(this.b, 10, 7, fbb.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
