import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmh {
   private static final Logger a = LogUtils.getLogger();
   private final clq b;
   private final cma[] c = new cma[cmg.c()];
   @Nullable
   private cma d;

   public cmh(clq $$0) {
      this.b = $$0;
      this.a(cmg.k);
   }

   public void a(cmg<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((cmg<cma>)$$0);
         if (!this.b.dV().C) {
            this.b.au().a(clq.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public cma a() {
      return this.d;
   }

   public <T extends cma> T b(cmg<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
