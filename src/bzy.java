import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bzy {
   private static final Logger a = LogUtils.getLogger();
   private final bzh b;
   private final bzr[] c = new bzr[bzx.c()];
   @Nullable
   private bzr d;

   public bzy(bzh $$0) {
      this.b = $$0;
      this.a(bzx.k);
   }

   public void a(bzx<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((bzx<bzr>)$$0);
         if (!this.b.dN().B) {
            this.b.an().b(bzh.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dN().B ? "client" : "server");
         this.d.d();
      }
   }

   public bzr a() {
      return this.d;
   }

   public <T extends bzr> T b(bzx<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
