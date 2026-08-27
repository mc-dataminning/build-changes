import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class exq extends exk {
   private static final Logger b = LogUtils.getLogger();
   private static final vs c = vs.c("mco.backup.restoring");
   private final etz d;
   private final long e;
   private final evt f;

   public exq(etz $$0, long $$1, evt $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ett $$0 = ett.a();
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

            a(this.f.f());
            return;
         } catch (evh var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (evg var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new evx(var5, this.f));
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
   public vs a() {
      return c;
   }
}
