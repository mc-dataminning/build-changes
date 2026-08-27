import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class eul extends euh {
   private static final Logger b = LogUtils.getLogger();
   private final long c;
   private final vf d;
   private final Runnable e;

   public eul(long $$0, vf $$1, Runnable $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   protected abstract void a(eqq var1, long var2) throws esd;

   @Override
   public void run() {
      eqq $$0 = eqq.a();
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
         } catch (ese var4) {
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
   public vf a() {
      return this.d;
   }
}
