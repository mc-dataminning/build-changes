import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class ems extends emo {
   private static final Logger c = LogUtils.getLogger();
   private final long d;
   private final sw e;
   private final Runnable f;

   public ems(long $$0, sw $$1, Runnable $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   protected abstract void a(eiz var1, long var2) throws ekm;

   @Override
   public void run() {
      eiz $$0 = eiz.a();
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
         } catch (ekn var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.e);
            $$1++;
         } catch (Exception var5) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't reset world");
            this.a(var5.toString());
            return;
         }
      }
   }
}
