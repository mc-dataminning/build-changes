import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import org.slf4j.Logger;

public class bpb {
   public static final Codec<bpb> a = Codec.INT.xmap(bpb::a, bpb::a);
   private static final bpb b = new bpb(1);
   private static final Logger c = LogUtils.getLogger();
   private final int d;

   private bpb(int $$0) {
      this.d = $$0;
   }

   public static bpb a(int $$0) {
      if ($$0 == 1) {
         return b;
      } else {
         b($$0);
         return new bpb($$0);
      }
   }

   public int a() {
      return this.d;
   }

   private static void b(int $$0) {
      if ($$0 < 0) {
         throw (IllegalArgumentException)ad.b(new IllegalArgumentException("Weight should be >= 0"));
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
      return this == $$0 ? true : $$0 instanceof bpb && this.d == ((bpb)$$0).d;
   }
}
