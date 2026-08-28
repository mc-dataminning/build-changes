import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjw extends cju {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private ezr d;
   private int e;

   public cjw(cjs $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gs().a(cki.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gs().a(cki.a);
      } else {
         double $$0 = this.d.c(this.a.dD(), this.a.dF(), this.a.dJ());
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

   public void a(ezr $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public ezr g() {
      return this.d;
   }

   @Override
   public cki<cjw> i() {
      return cki.i;
   }
}
