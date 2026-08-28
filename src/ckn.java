import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckn {
   private static final Logger a = LogUtils.getLogger();
   private final cjw b;
   private final ckg[] c = new ckg[ckm.c()];
   @Nullable
   private ckg d;

   public ckn(cjw $$0) {
      this.b = $$0;
      this.a(ckm.k);
   }

   public void a(ckm<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((ckm<ckg>)$$0);
         if (!this.b.dV().C) {
            this.b.au().a(cjw.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public ckg a() {
      return this.d;
   }

   public <T extends ckg> T b(ckm<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
