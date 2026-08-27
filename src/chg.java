import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chg extends che {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private eum d;
   private int e;

   public chg(chc $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gm().a(chs.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gm().a(chs.a);
      } else {
         double $$0 = this.d.c(this.a.du(), this.a.dw(), this.a.dA());
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

   public void a(eum $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public eum g() {
      return this.d;
   }

   @Override
   public chs<chg> i() {
      return chs.i;
   }
}
