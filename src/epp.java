import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class epp extends epl {
   private static final Logger c = LogUtils.getLogger();
   private final long d;
   private final tf e;
   private final Runnable f;

   public epp(long $$0, tf $$1, Runnable $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected abstract void a(elv var1, long var2) throws eni;

   @Override
   public void run() {
      elv $$0 = elv.a();
      this.b(this.e);
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.c()) {
               return;
            }

            this.a($$0, this.d);
            if (this.c()) {
               return;
            }

            this.f.run();
            return;
         } catch (enj var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (Exception var5) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't reset world");
            this.a(var5);
            return;
         }
      }
   }
}
