import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cib {
   private static final Logger a = LogUtils.getLogger();
   private final chk b;
   private final chu[] c = new chu[cia.c()];
   @Nullable
   private chu d;

   public cib(chk $$0) {
      this.b = $$0;
      this.a(cia.k);
   }

   public void a(cia<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cia<chu>)$$0);
         if (!this.b.dP().B) {
            this.b.ap().a(chk.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dP().B ? "client" : "server");
         this.d.d();
      }
   }

   public chu a() {
      return this.d;
   }

   public <T extends chu> T b(cia<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
