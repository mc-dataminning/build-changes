import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhk extends fhn {
   private static final Logger b = LogUtils.getLogger();
   private static final xe c = xe.c("mco.snapshot.creating");
   private final long d;
   private final fhg e;
   private final String f;
   private final String g;
   private final fdt h;
   @Nullable
   private fhp i;
   @Nullable
   private fhq j;

   public fhk(fdt $$0, long $$1, fhg $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fdy $$0 = fdy.a();

      try {
         fep $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fhp($$1.a, this.f, this.g);
         this.j = new fhq(this.e, $$1.a, fgl.a, () -> fip.Q().execute(() -> fdt.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (ffj var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public xe a() {
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
