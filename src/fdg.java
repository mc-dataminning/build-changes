import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fdg extends fcz {
   private static final Logger b = LogUtils.getLogger();
   private static final wx c = wx.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final faq e;
   private final fbi f;

   public fdg(long $$0, faq $$1, fbi $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ezi $$0 = ezi.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (faw var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
         } catch (Exception var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't start mini game!");
            this.a(var5);
         }
      }
   }

   @Override
   public wx a() {
      return c;
   }
}
