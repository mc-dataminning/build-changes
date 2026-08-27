import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgg {
   private static final Logger a = LogUtils.getLogger();
   private final cfp b;
   private final cfz[] c = new cfz[cgf.c()];
   @Nullable
   private cfz d;

   public cgg(cfp $$0) {
      this.b = $$0;
      this.a(cgf.k);
   }

   public void a(cgf<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cgf<cfz>)$$0);
         if (!this.b.dN().B) {
            this.b.an().a(cfp.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dN().B ? "client" : "server");
         this.d.d();
      }
   }

   public cfz a() {
      return this.d;
   }

   public <T extends cfz> T b(cgf<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
