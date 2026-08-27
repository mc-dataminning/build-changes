import java.util.Arrays;

public class bot implements bou {
   private final bou[] a;

   public bot(bou... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ayg $$0) {
      float $$1 = 1.0F;

      for (bou $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
