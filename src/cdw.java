import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdw {
   private static final Logger a = LogUtils.getLogger();
   private final cdf b;
   private final cdp[] c = new cdp[cdv.c()];
   @Nullable
   private cdp d;

   public cdw(cdf $$0) {
      this.b = $$0;
      this.a(cdv.k);
   }

   public void a(cdv<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cdv<cdp>)$$0);
         if (!this.b.dJ().B) {
            this.b.an().b(cdf.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dJ().B ? "client" : "server");
         this.d.d();
      }
   }

   public cdp a() {
      return this.d;
   }

   public <T extends cdp> T b(cdv<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
