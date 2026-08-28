import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class feb extends fee {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.snapshot.creating");
   private final long d;
   private final fdx e;
   private final String f;
   private final String g;
   private final fai h;
   @Nullable
   private feg i;
   @Nullable
   private feh j;

   public feb(fai $$0, long $$1, fdx $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fan $$0 = fan.a();

      try {
         fbe $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new feg($$1.a, this.f, this.g);
         this.j = new feh(this.e, $$1.a, fdc.a, () -> ffe.Q().execute(() -> fai.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fca var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public xo a() {
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
