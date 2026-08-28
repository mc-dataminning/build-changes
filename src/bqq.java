import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import org.slf4j.Logger;

public class bqq {
   public static final Codec<bqq> a = Codec.INT.xmap(bqq::a, bqq::a);
   private static final bqq b = new bqq(1);
   private static final Logger c = LogUtils.getLogger();
   private final int d;

   private bqq(int $$0) {
      this.d = $$0;
   }

   public static bqq a(int $$0) {
      if ($$0 == 1) {
         return b;
      } else {
         b($$0);
         return new bqq($$0);
      }
   }

   public int a() {
      return this.d;
   }

   private static void b(int $$0) {
      if ($$0 < 0) {
         throw (IllegalArgumentException)ae.b(new IllegalArgumentException("Weight should be >= 0"));
      } else {
         if ($$0 == 0 && ab.aV) {
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
      return this == $$0 ? true : $$0 instanceof bqq && this.d == ((bqq)$$0).d;
   }
}
