import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fek extends fen {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.snapshot.creating");
   private final long d;
   private final feg e;
   private final String f;
   private final String g;
   private final far h;
   @Nullable
   private fep i;
   @Nullable
   private feq j;

   public fek(far $$0, long $$1, feg $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      faw $$0 = faw.a();

      try {
         fbn $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fep($$1.a, this.f, this.g);
         this.j = new feq(this.e, $$1.a, fdl.a, () -> ffn.Q().execute(() -> far.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fcj var3) {
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
