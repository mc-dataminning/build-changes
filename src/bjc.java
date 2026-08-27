import java.util.Arrays;

public class bjc implements bjd {
   private final bjd[] a;

   public bjc(bjd... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(aup $$0) {
      float $$1 = 1.0F;

      for (bjd $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
