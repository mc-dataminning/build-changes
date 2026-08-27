import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bzq extends bzo {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private ejz d;
   private int e;

   public bzq(bzm $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gc().a(cac.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gc().a(cac.a);
      } else {
         double $$0 = this.d.c(this.a.ds(), this.a.du(), this.a.dy());
         if ($$0 < 100.0 || $$0 > 22500.0 || this.a.P || this.a.Q) {
            this.e++;
         }
      }
   }

   @Override
   public void d() {
      this.d = null;
      this.e = 0;
   }

   public void a(ejz $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public ejz g() {
      return this.d;
   }

   @Override
   public cac<bzq> i() {
      return cac.i;
   }
}
