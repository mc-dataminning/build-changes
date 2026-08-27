import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxq {
   private static final Logger a = LogUtils.getLogger();
   private final bwz b;
   private final bxj[] c = new bxj[bxp.c()];
   @Nullable
   private bxj d;

   public bxq(bwz $$0) {
      this.b = $$0;
      this.a(bxp.k);
   }

   public void a(bxp<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((bxp<bxj>)$$0);
         if (!this.b.dK().B) {
            this.b.al().b(bwz.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dK().B ? "client" : "server");
         this.d.d();
      }
   }

   public bxj a() {
      return this.d;
   }

   public <T extends bxj> T b(bxp<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
