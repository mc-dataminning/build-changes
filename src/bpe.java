import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import org.slf4j.Logger;

public class bpe {
   public static final Codec<bpe> a = Codec.INT.xmap(bpe::a, bpe::a);
   private static final bpe b = new bpe(1);
   private static final Logger c = LogUtils.getLogger();
   private final int d;

   private bpe(int $$0) {
      this.d = $$0;
   }

   public static bpe a(int $$0) {
      if ($$0 == 1) {
         return b;
      } else {
         b($$0);
         return new bpe($$0);
      }
   }

   public int a() {
      return this.d;
   }

   private static void b(int $$0) {
      if ($$0 < 0) {
         throw (IllegalArgumentException)ac.b(new IllegalArgumentException("Weight should be >= 0"));
      } else {
         if ($$0 == 0 && aa.aX) {
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
      return this == $$0 ? true : $$0 instanceof bpe && this.d == ((bpe)$$0).d;
   }
}
