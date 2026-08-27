import java.util.Arrays;

public class bji implements bjj {
   private final bjj[] a;

   public bji(bjj... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(auv $$0) {
      float $$1 = 1.0F;

      for (bjj $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
