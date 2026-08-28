import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clx {
   private static final Logger a = LogUtils.getLogger();
   private final clg b;
   private final clq[] c = new clq[clw.c()];
   @Nullable
   private clq d;

   public clx(clg $$0) {
      this.b = $$0;
      this.a(clw.k);
   }

   public void a(clw<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((clw<clq>)$$0);
         if (!this.b.dV().C) {
            this.b.au().a(clg.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public clq a() {
      return this.d;
   }

   public <T extends clq> T b(clw<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
