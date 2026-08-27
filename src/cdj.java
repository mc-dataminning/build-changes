import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdj extends cdh {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private eov d;
   private int e;

   public cdj(cdf $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gi().a(cdv.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gi().a(cdv.a);
      } else {
         double $$0 = this.d.c(this.a.do(), this.a.dq(), this.a.du());
         if ($$0 < 100.0 || $$0 > 22500.0 || this.a.O || this.a.P) {
            this.e++;
         }
      }
   }

   @Override
   public void d() {
      this.d = null;
      this.e = 0;
   }

   public void a(eov $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public eov g() {
      return this.d;
   }

   @Override
   public cdv<cdj> i() {
      return cdv.i;
   }
}
