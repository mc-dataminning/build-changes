import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bzq {
   private static final Logger a = LogUtils.getLogger();
   private final byz b;
   private final bzj[] c = new bzj[bzp.c()];
   @Nullable
   private bzj d;

   public bzq(byz $$0) {
      this.b = $$0;
      this.a(bzp.k);
   }

   public void a(bzp<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((bzp<bzj>)$$0);
         if (!this.b.dL().B) {
            this.b.al().b(byz.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dL().B ? "client" : "server");
         this.d.d();
      }
   }

   public bzj a() {
      return this.d;
   }

   public <T extends bzj> T b(bzp<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
