import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhv extends fhy {
   private static final Logger b = LogUtils.getLogger();
   private static final xh c = xh.c("mco.snapshot.creating");
   private final long d;
   private final fhr e;
   private final String f;
   private final String g;
   private final fee h;
   @Nullable
   private fia i;
   @Nullable
   private fib j;

   public fhv(fee $$0, long $$1, fhr $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fej $$0 = fej.a();

      try {
         ffa $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fia($$1.a, this.f, this.g);
         this.j = new fib(this.e, $$1.a, fgw.a, () -> fja.Q().execute(() -> fee.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (ffu var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public xh a() {
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
