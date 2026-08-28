import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjj {
   private static final Logger a = LogUtils.getLogger();
   private final cis b;
   private final cjc[] c = new cjc[cji.c()];
   @Nullable
   private cjc d;

   public cjj(cis $$0) {
      this.b = $$0;
      this.a(cji.k);
   }

   public void a(cji<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cji<cjc>)$$0);
         if (!this.b.dS().B) {
            this.b.at().a(cis.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dS().B ? "client" : "server");
         this.d.d();
      }
   }

   public cjc a() {
      return this.d;
   }

   public <T extends cjc> T b(cji<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
