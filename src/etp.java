import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class etp extends etk {
   private static final Logger b = LogUtils.getLogger();
   private static final vb c = vb.c("mco.backup.restoring");
   private final epz d;
   private final long e;
   private final ert f;

   public etp(epz $$0, long $$1, ert $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ept $$0 = ept.a();
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
         } catch (erh var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (erg var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new erx(var5, this.f));
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
   public vb a() {
      return c;
   }
}
