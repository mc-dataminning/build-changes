import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epq extends epl {
   private static final Logger c = LogUtils.getLogger();
   private final emb d;
   private final long e;
   private final enw f;

   public epq(emb $$0, long $$1, enw $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      this.b(tf.c("mco.backup.restoring"));
      elv $$0 = elv.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.c()) {
               return;
            }

            $$0.b(this.e, this.d.a);
            a(1L);
            if (this.c()) {
               return;
            }

            a(this.f.g());
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

            c.error("Couldn't restore backup", var5);
            a(new eoa(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't restore backup", var6);
            this.a(var6);
            return;
         }
      }
   }
}
