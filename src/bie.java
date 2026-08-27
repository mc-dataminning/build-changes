import java.util.Arrays;

public class bie implements bif {
   private final bif[] a;

   public bie(bif... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ats $$0) {
      float $$1 = 1.0F;

      for (bif $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
