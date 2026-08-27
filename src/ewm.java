import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class ewm extends ewh {
   private static final Logger b = LogUtils.getLogger();
   private final long c;
   private final vq d;
   private final Runnable e;

   public ewm(long $$0, vq $$1, Runnable $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   protected abstract void a(esq var1, long var2) throws eud;

   @Override
   public void run() {
      esq $$0 = esq.a();
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
         } catch (eue var4) {
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
   public vq a() {
      return this.d;
   }
}
