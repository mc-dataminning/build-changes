import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class ekh implements ekl {
   private final ekf a;
   private final int b;
   private final int c;

   ekh(int $$0, int $$1) {
      this.a = new ekf((int)ekp.a($$0, $$1));
      int $$2 = IntMath.gcd($$0, $$1);
      this.b = $$0 / $$2;
      this.c = $$1 / $$2;
   }

   @Override
   public boolean a(ekl.a $$0) {
      int $$1 = this.a.size() - 1;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         if (!$$0.merge($$2 / this.c, $$2 / this.b, $$2)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int size() {
      return this.a.size();
   }

   @Override
   public DoubleList a() {
      return this.a;
   }
}
