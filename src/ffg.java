import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffg extends ffj {
   private static final Logger b = LogUtils.getLogger();
   private static final xe c = xe.c("mco.snapshot.creating");
   private final long d;
   private final ffc e;
   private final String f;
   private final String g;
   private final fbn h;
   @Nullable
   private ffl i;
   @Nullable
   private ffm j;

   public ffg(fbn $$0, long $$1, ffc $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fbs $$0 = fbs.a();

      try {
         fcj $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new ffl($$1.a, this.f, this.g);
         this.j = new ffm(this.e, $$1.a, feh.a, () -> fgj.Q().execute(() -> fbn.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fdf var3) {
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
