import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bzb {
   private static final Logger a = LogUtils.getLogger();
   private final byk b;
   private final byu[] c = new byu[bza.c()];
   @Nullable
   private byu d;

   public bzb(byk $$0) {
      this.b = $$0;
      this.a(bza.k);
   }

   public void a(bza<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((bza<byu>)$$0);
         if (!this.b.dL().B) {
            this.b.al().b(byk.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dL().B ? "client" : "server");
         this.d.d();
      }
   }

   public byu a() {
      return this.d;
   }

   public <T extends byu> T b(bza<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
