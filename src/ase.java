import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ase implements asc {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private ase(int $$0) {
      this.b = $$0;
   }

   public static ase b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static ase c(int $$0) {
      int $$1 = asc.a($$0);
      return new ase($$1 * $$1);
   }

   public static ase c() {
      return new ase(0);
   }

   @Override
   public void a(djc $$0) {
      this.e = ag.c();
      this.d = this.e;
   }

   @Override
   public void a(djc $$0, @Nullable eec $$1) {
      if ($$1 == eec.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ag.c() > this.e) {
         this.e += 500L;
         a.info(xa.a("menu.preparingSpawn", azo.a($$2, 0, 100)).getString());
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
      return this.b == 0 ? 100 : azo.d((float)this.c * 100.0F / (float)this.b);
   }
}
