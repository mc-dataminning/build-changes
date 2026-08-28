import java.util.Arrays;

public class bsx implements bsy {
   private final bsy[] a;

   public bsx(bsy... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azs $$0) {
      float $$1 = 1.0F;

      for (bsy $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
