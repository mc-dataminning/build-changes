import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ars implements arq {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private ars(int $$0) {
      this.b = $$0;
   }

   public static ars b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static ars c(int $$0) {
      int $$1 = arq.a($$0);
      return new ars($$1 * $$1);
   }

   public static ars c() {
      return new ars(0);
   }

   @Override
   public void a(ddm $$0) {
      this.e = ad.c();
      this.d = this.e;
   }

   @Override
   public void a(ddm $$0, @Nullable dxl $$1) {
      if ($$1 == dxl.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ad.c() > this.e) {
         this.e += 500L;
         a.info(xd.a("menu.preparingSpawn", azd.a($$2, 0, 100)).getString());
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
      return this.b == 0 ? 100 : azd.d((float)this.c * 100.0F / (float)this.b);
   }
}
