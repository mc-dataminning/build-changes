import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ciu {
   private static final Logger a = LogUtils.getLogger();
   private final cid b;
   private final cin[] c = new cin[cit.c()];
   @Nullable
   private cin d;

   public ciu(cid $$0) {
      this.b = $$0;
      this.a(cit.k);
   }

   public void a(cit<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cit<cin>)$$0);
         if (!this.b.dP().B) {
            this.b.ap().a(cid.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dP().B ? "client" : "server");
         this.d.d();
      }
   }

   public cin a() {
      return this.d;
   }

   public <T extends cin> T b(cit<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
