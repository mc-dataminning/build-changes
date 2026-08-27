import java.util.Arrays;

public class bjh implements bji {
   private final bji[] a;

   public bjh(bji... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(auu $$0) {
      float $$1 = 1.0F;

      for (bji $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
