import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cad {
   private static final Logger a = LogUtils.getLogger();
   private final bzm b;
   private final bzw[] c = new bzw[cac.c()];
   @Nullable
   private bzw d;

   public cad(bzm $$0) {
      this.b = $$0;
      this.a(cac.k);
   }

   public void a(cac<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cac<bzw>)$$0);
         if (!this.b.dN().B) {
            this.b.an().b(bzm.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dN().B ? "client" : "server");
         this.d.d();
      }
   }

   public bzw a() {
      return this.d;
   }

   public <T extends bzw> T b(cac<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
