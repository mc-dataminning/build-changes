import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emt extends emo {
   private static final Logger c = LogUtils.getLogger();
   private final ejf d;
   private final long e;
   private final ela f;

   public emt(ejf $$0, long $$1, ela $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      this.b(sw.c("mco.backup.restoring"));
      eiz $$0 = eiz.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.c()) {
               return;
            }

            $$0.c(this.e, this.d.a);
            a(1L);
            if (this.c()) {
               return;
            }

            a(this.f.d());
            return;
         } catch (ekn var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.e);
            $$1++;
         } catch (ekm var5) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't restore backup", var5);
            a(new ele(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't restore backup", var6);
            this.a(var6.getLocalizedMessage());
            return;
         }
      }
   }
}
