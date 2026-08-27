import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbm {
   private static final Logger a = LogUtils.getLogger();
   private final cav b;
   private final cbf[] c = new cbf[cbl.c()];
   @Nullable
   private cbf d;

   public cbm(cav $$0) {
      this.b = $$0;
      this.a(cbl.k);
   }

   public void a(cbl<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cbl<cbf>)$$0);
         if (!this.b.dL().B) {
            this.b.an().b(cav.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dL().B ? "client" : "server");
         this.d.d();
      }
   }

   public cbf a() {
      return this.d;
   }

   public <T extends cbf> T b(cbl<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
