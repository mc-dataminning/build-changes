import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdx extends fea {
   private static final Logger b = LogUtils.getLogger();
   private static final xl c = xl.c("mco.snapshot.creating");
   private final long d;
   private final fdt e;
   private final String f;
   private final String g;
   private final fae h;
   @Nullable
   private fec i;
   @Nullable
   private fed j;

   public fdx(fae $$0, long $$1, fdt $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      faj $$0 = faj.a();

      try {
         fba $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fec($$1.a, this.f, this.g);
         this.j = new fed(this.e, $$1.a, fcy.a, () -> ffa.Q().execute(() -> fae.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fbw var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public xl a() {
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
