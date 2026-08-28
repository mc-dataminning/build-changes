import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface few {
   few a = new few() {
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

   static few a(final int $$0) {
      return new few() {
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
