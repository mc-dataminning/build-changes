import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fen extends feh {
   private static final Logger b = LogUtils.getLogger();
   private static final xp c = xp.c("mco.backup.restoring");
   private final faw d;
   private final long e;
   private final fcq f;

   public fen(faw $$0, long $$1, fcq $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      faq $$0 = faq.a();
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
         } catch (fce var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fcd var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fcu(var5, this.f));
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
   public xp a() {
      return c;
   }
}
