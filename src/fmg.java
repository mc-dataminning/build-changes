import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fmg extends fmb {
   private static final Logger b = LogUtils.getLogger();
   private static final wv c = wv.c("mco.backup.restoring");
   private final fiu d;
   private final long e;
   private final fko f;

   public fmg(fiu $$0, long $$1, fko $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fie $$0 = fie.a();
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
         } catch (fkb var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fka var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fks(var5, this.f));
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
   public wv a() {
      return c;
   }
}
