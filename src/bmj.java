import java.util.Arrays;

public class bmj implements bmk {
   private final bmk[] a;

   public bmj(bmk... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(axd $$0) {
      float $$1 = 1.0F;

      for (bmk $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
