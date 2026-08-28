import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cir {
   private static final Logger a = LogUtils.getLogger();
   private final cia b;
   private final cik[] c = new cik[ciq.c()];
   @Nullable
   private cik d;

   public cir(cia $$0) {
      this.b = $$0;
      this.a(ciq.k);
   }

   public void a(ciq<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((ciq<cik>)$$0);
         if (!this.b.dP().B) {
            this.b.ar().a(cia.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dP().B ? "client" : "server");
         this.d.d();
      }
   }

   public cik a() {
      return this.d;
   }

   public <T extends cik> T b(ciq<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
