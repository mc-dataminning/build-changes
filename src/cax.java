import javax.annotation.Nullable;

public class cax extends cbj {
   private static final int i = 10;
   private static final int j = 7;

   public cax(btw $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      aqu $$0 = (aqu)this.b.dP();
      jd $$1 = this.b.dp();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected exa h() {
      aqu $$0 = (aqu)this.b.dP();
      jd $$1 = this.b.dp();
      kf $$2 = kf.a($$1);
      kf $$3 = bvj.a($$0, $$2, 2);
      return $$3 != $$2 ? cej.a(this.b, 10, 7, exa.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
