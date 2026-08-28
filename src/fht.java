import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fht extends fhn {
   private static final Logger b = LogUtils.getLogger();
   private static final xe c = xe.c("mco.backup.restoring");
   private final fee d;
   private final long e;
   private final ffx f;

   public fht(fee $$0, long $$1, ffx $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fdy $$0 = fdy.a();
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
         } catch (ffk var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (ffj var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fgb(var5, this.f));
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
   public xe a() {
      return c;
   }
}
