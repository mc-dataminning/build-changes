import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fqi extends fqd {
   private static final Logger b = LogUtils.getLogger();
   private static final xc c = xc.c("mco.backup.restoring");
   private final fmv d;
   private final long e;
   private final fop f;

   public fqi(fmv $$0, long $$1, fop $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fmf $$0 = fmf.a();
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
         } catch (foc var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fob var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fou(var5, this.f));
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
   public xc a() {
      return c;
   }
}
