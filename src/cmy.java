import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmy {
   private static final Logger a = LogUtils.getLogger();
   private final cmh b;
   private final cmr[] c = new cmr[cmx.c()];
   @Nullable
   private cmr d;

   public cmy(cmh $$0) {
      this.b = $$0;
      this.a(cmx.k);
   }

   public void a(cmx<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((cmx<cmr>)$$0);
         if (!this.b.dU().C) {
            this.b.ar().a(cmh.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dU().C ? "client" : "server");
         this.d.c();
      }
   }

   public cmr a() {
      return this.d;
   }

   public <T extends cmr> T b(cmx<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
