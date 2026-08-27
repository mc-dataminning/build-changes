import java.util.Arrays;

public class bhx implements bhy {
   private final bhy[] a;

   public bhx(bhy... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ato $$0) {
      float $$1 = 1.0F;

      for (bhy $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
