import javax.annotation.Nullable;

public class caj extends cak {
   public caj(bsi $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected etp h() {
      etp $$0 = this.b.f(0.0F);
      int $$1 = 8;
      etp $$2 = ccw.a(this.b, 8, 7, $$0.c, $$0.e, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : ccs.a(this.b, 8, 4, -2, $$0.c, $$0.e, (float) (Math.PI / 2));
   }
}
