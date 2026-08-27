import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eye extends eyg {
   private static final Logger b = LogUtils.getLogger();
   private static final vu c = vu.c("mco.download.preparing");
   private final long d;
   private final int e;
   private final fhf f;
   private final String g;

   public eye(long $$0, int $$1, String $$2, fhf $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
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

            evw $$2 = $$0.b(this.d, this.e);
            a(1L);
            if (this.d()) {
               return;
            }

            a(new ews(this.f, $$2, this.g, $$0x -> {
            }));
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

            b.error("Couldn't download world data", var5);
            a(new ewt(var5, this.f));
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
   public vu a() {
      return c;
   }
}
