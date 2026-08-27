import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bya {
   private static final Logger a = LogUtils.getLogger();
   private final bxj b;
   private final bxt[] c = new bxt[bxz.c()];
   @Nullable
   private bxt d;

   public bya(bxj $$0) {
      this.b = $$0;
      this.a(bxz.k);
   }

   public void a(bxz<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((bxz<bxt>)$$0);
         if (!this.b.dL().B) {
            this.b.al().b(bxj.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dL().B ? "client" : "server");
         this.d.d();
      }
   }

   public bxt a() {
      return this.d;
   }

   public <T extends bxt> T b(bxz<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
