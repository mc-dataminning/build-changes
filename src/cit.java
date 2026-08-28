import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cit {
   private static final Logger a = LogUtils.getLogger();
   private final cic b;
   private final cim[] c = new cim[cis.c()];
   @Nullable
   private cim d;

   public cit(cic $$0) {
      this.b = $$0;
      this.a(cis.k);
   }

   public void a(cis<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cis<cim>)$$0);
         if (!this.b.dP().B) {
            this.b.ap().a(cic.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dP().B ? "client" : "server");
         this.d.d();
      }
   }

   public cim a() {
      return this.d;
   }

   public <T extends cim> T b(cis<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
