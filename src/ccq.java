import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ccq extends cco {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private ens d;
   private int e;

   public ccq(ccm $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gd().a(cdc.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gd().a(cdc.a);
      } else {
         double $$0 = this.d.c(this.a.dr(), this.a.dt(), this.a.dx());
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

   public void a(ens $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public ens g() {
      return this.d;
   }

   @Override
   public cdc<ccq> i() {
      return cdc.i;
   }
}
