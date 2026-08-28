import javax.annotation.Nullable;

public class cbv extends cch {
   private static final int i = 10;
   private static final int j = 7;

   public cbv(buv $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      arj $$0 = (arj)this.b.dS();
      jf $$1 = this.b.ds();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected eyw h() {
      arj $$0 = (arj)this.b.dS();
      jf $$1 = this.b.ds();
      kh $$2 = kh.a($$1);
      kh $$3 = bwh.a($$0, $$2, 2);
      return $$3 != $$2 ? cfh.a(this.b, 10, 7, eyw.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
