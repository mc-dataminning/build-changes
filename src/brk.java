import java.util.Arrays;

public class brk implements brl {
   private final brl[] a;

   public brk(brl... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azs $$0) {
      float $$1 = 1.0F;

      for (brl $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
