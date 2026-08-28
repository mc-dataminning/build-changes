import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqx implements aqv {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private aqx(int $$0) {
      this.b = $$0;
   }

   public static aqx b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aqx c(int $$0) {
      int $$1 = aqv.a($$0);
      return new aqx($$1 * $$1);
   }

   public static aqx c() {
      return new aqx(0);
   }

   @Override
   public void a(dbn $$0) {
      this.e = ac.c();
      this.d = this.e;
   }

   @Override
   public void a(dbn $$0, @Nullable dvi $$1) {
      if ($$1 == dvi.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ac.c() > this.e) {
         this.e += 500L;
         a.info(wu.a("menu.preparingSpawn", ayg.a($$2, 0, 100)).getString());
      }
   }

   @Override
   public void a() {
   }

   @Override
   public void b() {
      a.info("Time elapsed: {} ms", ac.c() - this.d);
      this.e = Long.MAX_VALUE;
   }

   public int d() {
      return this.b == 0 ? 100 : ayg.d((float)this.c * 100.0F / (float)this.b);
   }
}
