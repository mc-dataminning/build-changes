import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ewn extends ewh {
   private static final Logger b = LogUtils.getLogger();
   private static final vq c = vq.c("mco.backup.restoring");
   private final esw d;
   private final long e;
   private final euq f;

   public ewn(esw $$0, long $$1, euq $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      esq $$0 = esq.a();
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
         } catch (eue var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (eud var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new euu(var5, this.f));
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
   public vq a() {
      return c;
   }
}
