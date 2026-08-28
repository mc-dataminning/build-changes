import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fea extends fed {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.snapshot.creating");
   private final long d;
   private final fdw e;
   private final String f;
   private final String g;
   private final fah h;
   @Nullable
   private fef i;
   @Nullable
   private feg j;

   public fea(fah $$0, long $$1, fdw $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fam $$0 = fam.a();

      try {
         fbd $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fef($$1.a, this.f, this.g);
         this.j = new feg(this.e, $$1.a, fdb.a, () -> ffd.Q().execute(() -> fah.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fbz var3) {
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
