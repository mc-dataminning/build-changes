import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fpz extends fqb {
   private static final Logger b = LogUtils.getLogger();
   private static final xa c = xa.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final gad f;
   private final String g;

   public fpz(long $$0, int $$1, String $$2, gad $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      fmd $$0 = fmd.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            fnt $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new foq(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (foa var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fnz var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var5);
            a(new fos(var5, this.f));
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
   public xa a() {
      return c;
   }
}
