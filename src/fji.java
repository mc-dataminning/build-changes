import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fji extends fjd {
   private static final Logger b = LogUtils.getLogger();
   private static final xj c = xj.c("mco.backup.restoring");
   private final ffx d;
   private final long e;
   private final fhq f;

   public fji(ffx $$0, long $$1, fhq $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ffh $$0 = ffh.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            $$0.b(this.e, this.d.a);
            a(1L);
            if (this.d()) {
               return;
            }

            a(this.f.g());
            return;
         } catch (fhd var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fhc var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fhu(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var6);
            this.a(var6);
            return;
         }
      }
   }

   @Override
   public xj a() {
      return c;
   }
}
