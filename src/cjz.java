import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjz extends cjx {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private ezy d;
   private int e;

   public cjz(cjv $$0) {
      super($$0);
   }

   @Override
   public void a(arp $$0) {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gj().a(ckl.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gj().a(ckl.a);
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

   public void a(ezy $$0) {
      this.d = $$0;
   }

   @Override
   public float e() {
      return 3.0F;
   }

   @Nullable
   @Override
   public ezy f() {
      return this.d;
   }

   @Override
   public ckl<cjz> h() {
      return ckl.i;
   }
}
