import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fkf extends fkh {
   private static final Logger b = LogUtils.getLogger();
   private static final wp c = wp.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final ful f;
   private final String g;

   public fkf(long $$0, int $$1, String $$2, ful $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      fgk $$0 = fgk.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            fia $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new fix(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (fih var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fig var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var5);
            a(new fiy(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var6);
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
