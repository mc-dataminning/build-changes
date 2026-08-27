import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewl extends ewo {
   private static final Logger b = LogUtils.getLogger();
   private static final vq c = vq.c("mco.snapshot.creating");
   private final long d;
   private final ewh e;
   private final String f;
   private final String g;
   private final ess h;
   @Nullable
   private ewq i;
   @Nullable
   private ewr j;

   public ewl(ess $$0, long $$1, ewh $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      esx $$0 = esx.a();

      try {
         eto $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new ewq($$1.a, this.f, this.g);
         this.j = new ewr(this.e, $$1.a, evm.a, () -> exo.P().execute(() -> ess.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (euk var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public vq a() {
      return c;
   }

   @Override
   public void b() {
      super.b();
      if (this.i != null) {
         this.i.b();
      }

      if (this.j != null) {
         this.j.b();
      }
   }
}
