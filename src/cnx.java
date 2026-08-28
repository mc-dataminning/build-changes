import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnx {
   private static final Logger a = LogUtils.getLogger();
   private final cng b;
   private final cnq[] c = new cnq[cnw.c()];
   @Nullable
   private cnq d;

   public cnx(cng $$0) {
      this.b = $$0;
      this.a(cnw.k);
   }

   public void a(cnw<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((cnw<cnq>)$$0);
         if (!this.b.dV().C) {
            this.b.ar().a(cng.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public cnq a() {
      return this.d;
   }

   public <T extends cnq> T b(cnw<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
