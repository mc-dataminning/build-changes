import java.util.Arrays;

public class btk implements btl {
   private final btl[] a;

   public btk(btl... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azv $$0) {
      float $$1 = 1.0F;

      for (btl $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
