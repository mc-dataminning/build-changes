import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fec extends fef {
   private static final Logger b = LogUtils.getLogger();
   private static final xp c = xp.c("mco.snapshot.creating");
   private final long d;
   private final fdy e;
   private final String f;
   private final String g;
   private final faj h;
   @Nullable
   private feh i;
   @Nullable
   private fei j;

   public fec(faj $$0, long $$1, fdy $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fao $$0 = fao.a();

      try {
         fbf $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new feh($$1.a, this.f, this.g);
         this.j = new fei(this.e, $$1.a, fdd.a, () -> fff.Q().execute(() -> faj.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fcb var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public xp a() {
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
