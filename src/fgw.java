import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgw extends fgz {
   private static final Logger b = LogUtils.getLogger();
   private static final xd c = xd.c("mco.snapshot.creating");
   private final long d;
   private final fgs e;
   private final String f;
   private final String g;
   private final fdf h;
   @Nullable
   private fhb i;
   @Nullable
   private fhc j;

   public fgw(fdf $$0, long $$1, fgs $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fdk $$0 = fdk.a();

      try {
         feb $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fhb($$1.a, this.f, this.g);
         this.j = new fhc(this.e, $$1.a, ffx.a, () -> fib.Q().execute(() -> fdf.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fev var3) {
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
