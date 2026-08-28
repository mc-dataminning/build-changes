import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class asg implements ase {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private asg(int $$0) {
      this.b = $$0;
   }

   public static asg b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static asg c(int $$0) {
      int $$1 = ase.a($$0);
      return new asg($$1 * $$1);
   }

   public static asg c() {
      return new asg(0);
   }

   @Override
   public void a(dje $$0) {
      this.e = ag.c();
      this.d = this.e;
   }

   @Override
   public void a(dje $$0, @Nullable eee $$1) {
      if ($$1 == eee.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ag.c() > this.e) {
         this.e += 500L;
         a.info(xc.a("menu.preparingSpawn", azq.a($$2, 0, 100)).getString());
      }
   }

   @Override
   public void a() {
   }

   @Override
   public void b() {
      a.info("Time elapsed: {} ms", ag.c() - this.d);
      this.e = Long.MAX_VALUE;
   }

   public int d() {
      return this.b == 0 ? 100 : azq.d((float)this.c * 100.0F / (float)this.b);
   }
}
