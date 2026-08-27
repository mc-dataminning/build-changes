import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epl extends epn {
   private static final Logger c = LogUtils.getLogger();
   private final long d;
   private final int e;
   private final exv f;
   private final String g;

   public epl(long $$0, int $$1, String $$2, exv $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      this.b(te.c("mco.download.preparing"));
      elx $$0 = elx.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.c()) {
               return;
            }

            ene $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.c()) {
               return;
            }

            a(new eob(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (enl var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (enk var5) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't download world data", var5);
            a(new eoc(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't download world data", var6);
            this.a(var6);
            return;
         }
      }
   }
}
