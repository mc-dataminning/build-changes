import java.util.Arrays;

public class bnx implements bny {
   private final bny[] a;

   public bnx(bny... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ayd $$0) {
      float $$1 = 1.0F;

      for (bny $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
