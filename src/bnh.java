import java.util.Arrays;

public class bnh implements bni {
   private final bni[] a;

   public bnh(bni... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(axr $$0) {
      float $$1 = 1.0F;

      for (bni $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
