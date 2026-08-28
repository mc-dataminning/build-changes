import java.util.Arrays;

public class bqa implements bqb {
   private final bqb[] a;

   public bqa(bqb... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azg $$0) {
      float $$1 = 1.0F;

      for (bqb $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
