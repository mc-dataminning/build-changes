import java.util.Arrays;

public class bhi implements bhj {
   private final bhj[] a;

   public bhi(bhj... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ate $$0) {
      float $$1 = 1.0F;

      for (bhj $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
