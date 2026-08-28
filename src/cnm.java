import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnm {
   private static final Logger a = LogUtils.getLogger();
   private final cmv b;
   private final cnf[] c = new cnf[cnl.c()];
   @Nullable
   private cnf d;

   public cnm(cmv $$0) {
      this.b = $$0;
      this.a(cnl.k);
   }

   public void a(cnl<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((cnl<cnf>)$$0);
         if (!this.b.dV().C) {
            this.b.ar().a(cmv.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public cnf a() {
      return this.d;
   }

   public <T extends cnf> T b(cnl<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
