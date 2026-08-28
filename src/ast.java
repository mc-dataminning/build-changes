import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ast implements asr {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private ast(int $$0) {
      this.b = $$0;
   }

   public static ast b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static ast c(int $$0) {
      int $$1 = asr.a($$0);
      return new ast($$1 * $$1);
   }

   public static ast c() {
      return new ast(0);
   }

   @Override
   public void a(dgn $$0) {
      this.e = ae.c();
      this.d = this.e;
   }

   @Override
   public void a(dgn $$0, @Nullable eaq $$1) {
      if ($$1 == eaq.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ae.c() > this.e) {
         this.e += 500L;
         a.info(xv.a("menu.preparingSpawn", bae.a($$2, 0, 100)).getString());
      }
   }

   @Override
   public void a() {
   }

   @Override
   public void b() {
      a.info("Time elapsed: {} ms", ae.c() - this.d);
      this.e = Long.MAX_VALUE;
   }

   public int d() {
      return this.b == 0 ? 100 : bae.d((float)this.c * 100.0F / (float)this.b);
   }
}
