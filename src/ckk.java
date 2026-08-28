import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckk {
   private static final Logger a = LogUtils.getLogger();
   private final cjt b;
   private final ckd[] c = new ckd[ckj.c()];
   @Nullable
   private ckd d;

   public ckk(cjt $$0) {
      this.b = $$0;
      this.a(ckj.k);
   }

   public void a(ckj<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((ckj<ckd>)$$0);
         if (!this.b.dW().C) {
            this.b.au().a(cjt.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dW().C ? "client" : "server");
         this.d.c();
      }
   }

   public ckd a() {
      return this.d;
   }

   public <T extends ckd> T b(ckj<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
