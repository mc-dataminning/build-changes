import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cap {
   private static final Logger a = LogUtils.getLogger();
   private final bzy b;
   private final cai[] c = new cai[cao.c()];
   @Nullable
   private cai d;

   public cap(bzy $$0) {
      this.b = $$0;
      this.a(cao.k);
   }

   public void a(cao<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cao<cai>)$$0);
         if (!this.b.dM().B) {
            this.b.an().b(bzy.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public cai a() {
      return this.d;
   }

   public <T extends cai> T b(cao<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
