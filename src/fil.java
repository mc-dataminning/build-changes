import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fil extends fig {
   private static final Logger b = LogUtils.getLogger();
   private final long c;
   private final xi d;
   private final Runnable e;

   public fil(long $$0, xi $$1, Runnable $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   protected abstract void a(fer var1, long var2) throws fgc;

   @Override
   public void run() {
      fer $$0 = fer.a();
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
         } catch (fgd var4) {
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
   public xi a() {
      return this.d;
   }
}
