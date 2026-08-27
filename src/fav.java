import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fav extends fap {
   private static final Logger b = LogUtils.getLogger();
   private static final wg c = wg.c("mco.backup.restoring");
   private final exe d;
   private final long e;
   private final eyy f;

   public fav(exe $$0, long $$1, eyy $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ewy $$0 = ewy.a();
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
         } catch (eym var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (eyl var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new ezc(var5, this.f));
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
   public wg a() {
      return c;
   }
}
