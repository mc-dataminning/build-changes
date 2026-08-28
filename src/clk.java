import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clk {
   private static final Logger a = LogUtils.getLogger();
   private final ckt b;
   private final cld[] c = new cld[clj.c()];
   @Nullable
   private cld d;

   public clk(ckt $$0) {
      this.b = $$0;
      this.a(clj.k);
   }

   public void a(clj<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((clj<cld>)$$0);
         if (!this.b.dW().C) {
            this.b.au().a(ckt.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dW().C ? "client" : "server");
         this.d.c();
      }
   }

   public cld a() {
      return this.d;
   }

   public <T extends cld> T b(clj<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
