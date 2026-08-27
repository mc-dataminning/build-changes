import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class caz {
   private static final Logger a = LogUtils.getLogger();
   private final cai b;
   private final cas[] c = new cas[cay.c()];
   @Nullable
   private cas d;

   public caz(cai $$0) {
      this.b = $$0;
      this.a(cay.k);
   }

   public void a(cay<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cay<cas>)$$0);
         if (!this.b.dM().B) {
            this.b.an().b(cai.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public cas a() {
      return this.d;
   }

   public <T extends cas> T b(cay<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
