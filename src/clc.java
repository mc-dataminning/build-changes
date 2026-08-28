import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clc {
   private static final Logger a = LogUtils.getLogger();
   private final ckl b;
   private final ckv[] c = new ckv[clb.c()];
   @Nullable
   private ckv d;

   public clc(ckl $$0) {
      this.b = $$0;
      this.a(clb.k);
   }

   public void a(clb<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((clb<ckv>)$$0);
         if (!this.b.dW().C) {
            this.b.au().a(ckl.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dW().C ? "client" : "server");
         this.d.c();
      }
   }

   public ckv a() {
      return this.d;
   }

   public <T extends ckv> T b(clb<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
