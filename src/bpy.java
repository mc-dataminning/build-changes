import java.util.Arrays;

public class bpy implements bpz {
   private final bpz[] a;

   public bpy(bpz... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ayw $$0) {
      float $$1 = 1.0F;

      for (bpz $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
