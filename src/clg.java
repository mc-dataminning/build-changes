import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clg {
   private static final Logger a = LogUtils.getLogger();
   private final ckp b;
   private final ckz[] c = new ckz[clf.c()];
   @Nullable
   private ckz d;

   public clg(ckp $$0) {
      this.b = $$0;
      this.a(clf.k);
   }

   public void a(clf<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((clf<ckz>)$$0);
         if (!this.b.dV().C) {
            this.b.au().a(ckp.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public ckz a() {
      return this.d;
   }

   public <T extends ckz> T b(clf<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
