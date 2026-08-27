import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbe extends fay {
   private static final Logger b = LogUtils.getLogger();
   private static final wi c = wi.c("mco.backup.restoring");
   private final exn d;
   private final long e;
   private final ezh f;

   public fbe(exn $$0, long $$1, ezh $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      exh $$0 = exh.a();
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

            a(this.f.f());
            return;
         } catch (eyv var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (eyu var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new ezl(var5, this.f));
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
   public wi a() {
      return c;
   }
}
