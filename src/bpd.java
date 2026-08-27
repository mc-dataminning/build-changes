import java.util.Arrays;

public class bpd implements bpe {
   private final bpe[] a;

   public bpd(bpe... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(aym $$0) {
      float $$1 = 1.0F;

      for (bpe $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
