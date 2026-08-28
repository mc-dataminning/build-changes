import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fid extends fig {
   private static final Logger b = LogUtils.getLogger();
   private static final xi c = xi.c("mco.snapshot.creating");
   private final long d;
   private final fhz e;
   private final String f;
   private final String g;
   private final fem h;
   @Nullable
   private fii i;
   @Nullable
   private fij j;

   public fid(fem $$0, long $$1, fhz $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fer $$0 = fer.a();

      try {
         ffi $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fii($$1.a, this.f, this.g);
         this.j = new fij(this.e, $$1.a, fhe.a, () -> fji.Q().execute(() -> fem.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fgc var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public xi a() {
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
