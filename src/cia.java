import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cia extends chy {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private evm d;
   private int e;

   public cia(chw $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gn().a(cim.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gn().a(cim.a);
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

   public void a(evm $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public evm g() {
      return this.d;
   }

   @Override
   public cim<cia> i() {
      return cim.i;
   }
}
