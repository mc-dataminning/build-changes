import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fkm extends fki {
   private static final Logger b = LogUtils.getLogger();
   private final long c;
   private final wp d;
   private final Runnable e;

   public fkm(long $$0, wp $$1, Runnable $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   protected abstract void a(fgl var1, long var2) throws fih;

   @Override
   public void run() {
      fgl $$0 = fgl.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            this.a($$0, this.c);
            if (this.d()) {
               return;
            }

            this.e.run();
            return;
         } catch (fii var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (Exception var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't reset world");
            this.a(var5);
            return;
         }
      }
   }

   @Override
   public wp a() {
      return this.d;
   }
}
