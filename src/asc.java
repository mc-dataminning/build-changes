import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class asc implements asa {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private asc(int $$0) {
      this.b = $$0;
   }

   public static asc b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static asc c(int $$0) {
      int $$1 = asa.a($$0);
      return new asc($$1 * $$1);
   }

   public static asc c() {
      return new asc(0);
   }

   @Override
   public void a(dir $$0) {
      this.e = ag.c();
      this.d = this.e;
   }

   @Override
   public void a(dir $$0, @Nullable edr $$1) {
      if ($$1 == edr.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ag.c() > this.e) {
         this.e += 500L;
         a.info(wy.a("menu.preparingSpawn", azm.a($$2, 0, 100)).getString());
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
      return this.b == 0 ? 100 : azm.d((float)this.c * 100.0F / (float)this.b);
   }
}
