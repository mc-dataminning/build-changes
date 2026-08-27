import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdd {
   private static final Logger a = LogUtils.getLogger();
   private final ccm b;
   private final ccw[] c = new ccw[cdc.c()];
   @Nullable
   private ccw d;

   public cdd(ccm $$0) {
      this.b = $$0;
      this.a(cdc.k);
   }

   public void a(cdc<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cdc<ccw>)$$0);
         if (!this.b.dM().B) {
            this.b.an().b(ccm.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public ccw a() {
      return this.d;
   }

   public <T extends ccw> T b(cdc<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
