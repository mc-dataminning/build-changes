import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class flb extends fld {
   private static final Logger b = LogUtils.getLogger();
   private static final xv c = xv.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final ftw f;
   private final String g;

   public flb(long $$0, int $$1, String $$2, ftw $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      fhg $$0 = fhg.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            fiw $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new fjt(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (fjd var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fjc var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var5);
            a(new fju(var5, this.f));
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
   public xv a() {
      return c;
   }
}
