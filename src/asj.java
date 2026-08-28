import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class asj implements ash {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private asj(int $$0) {
      this.b = $$0;
   }

   public static asj b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static asj c(int $$0) {
      int $$1 = ash.a($$0);
      return new asj($$1 * $$1);
   }

   public static asj c() {
      return new asj(0);
   }

   @Override
   public void a(dgf $$0) {
      this.e = ae.c();
      this.d = this.e;
   }

   @Override
   public void a(dgf $$0, @Nullable eak $$1) {
      if ($$1 == eak.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ae.c() > this.e) {
         this.e += 500L;
         a.info(xk.a("menu.preparingSpawn", azu.a($$2, 0, 100)).getString());
      }
   }

   @Override
   public void a() {
   }

   @Override
   public void b() {
      a.info("Time elapsed: {} ms", ae.c() - this.d);
      this.e = Long.MAX_VALUE;
   }

   public int d() {
      return this.b == 0 ? 100 : azu.d((float)this.c * 100.0F / (float)this.b);
   }
}
