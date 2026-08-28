import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjy extends cjw {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private fba d;
   private int e;

   public cjy(cju $$0) {
      super($$0);
   }

   @Override
   public void a(arc $$0) {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gl().a(ckk.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gl().a(ckk.a);
      } else {
         double $$1 = this.d.c(this.a.dB(), this.a.dD(), this.a.dH());
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

   public void a(fba $$0) {
      this.d = $$0;
   }

   @Override
   public float e() {
      return 3.0F;
   }

   @Nullable
   @Override
   public fba f() {
      return this.d;
   }

   @Override
   public ckk<cjy> h() {
      return ckk.i;
   }
}
