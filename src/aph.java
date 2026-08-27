import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aph implements apf {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private aph(int $$0) {
      this.b = $$0;
   }

   public static aph b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aph c(int $$0) {
      int $$1 = apf.a($$0);
      return new aph($$1 * $$1);
   }

   public static aph c() {
      return new aph(0);
   }

   @Override
   public void a(cuy $$0) {
      this.e = ac.b();
      this.d = this.e;
   }

   @Override
   public void a(cuy $$0, @Nullable dnk $$1) {
      if ($$1 == dnk.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ac.b() > this.e) {
         this.e += 500L;
         a.info(vq.a("menu.preparingSpawn", awi.a($$2, 0, 100)).getString());
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
      return this.b == 0 ? 100 : awi.d((float)this.c * 100.0F / (float)this.b);
   }
}
