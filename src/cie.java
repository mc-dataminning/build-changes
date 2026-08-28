import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cie extends cic {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private exa d;
   private int e;

   public cie(cia $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gi().a(ciq.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gi().a(ciq.a);
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

   public void a(exa $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public exa g() {
      return this.d;
   }

   @Override
   public ciq<cie> i() {
      return ciq.i;
   }
}
