import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etx extends eua {
   private static final Logger b = LogUtils.getLogger();
   private static final vd c = vd.c("mco.snapshot.creating");
   private final long d;
   private final ett e;
   private final String f;
   private final String g;
   private final eqe h;
   @Nullable
   private eui i;
   @Nullable
   private euc j;

   public etx(eqe $$0, long $$1, ett $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      eqj $$0 = eqj.a();

      try {
         era $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new eui($$1.a, this.f, this.g);
         this.j = new euc(this.e, $$1.a, esy.a, () -> eva.N().execute(() -> eqe.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (erw var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public vd a() {
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
