import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmr {
   private static final Logger a = LogUtils.getLogger();
   private final cma b;
   private final cmk[] c = new cmk[cmq.c()];
   @Nullable
   private cmk d;

   public cmr(cma $$0) {
      this.b = $$0;
      this.a(cmq.k);
   }

   public void a(cmq<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((cmq<cmk>)$$0);
         if (!this.b.dV().C) {
            this.b.au().a(cma.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public cmk a() {
      return this.d;
   }

   public <T extends cmk> T b(cmq<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
