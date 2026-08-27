import java.util.Arrays;

public class bpb implements bpc {
   private final bpc[] a;

   public bpb(bpc... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ayk $$0) {
      float $$1 = 1.0F;

      for (bpc $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
