import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cin {
   private static final Logger a = LogUtils.getLogger();
   private final chw b;
   private final cig[] c = new cig[cim.c()];
   @Nullable
   private cig d;

   public cin(chw $$0) {
      this.b = $$0;
      this.a(cim.k);
   }

   public void a(cim<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cim<cig>)$$0);
         if (!this.b.dP().B) {
            this.b.ap().a(chw.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dP().B ? "client" : "server");
         this.d.d();
      }
   }

   public cig a() {
      return this.d;
   }

   public <T extends cig> T b(cim<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
