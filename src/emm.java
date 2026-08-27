import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emm extends emo {
   private static final Logger c = LogUtils.getLogger();
   private final long d;
   private final int e;
   private final euq f;
   private final String g;

   public emm(long $$0, int $$1, String $$2, euq $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      this.b(sw.c("mco.download.preparing"));
      eiz $$0 = eiz.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.c()) {
               return;
            }

            ekg $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.c()) {
               return;
            }

            a(new eld(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (ekn var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.e);
            $$1++;
         } catch (ekm var5) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't download world data");
            a(new ele(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't download world data", var6);
            this.a(var6.getLocalizedMessage());
            return;
         }
      }
   }
}
