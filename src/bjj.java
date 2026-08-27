import java.util.Arrays;

public class bjj implements bjk {
   private final bjk[] a;

   public bjj(bjk... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(auw $$0) {
      float $$1 = 1.0F;

      for (bjk $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
