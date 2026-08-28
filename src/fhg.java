import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhg extends fhj {
   private static final Logger b = LogUtils.getLogger();
   private static final xd c = xd.c("mco.snapshot.creating");
   private final long d;
   private final fhc e;
   private final String f;
   private final String g;
   private final fdp h;
   @Nullable
   private fhl i;
   @Nullable
   private fhm j;

   public fhg(fdp $$0, long $$1, fhc $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fdu $$0 = fdu.a();

      try {
         fel $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fhl($$1.a, this.f, this.g);
         this.j = new fhm(this.e, $$1.a, fgh.a, () -> fil.Q().execute(() -> fdp.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fff var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public xd a() {
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
