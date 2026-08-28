import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckf {
   private static final Logger a = LogUtils.getLogger();
   private final cjo b;
   private final cjy[] c = new cjy[cke.c()];
   @Nullable
   private cjy d;

   public ckf(cjo $$0) {
      this.b = $$0;
      this.a(cke.k);
   }

   public void a(cke<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cke<cjy>)$$0);
         if (!this.b.dX().C) {
            this.b.aw().a(cjo.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dX().C ? "client" : "server");
         this.d.d();
      }
   }

   public cjy a() {
      return this.d;
   }

   public <T extends cjy> T b(cke<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
