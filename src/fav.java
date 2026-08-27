import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fav extends fay {
   private static final Logger b = LogUtils.getLogger();
   private static final wi c = wi.c("mco.snapshot.creating");
   private final long d;
   private final far e;
   private final String f;
   private final String g;
   private final exc h;
   @Nullable
   private fba i;
   @Nullable
   private fbb j;

   public fav(exc $$0, long $$1, far $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      exh $$0 = exh.a();

      try {
         exy $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fba($$1.a, this.f, this.g);
         this.j = new fbb(this.e, $$1.a, ezw.a, () -> fby.Q().execute(() -> exc.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (eyu var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public wi a() {
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
