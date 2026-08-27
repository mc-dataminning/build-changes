import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eym extends eyg {
   private static final Logger b = LogUtils.getLogger();
   private static final vu c = vu.c("mco.backup.restoring");
   private final euv d;
   private final long e;
   private final ewp f;

   public eym(euv $$0, long $$1, ewp $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eup $$0 = eup.a();
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
         } catch (ewd var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (ewc var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new ewt(var5, this.f));
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
   public vu a() {
      return c;
   }
}
