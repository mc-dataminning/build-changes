import javax.annotation.Nullable;

public class cav extends cbh {
   private static final int i = 10;
   private static final int j = 7;

   public cav(btu $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      aqt $$0 = (aqt)this.b.dQ();
      jd $$1 = this.b.dq();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected eww h() {
      aqt $$0 = (aqt)this.b.dQ();
      jd $$1 = this.b.dq();
      kf $$2 = kf.a($$1);
      kf $$3 = bvh.a($$0, $$2, 2);
      return $$3 != $$2 ? ceh.a(this.b, 10, 7, eww.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
