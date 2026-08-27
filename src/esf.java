import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esf extends esi {
   private static final Logger b = LogUtils.getLogger();
   private static final uv c = uv.c("mco.snapshot.creating");
   private final long d;
   private final esb e;
   private final String f;
   private final String g;
   private final eom h;
   @Nullable
   private esq i;
   @Nullable
   private esk j;

   public esf(eom $$0, long $$1, esb $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      eor $$0 = eor.a();

      try {
         epi $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new esq($$1.a, this.f, this.g);
         this.j = new esk(this.e, $$1.a, erg.a, () -> eti.N().execute(() -> eom.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (eqe var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public uv a() {
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
