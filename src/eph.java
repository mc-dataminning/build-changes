import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface eph {
   eph a = new eph() {
      @Override
      public long a() {
         return 1L;
      }

      @Override
      public long b() {
         return 1L;
      }
   };

   long a();

   long b();

   static eph a(final int $$0) {
      return new eph() {
         private static final Logger c = LogUtils.getLogger();
         private int d;

         @Override
         public long a() {
            this.d = 0;
            return 1L;
         }

         @Override
         public long b() {
            this.d++;
            long $$0 = Math.min(1L << this.d, (long)$$0);
            c.debug("Skipping for {} extra cycles", $$0);
            return $$0;
         }
      };
   }
}
