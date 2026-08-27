import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ceo {
   private static final Logger a = LogUtils.getLogger();
   private final cdx b;
   private final ceh[] c = new ceh[cen.c()];
   @Nullable
   private ceh d;

   public ceo(cdx $$0) {
      this.b = $$0;
      this.a(cen.k);
   }

   public void a(cen<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cen<ceh>)$$0);
         if (!this.b.dM().B) {
            this.b.an().a(cdx.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public ceh a() {
      return this.d;
   }

   public <T extends ceh> T b(cen<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
