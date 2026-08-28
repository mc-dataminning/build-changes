import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fec extends fee {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final fnc f;
   private final String g;

   public fec(long $$0, int $$1, String $$2, fnc $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      fan $$0 = fan.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            fbu $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new fcq(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (fcb var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fca var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var5);
            a(new fcr(var5, this.f));
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
   public xo a() {
      return c;
   }
}
