import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epv extends epx {
   private static final Logger b = LogUtils.getLogger();
   private static final tn c = tn.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final eym f;
   private final String g;

   public epv(long $$0, int $$1, String $$2, eym $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
   }

   @Override
   public void run() {
      emh $$0 = emh.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            eno $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new eok(this.f, $$2, this.g, $$0x -> {
            }));
            return;
         } catch (env var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (enu var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't download world data", var5);
            a(new eol(var5, this.f));
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
   public tn a() {
      return c;
   }
}
