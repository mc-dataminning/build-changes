import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cll {
   private static final Logger a = LogUtils.getLogger();
   private final cku b;
   private final cle[] c = new cle[clk.c()];
   @Nullable
   private cle d;

   public cll(cku $$0) {
      this.b = $$0;
      this.a(clk.k);
   }

   public void a(clk<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((clk<cle>)$$0);
         if (!this.b.dW().C) {
            this.b.au().a(cku.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dW().C ? "client" : "server");
         this.d.c();
      }
   }

   public cle a() {
      return this.d;
   }

   public <T extends cle> T b(clk<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
