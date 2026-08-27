import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ewm extends ewo {
   private static final Logger b = LogUtils.getLogger();
   private static final vq c = vq.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final ffl f;
   private final String g;

   public ewm(long $$0, int $$1, String $$2, ffl $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      esx $$0 = esx.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            eue $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new eva(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (eul var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (euk var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var5);
            a(new evb(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var6);
            this.a(var6);
            return;
         }
      }
   }

   @Override
   public vq a() {
      return c;
   }
}
