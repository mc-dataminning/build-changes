import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euo extends eur {
   private static final Logger b = LogUtils.getLogger();
   private static final vg c = vg.c("mco.snapshot.creating");
   private final long d;
   private final euk e;
   private final String f;
   private final String g;
   private final eqv h;
   @Nullable
   private euz i;
   @Nullable
   private eut j;

   public euo(eqv $$0, long $$1, euk $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      era $$0 = era.a();

      try {
         err $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new euz($$1.a, this.f, this.g);
         this.j = new eut(this.e, $$1.a, etp.a, () -> evr.O().execute(() -> eqv.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (esn var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public vg a() {
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
