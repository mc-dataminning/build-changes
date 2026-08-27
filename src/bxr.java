import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxr {
   private static final Logger a = LogUtils.getLogger();
   private final bxa b;
   private final bxk[] c = new bxk[bxq.c()];
   @Nullable
   private bxk d;

   public bxr(bxa $$0) {
      this.b = $$0;
      this.a(bxq.k);
   }

   public void a(bxq<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((bxq<bxk>)$$0);
         if (!this.b.dK().B) {
            this.b.al().b(bxa.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dK().B ? "client" : "server");
         this.d.d();
      }
   }

   public bxk a() {
      return this.d;
   }

   public <T extends bxk> T b(bxq<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
