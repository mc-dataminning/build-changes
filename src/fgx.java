import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fgx extends fgz {
   private static final Logger b = LogUtils.getLogger();
   private static final xd c = xd.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final fpt f;
   private final String g;

   public fgx(long $$0, int $$1, String $$2, fpt $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      fdk $$0 = fdk.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            fep $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new ffm(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (few var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fev var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var5);
            a(new ffn(var5, this.f));
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
   public xd a() {
      return c;
   }
}
