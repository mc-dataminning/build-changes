import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epv extends epq {
   private static final Logger b = LogUtils.getLogger();
   private static final ti c = ti.c("mco.backup.restoring");
   private final emg d;
   private final long e;
   private final eoa f;

   public epv(emg $$0, long $$1, eoa $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ema $$0 = ema.a();
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
         } catch (eno var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (enn var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new eoe(var5, this.f));
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
   public ti a() {
      return c;
   }
}
