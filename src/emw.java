import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emw extends emo {
   private static final Logger c = LogUtils.getLogger();
   private final String d;
   private final String e;
   private final long f;
   private final euq g;

   public emw(long $$0, String $$1, String $$2, euq $$3) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      this.b(sw.c("mco.create.world.wait"));
      eiz $$0 = eiz.a();

      try {
         $$0.a(this.f, this.d, this.e);
         a(this.g);
      } catch (ekm var3) {
         c.error("Couldn't create world");
         this.a(var3.toString());
      } catch (Exception var4) {
         c.error("Could not create world");
         this.a(var4.getLocalizedMessage());
      }
   }
}
