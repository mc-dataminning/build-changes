import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chr extends chp {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private ewf d;
   private int e;

   public chr(chn $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gl().a(cid.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gl().a(cid.a);
      } else {
         double $$0 = this.d.c(this.a.dv(), this.a.dx(), this.a.dB());
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

   public void a(ewf $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public ewf g() {
      return this.d;
   }

   @Override
   public cid<chr> i() {
      return cid.i;
   }
}
