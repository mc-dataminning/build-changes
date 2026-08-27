import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfo {
   private static final Logger a = LogUtils.getLogger();
   private final cex b;
   private final cfh[] c = new cfh[cfn.c()];
   @Nullable
   private cfh d;

   public cfo(cex $$0) {
      this.b = $$0;
      this.a(cfn.k);
   }

   public void a(cfn<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cfn<cfh>)$$0);
         if (!this.b.dM().B) {
            this.b.an().a(cex.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public cfh a() {
      return this.d;
   }

   public <T extends cfh> T b(cfn<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
