import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyf extends eyi {
   private static final Logger b = LogUtils.getLogger();
   private static final vu c = vu.c("mco.snapshot.creating");
   private final long d;
   private final eyb e;
   private final String f;
   private final String g;
   private final eum h;
   @Nullable
   private eyk i;
   @Nullable
   private eyl j;

   public eyf(eum $$0, long $$1, eyb $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      eur $$0 = eur.a();

      try {
         evi $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new eyk($$1.a, this.f, this.g);
         this.j = new eyl(this.e, $$1.a, exg.a, () -> ezi.Q().execute(() -> eum.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (ewe var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public vu a() {
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
