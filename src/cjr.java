import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjr {
   private static final Logger a = LogUtils.getLogger();
   private final cja b;
   private final cjk[] c = new cjk[cjq.c()];
   @Nullable
   private cjk d;

   public cjr(cja $$0) {
      this.b = $$0;
      this.a(cjq.k);
   }

   public void a(cjq<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cjq<cjk>)$$0);
         if (!this.b.dS().B) {
            this.b.at().a(cja.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dS().B ? "client" : "server");
         this.d.d();
      }
   }

   public cjk a() {
      return this.d;
   }

   public <T extends cjk> T b(cjq<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
