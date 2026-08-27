import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ept extends epl {
   private static final Logger c = LogUtils.getLogger();
   private final String d;
   private final String e;
   private final long f;
   private final eya g;

   public ept(long $$0, String $$1, String $$2, eya $$3) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      this.b(tf.c("mco.create.world.wait"));
      elv $$0 = elv.a();

      try {
         $$0.a(this.f, this.d, this.e);
         a(this.g);
      } catch (eni var3) {
         c.error("Couldn't create world", var3);
         this.a(var3);
      } catch (Exception var4) {
         c.error("Could not create world", var4);
         this.a(var4);
      }
   }
}
