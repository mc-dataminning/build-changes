import java.util.Arrays;

public class brr implements brs {
   private final brs[] a;

   public brr(brs... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azu $$0) {
      float $$1 = 1.0F;

      for (brs $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
