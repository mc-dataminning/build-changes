import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjo {
   private static final Logger a = LogUtils.getLogger();
   private final cix b;
   private final cjh[] c = new cjh[cjn.c()];
   @Nullable
   private cjh d;

   public cjo(cix $$0) {
      this.b = $$0;
      this.a(cjn.k);
   }

   public void a(cjn<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cjn<cjh>)$$0);
         if (!this.b.dS().B) {
            this.b.at().a(cix.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dS().B ? "client" : "server");
         this.d.d();
      }
   }

   public cjh a() {
      return this.d;
   }

   public <T extends cjh> T b(cjn<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
