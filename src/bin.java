import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import org.slf4j.Logger;

public class bin {
   public static final Codec<bin> a = Codec.INT.xmap(bin::a, bin::a);
   private static final bin b = new bin(1);
   private static final Logger c = LogUtils.getLogger();
   private final int d;

   private bin(int $$0) {
      this.d = $$0;
   }

   public static bin a(int $$0) {
      if ($$0 == 1) {
         return b;
      } else {
         b($$0);
         return new bin($$0);
      }
   }

   public int a() {
      return this.d;
   }

   private static void b(int $$0) {
      if ($$0 < 0) {
         throw (IllegalArgumentException)ac.b(new IllegalArgumentException("Weight should be >= 0"));
      } else {
         if ($$0 == 0 && aa.aW) {
            c.warn("Found 0 weight, make sure this is intentional!");
         }
      }
   }

   @Override
   public String toString() {
      return Integer.toString(this.d);
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.d);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof bin && this.d == ((bin)$$0).d;
   }
}
