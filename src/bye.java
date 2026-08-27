import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bye {
   private static final Logger a = LogUtils.getLogger();
   private final bxn b;
   private final bxx[] c = new bxx[byd.c()];
   @Nullable
   private bxx d;

   public bye(bxn $$0) {
      this.b = $$0;
      this.a(byd.k);
   }

   public void a(byd<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((byd<bxx>)$$0);
         if (!this.b.dL().B) {
            this.b.al().b(bxn.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dL().B ? "client" : "server");
         this.d.d();
      }
   }

   public bxx a() {
      return this.d;
   }

   public <T extends bxx> T b(byd<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
