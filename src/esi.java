import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class esi extends esd {
   private static final Logger b = LogUtils.getLogger();
   private static final ur c = ur.c("mco.backup.restoring");
   private final eos d;
   private final long e;
   private final eqm f;

   public esi(eos $$0, long $$1, eqm $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eom $$0 = eom.a();
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
         } catch (eqa var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (epz var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new eqq(var5, this.f));
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
   public ur a() {
      return c;
   }
}
