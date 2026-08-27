import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eue extends euh {
   private static final Logger b = LogUtils.getLogger();
   private static final vf c = vf.c("mco.snapshot.creating");
   private final long d;
   private final eua e;
   private final String f;
   private final String g;
   private final eql h;
   @Nullable
   private eup i;
   @Nullable
   private euj j;

   public eue(eql $$0, long $$1, eua $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      eqq $$0 = eqq.a();

      try {
         erh $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new eup($$1.a, this.f, this.g);
         this.j = new euj(this.e, $$1.a, etf.a, () -> evh.O().execute(() -> eql.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (esd var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public vf a() {
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
