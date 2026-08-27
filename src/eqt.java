import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eqt extends eqo {
   private static final Logger b = LogUtils.getLogger();
   private static final ui c = ui.c("mco.backup.restoring");
   private final end d;
   private final long e;
   private final eox f;

   public eqt(end $$0, long $$1, eox $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      emx $$0 = emx.a();
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
         } catch (eol var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (eok var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new epb(var5, this.f));
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
   public ui a() {
      return c;
   }
}
