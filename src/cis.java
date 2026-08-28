import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cis {
   private static final Logger a = LogUtils.getLogger();
   private final cib b;
   private final cil[] c = new cil[cir.c()];
   @Nullable
   private cil d;

   public cis(cib $$0) {
      this.b = $$0;
      this.a(cir.k);
   }

   public void a(cir<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cir<cil>)$$0);
         if (!this.b.dP().B) {
            this.b.ap().a(cib.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dP().B ? "client" : "server");
         this.d.d();
      }
   }

   public cil a() {
      return this.d;
   }

   public <T extends cil> T b(cir<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
