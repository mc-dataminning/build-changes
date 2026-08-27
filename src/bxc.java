import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxc extends bxa {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private ehf d;
   private int e;

   public bxc(bwy $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.fW().a(bxo.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.fW().a(bxo.a);
      } else {
         double $$0 = this.d.c(this.a.dp(), this.a.dr(), this.a.dv());
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

   public void a(ehf $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public ehf g() {
      return this.d;
   }

   @Override
   public bxo<bxc> i() {
      return bxo.i;
   }
}
