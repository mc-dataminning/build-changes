import javax.annotation.Nullable;

public class cfd extends cfp {
   private static final int i = 10;
   private static final int j = 7;

   public cfd(bye $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      aru $$0 = (aru)this.b.dV();
      iw $$1 = this.b.dv();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected ffs h() {
      aru $$0 = (aru)this.b.dV();
      iw $$1 = this.b.dv();
      jz $$2 = jz.a($$1);
      jz $$3 = bzp.a($$0, $$2, 2);
      return $$3 != $$2 ? cip.a(this.b, 10, 7, ffs.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
