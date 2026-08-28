import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fhf extends fgz {
   private static final Logger b = LogUtils.getLogger();
   private static final xd c = xd.c("mco.backup.restoring");
   private final fdq d;
   private final long e;
   private final ffj f;

   public fhf(fdq $$0, long $$1, ffj $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fdk $$0 = fdk.a();
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
         } catch (few var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fev var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new ffn(var5, this.f));
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
   public xd a() {
      return c;
   }
}
