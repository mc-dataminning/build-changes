import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aky implements akw {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   public aky(int $$0) {
      int $$1 = $$0 * 2 + 1;
      this.b = $$1 * $$1;
   }

   @Override
   public void a(cox $$0) {
      this.e = ac.b();
      this.d = this.e;
   }

   @Override
   public void a(cox $$0, @Nullable dhf $$1) {
      if ($$1 == dhf.n) {
         this.c++;
      }

      int $$2 = this.c();
      if (ac.b() > this.e) {
         this.e += 500L;
         a.info(ti.a("menu.preparingSpawn", ars.a($$2, 0, 100)).getString());
      }
   }

   @Override
   public void a() {
   }

   @Override
   public void b() {
      a.info("Time elapsed: {} ms", ac.b() - this.d);
      this.e = Long.MAX_VALUE;
   }

   public int c() {
      return ars.d((float)this.c * 100.0F / (float)this.b);
   }
}
