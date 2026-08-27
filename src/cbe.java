import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbe {
   private static final Logger a = LogUtils.getLogger();
   private final can b;
   private final cax[] c = new cax[cbd.c()];
   @Nullable
   private cax d;

   public cbe(can $$0) {
      this.b = $$0;
      this.a(cbd.k);
   }

   public void a(cbd<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cbd<cax>)$$0);
         if (!this.b.dM().B) {
            this.b.an().b(can.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public cax a() {
      return this.d;
   }

   public <T extends cax> T b(cbd<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
