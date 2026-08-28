import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmn {
   private static final Logger a = LogUtils.getLogger();
   private final clw b;
   private final cmg[] c = new cmg[cmm.c()];
   @Nullable
   private cmg d;

   public cmn(clw $$0) {
      this.b = $$0;
      this.a(cmm.k);
   }

   public void a(cmm<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((cmm<cmg>)$$0);
         if (!this.b.dV().C) {
            this.b.au().a(clw.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public cmg a() {
      return this.d;
   }

   public <T extends cmg> T b(cmm<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
