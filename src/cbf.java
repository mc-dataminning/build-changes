import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbf {
   private static final Logger a = LogUtils.getLogger();
   private final cao b;
   private final cay[] c = new cay[cbe.c()];
   @Nullable
   private cay d;

   public cbf(cao $$0) {
      this.b = $$0;
      this.a(cbe.k);
   }

   public void a(cbe<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cbe<cay>)$$0);
         if (!this.b.dM().B) {
            this.b.an().b(cao.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public cay a() {
      return this.d;
   }

   public <T extends cay> T b(cbe<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
