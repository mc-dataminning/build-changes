import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqs implements aqq {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private aqs(int $$0) {
      this.b = $$0;
   }

   public static aqs b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aqs c(int $$0) {
      int $$1 = aqq.a($$0);
      return new aqs($$1 * $$1);
   }

   public static aqs c() {
      return new aqs(0);
   }

   @Override
   public void a(czk $$0) {
      this.e = ac.b();
      this.d = this.e;
   }

   @Override
   public void a(czk $$0, @Nullable dtc $$1) {
      if ($$1 == dtc.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ac.b() > this.e) {
         this.e += 500L;
         a.info(wu.a("menu.preparingSpawn", axz.a($$2, 0, 100)).getString());
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

   public int d() {
      return this.b == 0 ? 100 : axz.d((float)this.c * 100.0F / (float)this.b);
   }
}
