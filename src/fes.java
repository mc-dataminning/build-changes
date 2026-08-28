import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fes extends fev {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.snapshot.creating");
   private final long d;
   private final feo e;
   private final String f;
   private final String g;
   private final faz h;
   @Nullable
   private fex i;
   @Nullable
   private fey j;

   public fes(faz $$0, long $$1, feo $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fbe $$0 = fbe.a();

      try {
         fbv $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fex($$1.a, this.f, this.g);
         this.j = new fey(this.e, $$1.a, fdt.a, () -> ffw.Q().execute(() -> faz.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fcr var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public wu a() {
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
