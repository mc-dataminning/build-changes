import java.util.Arrays;

public class buj implements buk {
   private final buk[] a;

   public buj(buk... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(bai $$0) {
      float $$1 = 1.0F;

      for (buk $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
