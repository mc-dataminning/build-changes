import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmz extends cmx {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private ffq d;
   private int e;

   public cmz(cmv $$0) {
      super($$0);
   }

   @Override
   public void a(ars $$0) {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.t().a(cnl.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.t().a(cnl.a);
      } else {
         double $$1 = this.d.c(this.a.dA(), this.a.dC(), this.a.dG());
         if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
            this.e++;
         }
      }
   }

   @Override
   public void c() {
      this.d = null;
      this.e = 0;
   }

   public void a(ffq $$0) {
      this.d = $$0;
   }

   @Override
   public float e() {
      return 3.0F;
   }

   @Nullable
   @Override
   public ffq f() {
      return this.d;
   }

   @Override
   public cnl<cmz> h() {
      return cnl.i;
   }
}
