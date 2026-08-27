import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class esb extends esd {
   private static final Logger b = LogUtils.getLogger();
   private static final ur c = ur.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final fau f;
   private final String g;

   public esb(long $$0, int $$1, String $$2, fau $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      eom $$0 = eom.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            ept $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new eqp(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (eqa var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (epz var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var5);
            a(new eqq(var5, this.f));
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
   public ur a() {
      return c;
   }
}
