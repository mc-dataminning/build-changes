import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epj extends epl {
   private static final Logger c = LogUtils.getLogger();
   private final long d;
   private final int e;
   private final eya f;
   private final String g;

   public epj(long $$0, int $$1, String $$2, eya $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      this.b(tf.c("mco.download.preparing"));
      elv $$0 = elv.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.c()) {
               return;
            }

            enc $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.c()) {
               return;
            }

            a(new enz(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (enj var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (eni var5) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't download world data", var5);
            a(new eoa(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't download world data", var6);
            this.a(var6);
            return;
         }
      }
   }
}
