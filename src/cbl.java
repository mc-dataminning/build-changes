import javax.annotation.Nullable;

public class cbl extends cbm {
   public cbl(btk $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected ewf h() {
      ewf $$0 = this.b.g(0.0F);
      int $$1 = 8;
      ewf $$2 = cdy.a(this.b, 8, 7, $$0.c, $$0.e, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : cdu.a(this.b, 8, 4, -2, $$0.c, $$0.e, (float) (Math.PI / 2));
   }
}
