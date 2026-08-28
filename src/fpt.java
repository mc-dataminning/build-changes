import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fpt extends fpo {
   private static final Logger b = LogUtils.getLogger();
   private static final xg c = xg.c("mco.backup.restoring");
   private final fmg d;
   private final long e;
   private final foa f;

   public fpt(fmg $$0, long $$1, foa $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      flq $$0 = flq.a();
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
         } catch (fnn var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fnm var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new foe(var5, this.f));
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
   public xg a() {
      return c;
   }
}
