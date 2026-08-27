import java.util.Arrays;

public class bgh implements bgi {
   private final bgi[] a;

   public bgh(bgi... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ase $$0) {
      float $$1 = 1.0F;

      for (bgi $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
