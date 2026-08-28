import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cie {
   private static final Logger a = LogUtils.getLogger();
   private final chn b;
   private final chx[] c = new chx[cid.c()];
   @Nullable
   private chx d;

   public cie(chn $$0) {
      this.b = $$0;
      this.a(cid.k);
   }

   public void a(cid<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cid<chx>)$$0);
         if (!this.b.dQ().B) {
            this.b.aq().a(chn.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dQ().B ? "client" : "server");
         this.d.d();
      }
   }

   public chx a() {
      return this.d;
   }

   public <T extends chx> T b(cid<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
