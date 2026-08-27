import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eth extends etk {
   private static final Logger b = LogUtils.getLogger();
   private static final vb c = vb.c("mco.snapshot.creating");
   private final long d;
   private final etd e;
   private final String f;
   private final String g;
   private final epo h;
   @Nullable
   private ets i;
   @Nullable
   private etm j;

   public eth(epo $$0, long $$1, etd $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      ept $$0 = ept.a();

      try {
         eqk $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new ets($$1.a, this.f, this.g);
         this.j = new etm(this.e, $$1.a, esi.a, () -> euk.N().execute(() -> epo.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (erg var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public vb a() {
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
