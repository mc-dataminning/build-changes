import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eps extends epn {
   private static final Logger c = LogUtils.getLogger();
   private final emd d;
   private final long e;
   private final eny f;

   public eps(emd $$0, long $$1, eny $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      this.b(te.c("mco.backup.restoring"));
      elx $$0 = elx.a();
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

            a(this.f.f());
            return;
         } catch (enl var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (enk var5) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't restore backup", var5);
            a(new eoc(var5, this.f));
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
