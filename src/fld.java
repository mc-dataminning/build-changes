import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fld extends fky {
   private static final Logger b = LogUtils.getLogger();
   private static final xv c = xv.c("mco.backup.restoring");
   private final fhr d;
   private final long e;
   private final fjl f;

   public fld(fhr $$0, long $$1, fjl $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fhb $$0 = fhb.a();
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
         } catch (fiy var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fix var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fjp(var5, this.f));
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
   public xv a() {
      return c;
   }
}
