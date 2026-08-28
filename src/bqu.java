import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import org.slf4j.Logger;

public class bqu {
   public static final Codec<bqu> a = Codec.INT.xmap(bqu::a, bqu::a);
   private static final bqu b = new bqu(1);
   private static final Logger c = LogUtils.getLogger();
   private final int d;

   private bqu(int $$0) {
      this.d = $$0;
   }

   public static bqu a(int $$0) {
      if ($$0 == 1) {
         return b;
      } else {
         b($$0);
         return new bqu($$0);
      }
   }

   public int a() {
      return this.d;
   }

   private static void b(int $$0) {
      if ($$0 < 0) {
         throw (IllegalArgumentException)af.b(new IllegalArgumentException("Weight should be >= 0"));
      } else {
         if ($$0 == 0 && ab.aU) {
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
      return this == $$0 ? true : $$0 instanceof bqu && this.d == ((bqu)$$0).d;
   }
}
