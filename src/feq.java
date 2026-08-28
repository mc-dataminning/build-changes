import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class feq extends fet {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.snapshot.creating");
   private final long d;
   private final fem e;
   private final String f;
   private final String g;
   private final fax h;
   @Nullable
   private fev i;
   @Nullable
   private few j;

   public feq(fax $$0, long $$1, fem $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fbc $$0 = fbc.a();

      try {
         fbt $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fev($$1.a, this.f, this.g);
         this.j = new few(this.e, $$1.a, fdr.a, () -> fft.Q().execute(() -> fax.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fcp var3) {
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
