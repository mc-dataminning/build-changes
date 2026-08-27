import java.util.Arrays;

public class bgf implements bgg {
   private final bgg[] a;

   public bgf(bgg... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(asc $$0) {
      float $$1 = 1.0F;

      for (bgg $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
