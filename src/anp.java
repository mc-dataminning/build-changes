import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class anp implements ann {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   public anp(int $$0) {
      int $$1 = $$0 * 2 + 1;
      this.b = $$1 * $$1;
   }

   @Override
   public void a(cte $$0) {
      this.e = ac.b();
      this.d = this.e;
   }

   @Override
   public void a(cte $$0, @Nullable dlq $$1) {
      if ($$1 == dlq.n) {
         this.c++;
      }

      int $$2 = this.c();
      if (ac.b() > this.e) {
         this.e += 500L;
         a.info(vg.a("menu.preparingSpawn", aup.a($$2, 0, 100)).getString());
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
      return aup.d((float)this.c * 100.0F / (float)this.b);
   }
}
