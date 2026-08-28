import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fni extends fnd {
   private static final Logger b = LogUtils.getLogger();
   private static final ww c = ww.c("mco.backup.restoring");
   private final fjw d;
   private final long e;
   private final flq f;

   public fni(fjw $$0, long $$1, flq $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fjg $$0 = fjg.a();
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
         } catch (fld var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (flc var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new flu(var5, this.f));
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
   public ww a() {
      return c;
   }
}
