import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euf extends eui {
   private static final Logger b = LogUtils.getLogger();
   private static final vf c = vf.c("mco.snapshot.creating");
   private final long d;
   private final eub e;
   private final String f;
   private final String g;
   private final eqm h;
   @Nullable
   private euq i;
   @Nullable
   private euk j;

   public euf(eqm $$0, long $$1, eub $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      eqr $$0 = eqr.a();

      try {
         eri $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new euq($$1.a, this.f, this.g);
         this.j = new euk(this.e, $$1.a, etg.a, () -> evi.O().execute(() -> eqm.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (ese var3) {
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
