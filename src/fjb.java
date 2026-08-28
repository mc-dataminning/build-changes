import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fjb extends fiw {
   private static final Logger b = LogUtils.getLogger();
   private static final xl c = xl.c("mco.backup.restoring");
   private final ffq d;
   private final long e;
   private final fhj f;

   public fjb(ffq $$0, long $$1, fhj $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ffa $$0 = ffa.a();
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
         } catch (fgw var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fgv var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fhn(var5, this.f));
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
   public xl a() {
      return c;
   }
}
