import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class car extends cap {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private els d;
   private int e;

   public car(can $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gb().a(cbd.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gb().a(cbd.a);
      } else {
         double $$0 = this.d.c(this.a.dr(), this.a.dt(), this.a.dx());
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

   public void a(els $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public els g() {
      return this.d;
   }

   @Override
   public cbd<car> i() {
      return cbd.i;
   }
}
