import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arz implements arx {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private arz(int $$0) {
      this.b = $$0;
   }

   public static arz b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static arz c(int $$0) {
      int $$1 = arx.a($$0);
      return new arz($$1 * $$1);
   }

   public static arz c() {
      return new arz(0);
   }

   @Override
   public void a(dgw $$0) {
      this.e = af.c();
      this.d = this.e;
   }

   @Override
   public void a(dgw $$0, @Nullable ebk $$1) {
      if ($$1 == ebk.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (af.c() > this.e) {
         this.e += 500L;
         a.info(wv.a("menu.preparingSpawn", azk.a($$2, 0, 100)).getString());
      }
   }

   @Override
   public void a() {
   }

   @Override
   public void b() {
      a.info("Time elapsed: {} ms", af.c() - this.d);
      this.e = Long.MAX_VALUE;
   }

   public int d() {
      return this.b == 0 ? 100 : azk.d((float)this.c * 100.0F / (float)this.b);
   }
}
