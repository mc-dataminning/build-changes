import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class epr extends epn {
   private static final Logger c = LogUtils.getLogger();
   private final long d;
   private final te e;
   private final Runnable f;

   public epr(long $$0, te $$1, Runnable $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected abstract void a(elx var1, long var2) throws enk;

   @Override
   public void run() {
      elx $$0 = elx.a();
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
         } catch (enl var4) {
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
