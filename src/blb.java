import java.util.Arrays;

public class blb implements blc {
   private final blc[] a;

   public blb(blc... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(awo $$0) {
      float $$1 = 1.0F;

      for (blc $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
