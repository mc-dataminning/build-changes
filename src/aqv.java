import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqv implements aqt {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private aqv(int $$0) {
      this.b = $$0;
   }

   public static aqv b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aqv c(int $$0) {
      int $$1 = aqt.a($$0);
      return new aqv($$1 * $$1);
   }

   public static aqv c() {
      return new aqv(0);
   }

   @Override
   public void a(dbk $$0) {
      this.e = ac.c();
      this.d = this.e;
   }

   @Override
   public void a(dbk $$0, @Nullable dvc $$1) {
      if ($$1 == dvc.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ac.c() > this.e) {
         this.e += 500L;
         a.info(wu.a("menu.preparingSpawn", aye.a($$2, 0, 100)).getString());
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
      return this.b == 0 ? 100 : aye.d((float)this.c * 100.0F / (float)this.b);
   }
}
