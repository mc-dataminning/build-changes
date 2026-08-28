import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fkn extends fki {
   private static final Logger b = LogUtils.getLogger();
   private static final wp c = wp.c("mco.backup.restoring");
   private final fhb d;
   private final long e;
   private final fiv f;

   public fkn(fhb $$0, long $$1, fiv $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fgl $$0 = fgl.a();
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
         } catch (fii var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fih var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fiz(var5, this.f));
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
   public wp a() {
      return c;
   }
}
