import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnb {
   private static final Logger a = LogUtils.getLogger();
   private final cmk b;
   private final cmu[] c = new cmu[cna.c()];
   @Nullable
   private cmu d;

   public cnb(cmk $$0) {
      this.b = $$0;
      this.a(cna.k);
   }

   public void a(cna<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((cna<cmu>)$$0);
         if (!this.b.dU().C) {
            this.b.ar().a(cmk.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dU().C ? "client" : "server");
         this.d.c();
      }
   }

   public cmu a() {
      return this.d;
   }

   public <T extends cmu> T b(cna<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
