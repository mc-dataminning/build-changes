import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class apq implements apo {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private apq(int $$0) {
      this.b = $$0;
   }

   public static apq b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static apq c(int $$0) {
      int $$1 = apo.a($$0);
      return new apq($$1 * $$1);
   }

   public static apq c() {
      return new apq(0);
   }

   @Override
   public void a(cwg $$0) {
      this.e = ac.b();
      this.d = this.e;
   }

   @Override
   public void a(cwg $$0, @Nullable dpa $$1) {
      if ($$1 == dpa.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ac.b() > this.e) {
         this.e += 500L;
         a.info(vu.a("menu.preparingSpawn", aww.a($$2, 0, 100)).getString());
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
      return this.b == 0 ? 100 : aww.d((float)this.c * 100.0F / (float)this.b);
   }
}
