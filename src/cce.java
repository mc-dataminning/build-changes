import javax.annotation.Nullable;

public class cce extends ccq {
   private static final int i = 10;
   private static final int j = 7;

   public cce(bvd $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      arm $$0 = (arm)this.b.dX();
      jg $$1 = this.b.dx();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected ezh h() {
      arm $$0 = (arm)this.b.dX();
      jg $$1 = this.b.dx();
      ki $$2 = ki.a($$1);
      ki $$3 = bwq.a($$0, $$2, 2);
      return $$3 != $$2 ? cfq.a(this.b, 10, 7, ezh.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
