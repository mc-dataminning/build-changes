import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fim extends fig {
   private static final Logger b = LogUtils.getLogger();
   private static final xi c = xi.c("mco.backup.restoring");
   private final fex d;
   private final long e;
   private final fgq f;

   public fim(fex $$0, long $$1, fgq $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fer $$0 = fer.a();
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
         } catch (fgd var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fgc var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fgu(var5, this.f));
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
   public xi a() {
      return c;
   }
}
