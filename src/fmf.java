import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class fmf extends fmb {
   private static final Logger b = LogUtils.getLogger();
   private final long c;
   private final wv d;
   private final Runnable e;

   public fmf(long $$0, wv $$1, Runnable $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   protected abstract void a(fie var1, long var2) throws fka;

   @Override
   public void run() {
      fie $$0 = fie.a();
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
         } catch (fkb var4) {
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
   public wv a() {
      return this.d;
   }
}
