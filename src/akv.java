import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akv implements akt {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   public akv(int $$0) {
      int $$1 = $$0 * 2 + 1;
      this.b = $$1 * $$1;
   }

   @Override
   public void a(cot $$0) {
      this.e = ac.b();
      this.d = this.e;
   }

   @Override
   public void a(cot $$0, @Nullable dhb $$1) {
      if ($$1 == dhb.n) {
         this.c++;
      }

      int $$2 = this.c();
      if (ac.b() > this.e) {
         this.e += 500L;
         a.info(tf.a("menu.preparingSpawn", arp.a($$2, 0, 100)).getString());
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
      return arp.d((float)this.c * 100.0F / (float)this.b);
   }
}
