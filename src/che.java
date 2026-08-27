import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class che extends chc {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private ewu d;
   private int e;

   public che(cha $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gv().a(chq.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gv().a(chq.a);
      } else {
         double $$0 = this.d.c(this.a.dz(), this.a.dB(), this.a.dF());
         if ($$0 < 100.0 || $$0 > 22500.0 || this.a.R || this.a.S) {
            this.e++;
         }
      }
   }

   @Override
   public void d() {
      this.d = null;
      this.e = 0;
   }

   public void a(ewu $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public ewu g() {
      return this.d;
   }

   @Override
   public chq<che> i() {
      return chq.i;
   }
}
