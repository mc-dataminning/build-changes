import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxp {
   private static final Logger a = LogUtils.getLogger();
   private final bwy b;
   private final bxi[] c = new bxi[bxo.c()];
   @Nullable
   private bxi d;

   public bxp(bwy $$0) {
      this.b = $$0;
      this.a(bxo.k);
   }

   public void a(bxo<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((bxo<bxi>)$$0);
         if (!this.b.dK().B) {
            this.b.al().b(bwy.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dK().B ? "client" : "server");
         this.d.d();
      }
   }

   public bxi a() {
      return this.d;
   }

   public <T extends bxi> T b(bxo<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
