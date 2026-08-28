import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fhw extends fhy {
   private static final Logger b = LogUtils.getLogger();
   private static final xh c = xh.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final fqs f;
   private final String g;

   public fhw(long $$0, int $$1, String $$2, fqs $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      fej $$0 = fej.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            ffo $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new fgl(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (ffv var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (ffu var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var5);
            a(new fgm(var5, this.f));
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
   public xh a() {
      return c;
   }
}
