import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbr extends fbu {
   private static final Logger b = LogUtils.getLogger();
   private static final ws c = ws.c("mco.snapshot.creating");
   private final long d;
   private final fbn e;
   private final String f;
   private final String g;
   private final exy h;
   @Nullable
   private fbw i;
   @Nullable
   private fbx j;

   public fbr(exy $$0, long $$1, fbn $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      eyd $$0 = eyd.a();

      try {
         eyu $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fbw($$1.a, this.f, this.g);
         this.j = new fbx(this.e, $$1.a, fas.a, () -> fcu.Q().execute(() -> exy.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (ezq var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public ws a() {
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
