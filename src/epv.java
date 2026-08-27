import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epv extends epn {
   private static final Logger c = LogUtils.getLogger();
   private final String d;
   private final String e;
   private final long f;
   private final exv g;

   public epv(long $$0, String $$1, String $$2, exv $$3) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      this.b(te.c("mco.create.world.wait"));
      elx $$0 = elx.a();

      try {
         $$0.a(this.f, this.d, this.e);
         a(this.g);
      } catch (enk var3) {
         c.error("Couldn't create world", var3);
         this.a(var3);
      } catch (Exception var4) {
         c.error("Could not create world", var4);
         this.a(var4);
      }
   }
}
