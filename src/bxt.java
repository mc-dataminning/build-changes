import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxt {
   private static final Logger a = LogUtils.getLogger();
   private final bxc b;
   private final bxm[] c = new bxm[bxs.c()];
   @Nullable
   private bxm d;

   public bxt(bxc $$0) {
      this.b = $$0;
      this.a(bxs.k);
   }

   public void a(bxs<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((bxs<bxm>)$$0);
         if (!this.b.dK().B) {
            this.b.al().b(bxc.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dK().B ? "client" : "server");
         this.d.d();
      }
   }

   public bxm a() {
      return this.d;
   }

   public <T extends bxm> T b(bxs<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
