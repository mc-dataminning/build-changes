import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fie extends fhy {
   private static final Logger b = LogUtils.getLogger();
   private static final xh c = xh.c("mco.backup.restoring");
   private final fep d;
   private final long e;
   private final fgi f;

   public fie(fep $$0, long $$1, fgi $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
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

            $$0.b(this.e, this.d.a);
            a(1L);
            if (this.d()) {
               return;
            }

            a(this.f.g());
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

            b.error("Couldn't restore backup", var5);
            a(new fgm(var5, this.f));
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
   public xh a() {
      return c;
   }
}
