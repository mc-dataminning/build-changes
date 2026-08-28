import java.util.Arrays;

public class btf implements btg {
   private final btg[] a;

   public btf(btg... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azt $$0) {
      float $$1 = 1.0F;

      for (btg $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
