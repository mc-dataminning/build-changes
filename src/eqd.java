import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eqd extends epv {
   private static final Logger b = LogUtils.getLogger();
   private static final tm c = tm.c("mco.create.world.wait");
   private final String d;
   private final String e;
   private final long f;
   private final eyk g;

   public eqd(long $$0, String $$1, String $$2, eyk $$3) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      emf $$0 = emf.a();

      try {
         $$0.a(this.f, this.d, this.e);
         a(this.g);
      } catch (ens var3) {
         b.error("Couldn't create world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Could not create world", var4);
         this.a(var4);
      }
   }

   @Override
   public tm a() {
      return c;
   }
}
