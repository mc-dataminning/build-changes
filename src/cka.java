import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cka {
   private static final Logger a = LogUtils.getLogger();
   private final cjj b;
   private final cjt[] c = new cjt[cjz.c()];
   @Nullable
   private cjt d;

   public cka(cjj $$0) {
      this.b = $$0;
      this.a(cjz.k);
   }

   public void a(cjz<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cjz<cjt>)$$0);
         if (!this.b.dX().C) {
            this.b.av().a(cjj.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dX().C ? "client" : "server");
         this.d.d();
      }
   }

   public cjt a() {
      return this.d;
   }

   public <T extends cjt> T b(cjz<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
