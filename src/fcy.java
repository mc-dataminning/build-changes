import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcy extends fdb {
   private static final Logger b = LogUtils.getLogger();
   private static final wx c = wx.c("mco.snapshot.creating");
   private final long d;
   private final fcu e;
   private final String f;
   private final String g;
   private final ezf h;
   @Nullable
   private fdd i;
   @Nullable
   private fde j;

   public fcy(ezf $$0, long $$1, fcu $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      ezk $$0 = ezk.a();

      try {
         fab $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fdd($$1.a, this.f, this.g);
         this.j = new fde(this.e, $$1.a, fbz.a, () -> feb.Q().execute(() -> ezf.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fax var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public wx a() {
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
