import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fdf extends fcz {
   private static final Logger b = LogUtils.getLogger();
   private static final wx c = wx.c("mco.backup.restoring");
   private final ezo d;
   private final long e;
   private final fbi f;

   public fdf(ezo $$0, long $$1, fbi $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ezi $$0 = ezi.a();
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
         } catch (faw var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
            $$1++;
         } catch (fav var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new fbm(var5, this.f));
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
   public wx a() {
      return c;
   }
}
