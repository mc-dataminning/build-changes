import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fdd extends fdb {
   private static final Logger b = LogUtils.getLogger();
   private static final wx c = wx.c("mco.create.world.wait");
   private final String d;
   private final String e;
   private final long f;

   public fdd(long $$0, String $$1, String $$2) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public void run() {
      ezk $$0 = ezk.a();

      try {
         $$0.a(this.f, this.d, this.e);
      } catch (fax var3) {
         b.error("Couldn't create world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Could not create world", var4);
         this.a(var4);
      }
   }

   @Override
   public wx a() {
      return c;
   }
}
