import java.util.Arrays;

public class bii implements bij {
   private final bij[] a;

   public bii(bij... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(atw $$0) {
      float $$1 = 1.0F;

      for (bij $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
