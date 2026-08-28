import javax.annotation.Nullable;

public class ccp extends cdb {
   private static final int i = 10;
   private static final int j = 7;

   public ccp(bvo $$0, double $$1, boolean $$2) {
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
   protected faz h() {
      ard $$0 = (ard)this.b.dV();
      ji $$1 = this.b.dv();
      kk $$2 = kk.a($$1);
      kk $$3 = bxb.a($$0, $$2, 2);
      return $$3 != $$2 ? cgb.a(this.b, 10, 7, faz.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
