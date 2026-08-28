import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arf implements ard {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private arf(int $$0) {
      this.b = $$0;
   }

   public static arf b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static arf c(int $$0) {
      int $$1 = ard.a($$0);
      return new arf($$1 * $$1);
   }

   public static arf c() {
      return new arf(0);
   }

   @Override
   public void a(dcd $$0) {
      this.e = ad.c();
      this.d = this.e;
   }

   @Override
   public void a(dcd $$0, @Nullable dvz $$1) {
      if ($$1 == dvz.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ad.c() > this.e) {
         this.e += 500L;
         a.info(wz.a("menu.preparingSpawn", ayo.a($$2, 0, 100)).getString());
      }
   }

   @Override
   public void a() {
   }

   @Override
   public void b() {
      a.info("Time elapsed: {} ms", ad.c() - this.d);
      this.e = Long.MAX_VALUE;
   }

   public int d() {
      return this.b == 0 ? 100 : ayo.d((float)this.c * 100.0F / (float)this.b);
   }
}
