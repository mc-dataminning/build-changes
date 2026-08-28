import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chs extends chq {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private ewh d;
   private int e;

   public chs(cho $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gk().a(cie.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gk().a(cie.a);
      } else {
         double $$0 = this.d.c(this.a.dw(), this.a.dy(), this.a.dC());
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

   public void a(ewh $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public ewh g() {
      return this.d;
   }

   @Override
   public cie<chs> i() {
      return cie.i;
   }
}
