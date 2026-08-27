import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ero extends err {
   private static final Logger b = LogUtils.getLogger();
   private static final ur c = ur.c("mco.snapshot.creating");
   private final long d;
   private final erk e;
   private final String f;
   private final String g;
   private final env h;
   @Nullable
   private erz i;
   @Nullable
   private ert j;

   public ero(env $$0, long $$1, erk $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      eoa $$0 = eoa.a();

      try {
         eor $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new erz($$1.a, this.f, this.g);
         this.j = new ert(this.e, $$1.a, eqp.a, () -> esr.N().execute(() -> env.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (epn var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public ur a() {
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
