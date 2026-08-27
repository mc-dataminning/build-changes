import java.util.Arrays;

public class bfv implements bfw {
   private final bfw[] a;

   public bfv(bfw... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(art $$0) {
      float $$1 = 1.0F;

      for (int $$2 = 0; $$2 < this.a.length; $$2++) {
         $$1 *= this.a[$$2].a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
