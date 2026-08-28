import javax.annotation.Nullable;

public class ceg extends ces {
   private static final int i = 10;
   private static final int j = 7;

   public ceg(bxh $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      aro $$0 = (aro)this.b.dV();
      iu $$1 = this.b.dv();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected fdw h() {
      aro $$0 = (aro)this.b.dV();
      iu $$1 = this.b.dv();
      jx $$2 = jx.a($$1);
      jx $$3 = bys.a($$0, $$2, 2);
      return $$3 != $$2 ? chs.a(this.b, 10, 7, fdw.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
