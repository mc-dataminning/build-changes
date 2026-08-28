import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fkk extends fkf {
   private static final Logger b = LogUtils.getLogger();
   private static final wo c = wo.c("mco.backup.restoring");
   private final fgy d;
   private final long e;
   private final fis f;

   public fkk(fgy $$0, long $$1, fis $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fgi $$0 = fgi.a();
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
         } catch (fif var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fie var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fiw(var5, this.f));
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
   public wo a() {
      return c;
   }
}
