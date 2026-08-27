import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdh {
   private static final Logger a = LogUtils.getLogger();
   private final ccq b;
   private final cda[] c = new cda[cdg.c()];
   @Nullable
   private cda d;

   public cdh(ccq $$0) {
      this.b = $$0;
      this.a(cdg.k);
   }

   public void a(cdg<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cdg<cda>)$$0);
         if (!this.b.dM().B) {
            this.b.an().b(ccq.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public cda a() {
      return this.d;
   }

   public <T extends cda> T b(cdg<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
