import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fnu extends fnp {
   private static final Logger b = LogUtils.getLogger();
   private static final wy c = wy.c("mco.backup.restoring");
   private final fki d;
   private final long e;
   private final fmc f;

   public fnu(fki $$0, long $$1, fmc $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fjs $$0 = fjs.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            $$0.b(this.e, this.d.a);
            a(1L);
            if (this.d()) {
               return;
            }

            a(this.f.g());
            return;
         } catch (flp var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (flo var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fmg(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var6);
            this.a(var6);
            return;
         }
      }
   }

   @Override
   public wy a() {
      return c;
   }
}
