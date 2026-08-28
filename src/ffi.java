import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffi extends ffl {
   private static final Logger b = LogUtils.getLogger();
   private static final wz c = wz.c("mco.snapshot.creating");
   private final long d;
   private final ffe e;
   private final String f;
   private final String g;
   private final fbr h;
   @Nullable
   private ffn i;
   @Nullable
   private ffo j;

   public ffi(fbr $$0, long $$1, ffe $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fbw $$0 = fbw.a();

      try {
         fcn $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new ffn($$1.a, this.f, this.g);
         this.j = new ffo(this.e, $$1.a, fej.a, () -> fgm.Q().execute(() -> fbr.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fdh var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public wz a() {
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
