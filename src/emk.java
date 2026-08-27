import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emk extends emo {
   private static final Logger c = LogUtils.getLogger();
   private final ejq d;
   private final ela e;

   public emk(ejq $$0, ela $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      this.b(sw.c("mco.configure.world.closing"));
      eiz $$0 = eiz.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.c()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.c();
               this.d.e = ejq.b.a;
               a(this.e);
               break;
            }
         } catch (ekn var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.e);
         } catch (Exception var5) {
            if (this.c()) {
               return;
            }

            c.error("Failed to close server", var5);
            this.a("Failed to close the server");
         }
      }
   }
}
