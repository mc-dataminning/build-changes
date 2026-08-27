import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfv {
   private static final Logger a = LogUtils.getLogger();
   private final cfe b;
   private final cfo[] c = new cfo[cfu.c()];
   @Nullable
   private cfo d;

   public cfv(cfe $$0) {
      this.b = $$0;
      this.a(cfu.k);
   }

   public void a(cfu<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cfu<cfo>)$$0);
         if (!this.b.dM().B) {
            this.b.an().a(cfe.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public cfo a() {
      return this.d;
   }

   public <T extends cfo> T b(cfu<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
