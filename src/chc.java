import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chc {
   private static final Logger a = LogUtils.getLogger();
   private final cgl b;
   private final cgv[] c = new cgv[chb.c()];
   @Nullable
   private cgv d;

   public chc(cgl $$0) {
      this.b = $$0;
      this.a(chb.k);
   }

   public void a(chb<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((chb<cgv>)$$0);
         if (!this.b.dN().B) {
            this.b.an().a(cgl.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dN().B ? "client" : "server");
         this.d.d();
      }
   }

   public cgv a() {
      return this.d;
   }

   public <T extends cgv> T b(chb<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
