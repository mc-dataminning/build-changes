import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckm {
   private static final Logger a = LogUtils.getLogger();
   private final cjv b;
   private final ckf[] c = new ckf[ckl.c()];
   @Nullable
   private ckf d;

   public ckm(cjv $$0) {
      this.b = $$0;
      this.a(ckl.k);
   }

   public void a(ckl<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((ckl<ckf>)$$0);
         if (!this.b.dV().C) {
            this.b.au().a(cjv.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public ckf a() {
      return this.d;
   }

   public <T extends ckf> T b(ckl<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
