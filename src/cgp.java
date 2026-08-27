import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgp extends cgn {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private etp d;
   private int e;

   public cgp(cgl $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gm().a(chb.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gm().a(chb.a);
      } else {
         double $$0 = this.d.c(this.a.ds(), this.a.du(), this.a.dy());
         if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
            this.e++;
         }
      }
   }

   @Override
   public void d() {
      this.d = null;
      this.e = 0;
   }

   public void a(etp $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public etp g() {
      return this.d;
   }

   @Override
   public chb<cgp> i() {
      return chb.i;
   }
}
